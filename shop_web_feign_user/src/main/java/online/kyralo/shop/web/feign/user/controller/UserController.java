package online.kyralo.shop.web.feign.user.controller;

import online.kyralo.shop.web.feign.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* Created with Intellij IDEA.
 * \* @author: WangChen
 * \* Date: 2020-01-11
 * \* Time: 23:35
 * \* Year: 2020
 * \
 */

@RestController
@RequestMapping("/shop/feign/user")
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
