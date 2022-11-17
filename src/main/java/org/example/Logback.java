package org.example;

import com.xiuwei.service.Logger;

public class Logback implements Logger{
    @Override
    public void info(String s) {
        System.out.println("Logback info 的输出：" + s);
    }

    @Override
    public void debug(String s) {
        System.out.println("Logback debug 的输出：" + s);
    }
}