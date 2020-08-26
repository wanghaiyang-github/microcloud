package cn.enjoy.mapper;

import cn.enjoy.vo.Product;

import java.util.List;

/**
 * @author wanghaiyang
 * @date 2020/8/20 22:37
 */
public interface ProductMapper {
    boolean create(Product product);
    public Product findById(Long id);
    public List<Product> findAll();

}
