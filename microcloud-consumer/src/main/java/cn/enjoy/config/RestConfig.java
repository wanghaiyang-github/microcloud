package cn.enjoy.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * @author wanghaiyang
 * @date 2020/8/20 22:55
 */
@Configuration
public class RestConfig {
    @Bean
//    @LoadBalanced
    public RestTemplate restTemplate() {
        return  new RestTemplate();
    }

    @Bean
    public HttpHeaders getHeaders() { // 要进行一个Http头信息配置
        // 定义一个HTTP的头信息
        HttpHeaders headers = new HttpHeaders();
        // 认证的原始信息
        String auth = "admin:enjoy";
        // 进行一个加密的处理
        byte[] encodedAuth = Base64.getEncoder()
                .encode(auth.getBytes(Charset.forName("US-ASCII")));
        String authHeader = "Basic " + new String(encodedAuth);
        headers.set("Authorization", authHeader);
        return headers;
    }

    /*@Bean
    public IRule ribbonRule() { //IRule是所有规则的标准
        //随机访问策略
        return new com.netflix.loadbalancer.RandomRule();
    }*/
}

