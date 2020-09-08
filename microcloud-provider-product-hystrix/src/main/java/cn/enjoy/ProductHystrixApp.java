package cn.enjoy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wanghaiyang
 * @date 2020/8/20 22:43
 */
@SpringBootApplication
@MapperScan("cn.enjoy.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ProductHystrixApp {
    public static void main(String[] args) {
        SpringApplication.run(ProductHystrixApp.class, args);
    }
}
