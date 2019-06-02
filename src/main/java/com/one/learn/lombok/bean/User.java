package com.one.learn.lombok.bean;

import lombok.*;

/**
 * 用户
 *
 * @author One
 * @date 2019/06/01
 */
@Getter
@Setter
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;

    public User(Integer id, @NonNull String username, @NonNull String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
