/**
 * @program: product
 * @description:
 * @author: Francis
 * @create: 2018-04-13 16:02
 **/

package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg() {
        return "this is product msg";
    }

    @GetMapping("/msgCg")
    public String msgCg() {
        return "this is product msgCg";
    }

}
