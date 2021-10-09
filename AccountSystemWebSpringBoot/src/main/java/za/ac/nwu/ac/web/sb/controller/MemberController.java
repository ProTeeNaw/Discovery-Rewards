package za.ac.nwu.ac.web.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.logic.service.*;

@RestController
@RequestMapping("/member")
public class MemberController {

    //@Autowired
    private AddService add;

    private DeleteService delete;
    private ViewService view;

    //Test if the member controller is working with the /hello mapping
    @GetMapping(path = "/hello")
    public String getMessage() {
        return "Hello boot";
    }

    @GetMapping(path = "/add/{member_id}/{miles}")
    public String addMiles(@PathVariable(name = "member_id") Long member_id, @PathVariable(name = "miles") Long miles) {
        add.addMiles(member_id, miles);

        return "We are done";
    }

    @PutMapping(path = "/subtract/{miles}")
    public AccountType subtractMiles(@RequestBody AccountType member, @PathVariable(name = "miles") Long miles) {
        return delete.deleteMiles(member, miles);
    }

    /*@GetMapping("/getall")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }*/

    @GetMapping(path = "/view/{memberId}")
    public AccountType viewMiles(@RequestBody AccountType member,@PathVariable(name = "memberId") Long memberId) {
        return view.viewMiles(member, memberId);
    }
}
