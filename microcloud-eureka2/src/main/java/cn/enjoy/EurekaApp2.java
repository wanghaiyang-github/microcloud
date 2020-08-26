package cn.enjoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wanghaiyang
 * @date 2020/8/21 11:35
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp2.class,args);
    }
}
