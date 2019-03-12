package com.course.testng.moreThreads;

import org.testng.annotations.Test;

public class MoreThreadOnAnnotation {
//    使用注解进行多线程测试，应用简单并发
    @Test(invocationCount = 3,threadPoolSize = 3)
    public void test(){
        System.out.println("打印1111");
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
}
