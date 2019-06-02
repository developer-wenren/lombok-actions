package com.one.learn.lombok.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author One
 */
@Getter
@Setter
@SuperBuilder
public class Parent {
    private int id;
    private String name;
}
