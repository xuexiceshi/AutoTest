package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethond {
    @Test(groups = "sever")
    public void test1(){
        System.out.println("服务器端测试1111");
    }
@Test(groups = "sever")
    public void test2(){
        System.out.println("服务器端测试1112");
    }
@Test(groups = "client")
    public void test3(){
        System.out.println("客户端测试3332");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("客户端测试3331");
    }
@BeforeGroups("sever")
    public void beforeGroupsOnServer(){
        System.out.println("BeforeGroups这是服务器组运行之前的方法");
    }
@AfterGroups("sever")
    public void afterGroupsOnServer(){
        System.out.println("AfterGroups这是服务器组运行之后的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClientr(){
        System.out.println("BeforeGroups这是客户端组运行之前的方法");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("AfterGroups这是客户端组运行之后的方法");
    }
}
