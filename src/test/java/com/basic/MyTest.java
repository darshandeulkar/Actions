package com.basic;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class MyTest {
    @Test
    public void test(){
        open("www.google.com");
    }
}
