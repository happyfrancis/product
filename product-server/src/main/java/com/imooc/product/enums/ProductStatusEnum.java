package com.imooc.product.enums;

import lombok.Getter;

/**
 * 商品上下架状态
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在线"),

    DOWN(1, "下架");

    private int code;

    private String message;

    private ProductStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }


}
