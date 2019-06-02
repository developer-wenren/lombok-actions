package com.one.learn.lombok.bean;

import lombok.SneakyThrows;

import java.io.UnsupportedEncodingException;

/**
 * 示例 SneakyThrows
 *
 * @author One
 */
public class SneakyThrowsExample implements Runnable {
    @SneakyThrows(UnsupportedEncodingException.class)
    public String utf8ToString(byte[] bytes) {
        return new String(bytes, "UTF-8");
    }

    @Override
    @SneakyThrows
    public void run() {
        throw new Throwable();
    }
}