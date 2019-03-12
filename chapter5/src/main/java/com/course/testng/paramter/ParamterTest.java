package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
    @Test
//    使用XML进行参数化，数据在XML的Parameter标签中
    @Parameters({"name","age"})
    public void paramTest(String name,int age)
    {
        System.out.println("name=" + name + ";age=" + age);
    }
}
