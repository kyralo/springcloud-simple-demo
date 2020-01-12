package online.kyralo.shop.service.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * \* Created with Intellij IDEA.
 * \* @author: WangChen
 * \* Date: 2020-01-11
 * \* Time: 19:40
 * \* Year: 2020
 * \
 */

@RestController
@RequestMapping("/shop/service/user")
public class UserController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/id")
    public ResponseEntity<?> findById(@RequestParam("id") String id){
        return ResponseEntity.ok(String.format("id: %s, port: %s ", id, port));
    }

}
