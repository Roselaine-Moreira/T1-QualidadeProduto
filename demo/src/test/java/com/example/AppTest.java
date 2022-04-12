package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest{

    @Test
    public void test(){
        assertEquals(40, App.soma(30, 10));
    }

    @Test
    public void test2(){
        assertEquals(-20, App.soma(-30, 10));
    }

    @Test
    public void test3(){
        assertEquals(0, App.soma(0, 0));
    }
}