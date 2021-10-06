package za.ac.nwu.ac.web.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.logic.service.*;

@ResponseBody
@RestController
@RequestMapping("/member/")
public class MemberController {

    private AddService add;
    private DeleteService delete;
    private ViewService view;

    @GetMapping(path = "/hello")
    public String getMessage() {
        return "Hello boot";
    }

    @PutMapping(path = "/add/{miles}")
    public AccountType addMiles(@RequestBody AccountType member, @PathVariable(name = "miles") Long miles) {
        return add.saveMiles(member, miles);
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
