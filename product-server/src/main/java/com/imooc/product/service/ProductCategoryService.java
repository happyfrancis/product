package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;

import java.util.Collection;
import java.util.List;

public interface ProductCategoryService {

    List<ProductCategory> findByCategoryTypeIn(Collection<Integer> categoryTypes);
}
