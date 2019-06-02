package com.one.learn.lombok.bean;

import lombok.Builder;
import lombok.Data;

/**
 * 用户2
 *
 * @author One
 * @date 2019/06/01
 */
@Data
@Builder
public class User6 {
    private Integer id;
    private String username;
    private String password;
}
