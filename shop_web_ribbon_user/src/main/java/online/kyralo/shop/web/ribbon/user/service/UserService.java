package online.kyralo.shop.web.ribbon.user.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * \* Created with Intellij IDEA.
 * \* @author: WangChen
 * \* Date: 2020-01-11
 * \* Time: 21:39
 * \* Year: 2020
 * \
 */

@Service
public class UserService {
    @Autowired
    private RestTemplate restTemplate;

    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @HystrixCommand(fallbackMethod = "error")
    public String findById(String id){
        return restTemplate.getForObject("http://shop-service-user/shop/service/user/id?id=" + id, String.class);
    }

    public String error(String id){
        return String.format("id: %s, but request bad.", id);
    }
}
