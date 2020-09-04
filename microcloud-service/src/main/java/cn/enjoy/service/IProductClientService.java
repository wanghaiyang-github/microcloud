package cn.enjoy.service;

import cn.enjoy.feign.FeignClientConfig;
import cn.enjoy.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author wanghaiyang
 * @date 2020/9/3 22:57
 */
@FeignClient(name = "MICROCLOUD-PROVIDER-PRODUCT", configuration = FeignClientConfig.class)
public interface IProductClientService {
    @RequestMapping("/prodcut/get/{id}")
    public Product getProduct(@PathVariable("id")long id);

    @RequestMapping("/prodcut/list")
    public List<Product> listProduct() ;

    @RequestMapping("/prodcut/add")
    public boolean addPorduct(Product product) ;

}
