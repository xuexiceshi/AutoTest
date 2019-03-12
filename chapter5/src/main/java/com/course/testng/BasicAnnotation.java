package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void TestCase1(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例1");
    }
    @Test
    public void TestCase2(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是BeforeMethod测试方法前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这是AfterMethod测试方法后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这是类运行之前胡方法，有多个Methon");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是类运行之后的方法，有多个Methon");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite这是测试套件,可以包含多个类Class");
    }
@AfterSuite
    public void afterSuite(){
        System.out.println("afterSuit这是测试套件，可以包含多个类Class");
    }
}
