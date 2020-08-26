package cn.enjoy;

import cn.xiangxue.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author wanghaiyang
 * @date 2020/8/20 22:58
 */
@SpringBootApplication
@RibbonClient(name = "MICROCLOUD-PROVIDER-PRODUCT", configuration = RibbonConfig.class)
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class,args);
    }
}
