package com.one.learn.lombok.bean;

import lombok.*;

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
@EqualsAndHashCode
public class User4 {
    @EqualsAndHashCode.Exclude
    private Integer id;
    @EqualsAndHashCode.Include
    private String username;
    @EqualsAndHashCode.Exclude
    private String password;
}
