package com.one.learn.lombok.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用户2
 *
 * @author One
 * @date 2019/06/01
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class User2 {
    @ToString.Exclude
    private Integer id;
    @ToString.Include
    private String username;
    @ToString.Include
    private String password;
}
