package online.kyralo.shop.web.ribbon.user.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * \* Created with Intellij IDEA.
 * \* @author: WangChen
 * \* Date: 2020-01-11
 * \* Time: 21:32
 * \* Year: 2020
 * \
 */

@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
