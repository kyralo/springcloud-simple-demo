package online.kyralo.shop.web.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * \* Created with Intellij IDEA.
 * \* @author: WangChen
 * \* Date: 2020-01-12
 * \* Time: 0:56
 * \* Year: 2020
 * \
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ShopWebZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopWebZuulApplication.class, args);
    }
}
