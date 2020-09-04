package cn.enjoy;

import cn.xiangxue.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wanghaiyang
 * @date 2020/8/20 22:58
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("cn.enjoy.service")
public class ConsumerAppFeign {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerAppFeign.class,args);
    }
}
