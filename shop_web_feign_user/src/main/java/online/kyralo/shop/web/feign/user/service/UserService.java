package online.kyralo.shop.web.feign.user.service;

import online.kyralo.shop.web.feign.user.service.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  @author wangchen
 *  服务提供者的name
 **/
@FeignClient(value = "shop-service-user", fallback = UserServiceHystrix.class   )
public interface UserService {

    /**
     * feign调用service方法
     * @param id id
     * @return message
     */
    @GetMapping("/shop/service/user/id")
    String findById(@RequestParam("id") String id);
}
