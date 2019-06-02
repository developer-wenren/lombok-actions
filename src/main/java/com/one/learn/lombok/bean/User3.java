package com.one.learn.lombok.bean;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 用户2
 *
 * @author One
 * @date 2019/06/01
 */
@RequiredArgsConstructor
public class User3 {
    private Integer id;
    private final String username;
    @NonNull
    private String password;

    public static void main(String[] args) {
        User3 user3 = new User3("user3", "zxc123");
    }
}
