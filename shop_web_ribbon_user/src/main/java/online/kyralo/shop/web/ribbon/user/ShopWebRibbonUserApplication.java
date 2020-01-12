package online.kyralo.shop.web.ribbon.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * \* Created with Intellij IDEA.
 * \* @author: WangChen
 * \* Date: 2020-01-11
 * \* Time: 21:16
 * \* Year: 2020
 * \
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class ShopWebRibbonUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopWebRibbonUserApplication.class, args);
    }
}
