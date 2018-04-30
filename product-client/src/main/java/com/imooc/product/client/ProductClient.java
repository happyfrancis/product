/**
 * @program: order
 * @description:
 * @author: Francis
 * @create: 2018-04-14 16:02
 **/

package com.imooc.product.client;

import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.common.ProductInfoOutput;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
@FeignClient(name = "product",fallback = ProductClient.ProductClientFallback.class) //fallback 指定服务降级的类
public interface ProductClient {

    @GetMapping("msgCg")
    String productMsgCg();

    @PostMapping("/product/listForOrder")
    List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList);

    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList);


    @Component
    public static class ProductClientFallback implements ProductClient{

        @Override
        public String productMsgCg() {
            return null;
        }

        //服务降级的方法 当访问ProductClient.listForOrder方法出现问题时  会触发这个方法
        @Override
        public List<ProductInfoOutput> listForOrder(List<String> productIdList) {
            return null;
        }

        @Override
        public void decreaseStock(List<DecreaseStockInput> decreaseStockInputList) {

        }
    }
}
