/**
 * @program: product
 * @description:
 * @author: Francis
 * @create: 2018-04-12 16:10
 **/

package com.imooc.product.service.impl;

import com.imooc.product.dataobject.ProductCategory;
import com.imooc.product.repository.ProductCategoryRepository;
import com.imooc.product.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(Collection<Integer> categoryTypes) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypes);
    }
}
