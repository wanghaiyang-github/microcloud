package cn.enjoy.service;

import cn.enjoy.vo.Product;

import java.util.List;

/**
 * @author wanghaiyang
 * @date 2020/8/20 22:41
 */
public interface IProductService {
    Product get(long id);
    boolean add(Product product);
    List<Product> list();
}
