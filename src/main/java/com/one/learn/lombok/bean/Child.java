package com.one.learn.lombok.bean;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class Child extends Parent {
    private String childName;
}