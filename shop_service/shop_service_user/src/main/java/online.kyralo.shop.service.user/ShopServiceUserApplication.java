package online.kyralo.shop.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * \* Created with Intellij IDEA.
 * \* @author: WangChen
 * \* Date: 2020-01-11
 * \* Time: 18:34
 * \* Year: 2020
 * \
 */

@SpringBootApplication
@EnableEurekaClient
public class ShopServiceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopServiceUserApplication.class, args);
    }
}
