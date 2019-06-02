package com.one.learn.lombok.bean;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import lombok.var;

/**
 * @author One
 * @date 2019/06/02
 */
@Slf4j
public class VarValExample {
    public static void main(String[] args) {
        val text = "abc";
//        text = "1";
        var num = 1;
        num = 2;
        log.info("text:{},num:{}", text, num);
    }
}
