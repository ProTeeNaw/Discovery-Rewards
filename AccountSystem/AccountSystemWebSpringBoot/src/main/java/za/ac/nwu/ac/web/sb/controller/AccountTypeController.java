/*

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.domain.service.GeneralResponse;

@RestController
@RequestMapping("account-type")
public class AccountTypeController {

    @GetMapping("/all")
    @ApiOperation(value = "Get all the accounts", notes= "Returns accounts")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = GeneralResponse.class),

            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal server error", response = GeneralResponse.class)
    })

    public ResponseEntity<GeneralResponse<String>> getAll()
    {
        GeneralResponse<String> response = new GeneralResponse<>(true, "No types found");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
*/
package za.ac.nwu.ac.web.sb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountTypeController {

    @RequestMapping(method = RequestMethod.GET, value = "/api/test")
    public String sayHello() {
        return "Swagger Hello World";
    }
}