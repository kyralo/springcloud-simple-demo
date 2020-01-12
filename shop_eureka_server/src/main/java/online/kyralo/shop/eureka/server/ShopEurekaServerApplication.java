package online.kyralo.shop.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * \* Created with Intellij IDEA.
 * \* @author: WangChen
 * \* Date: 2020-01-11
 * \* Time: 20:06
 * \* Year: 2020
 * \
 */

@SpringBootApplication
@EnableEurekaServer
public class ShopEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopEurekaServerApplication.class, args);
    }
}
