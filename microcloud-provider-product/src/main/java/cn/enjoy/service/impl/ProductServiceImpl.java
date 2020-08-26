package cn.enjoy.service.impl;

import cn.enjoy.mapper.ProductMapper;
import cn.enjoy.service.IProductService;
import cn.enjoy.vo.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wanghaiyang
 * @date 2020/8/20 22:41
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public Product get(long id) {
        return productMapper.findById(id);
    }

    @Override
    public boolean add(Product product) {
        return productMapper.create(product);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}

