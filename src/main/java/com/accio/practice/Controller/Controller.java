package com.accio.practice.Controller;

import com.accio.practice.Model.Information;
import com.accio.practice.Service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/")
public class Controller {

    @Autowired
    private MyService myService;

    @GetMapping()
    public Information getUser(@RequestParam String email)
    {
       return myService.getUser(email);
    }
    @GetMapping("check")
    public String check()
    {
        return "working";
    }

    @PostMapping("register")
    public String registerUser(@RequestBody Information information)
    {
        myService.createUser(information);
        return "User registered Successfully";
    }
    @PutMapping("update")
    public String updateUser(@RequestBody Information information)
    {
        myService.updateUser(information);
        return "Updated Successfully";
    }

    @DeleteMapping("delete")
    public String deleteUser(@RequestParam String email)
    {
        myService.deleteUser(email);
        return "User Deleted Successfully";
    }
}
