package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("这是GroupsOnClass3中的tea1111运行");
    }
    public void teacher2(){
        System.out.println("这是GroupsOnClass3中的tea2222运行");
    }
}

