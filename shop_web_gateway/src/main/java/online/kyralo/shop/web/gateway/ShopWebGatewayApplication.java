package online.kyralo.shop.web.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * \* Created with Intellij IDEA.
 * \* @author: WangChen
 * \* Date: 2020-01-13
 * \* Time: 14:57
 * \* Year: 2020
 * \
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ShopWebGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopWebGatewayApplication.class, args);
    }
}
