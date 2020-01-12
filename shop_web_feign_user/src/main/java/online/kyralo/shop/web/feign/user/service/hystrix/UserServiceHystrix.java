package online.kyralo.shop.web.feign.user.service.hystrix;

import online.kyralo.shop.web.feign.user.service.UserService;
import org.springframework.stereotype.Component;

/**
 * \* Created with Intellij IDEA.
 * \* @author: WangChen
 * \* Date: 2020-01-12
 * \* Time: 0:09
 * \* Year: 2020
 * \* Description: TODO
 * \
 */

@Component
public class UserServiceHystrix implements UserService {
    @Override
    public String findById(String id) {
        return String.format("id: %s, but request bad.", id);
    }
}
