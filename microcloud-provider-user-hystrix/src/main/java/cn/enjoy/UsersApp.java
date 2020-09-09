package cn.enjoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wanghaiyang
 * @date 2020/9/9 22:36
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
public class UsersApp {
    public static void main(String[] args) {
        SpringApplication.run(UsersApp.class, args);
    }
}
