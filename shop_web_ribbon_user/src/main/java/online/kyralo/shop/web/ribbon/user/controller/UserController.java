package online.kyralo.shop.web.ribbon.user.controller;

import online.kyralo.shop.web.ribbon.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * \* Created with Intellij IDEA.
 * \* @author: WangChen
 * \* Date: 2020-01-11
 * \* Time: 21:55
 * \* Year: 2020
 * \
 */

@RestController
@RequestMapping("/shop/ribbon/user")
public class UserController {


    @Autowired
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") String id){
        return service.findById(id);
    }
}
