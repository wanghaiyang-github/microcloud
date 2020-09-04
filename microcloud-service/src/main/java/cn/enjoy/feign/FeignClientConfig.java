package cn.enjoy.feign;

import com.sun.net.httpserver.BasicAuthenticator;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wanghaiyang
 * @date 2020/9/3 22:55
 */
@Configuration
public class FeignClientConfig {

    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("admin", "enjoy");
    }

}
