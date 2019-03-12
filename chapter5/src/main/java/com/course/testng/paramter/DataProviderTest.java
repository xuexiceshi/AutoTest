package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void dataProviderTest(String name,int age){
        System.out.println("name=" + name + ";age=" + age);
    }
//    将数据参数化到注解DataProvider中
@DataProvider(name="data")
    public Object[][] providerData(){
      Object[][] d=new  Object[][]{
              {"张",18},
              {"Lily",16},
              {"Tom",19}
      };
      return d;
    }
    @Test(dataProvider = "methond")
    public void Test1(String name,int age){
        System.out.println("Test111方法" + "name=" + name + ";age=" + age);
    }
    @Test(dataProvider = "methond")
    public void Test2(String name,int age){
        System.out.println("Test222方法" +"name=" + name + ";age=" + age);
    }
//    public Object[][] methondTest(Method method)中必须添加(Method method)，才能定位到上边的Test1方法名
@DataProvider(name = "methond")
    public Object[][] methondTest(Method method){
        Object[][] a=null;
        if (method.getName().equals("Test1")) {
            a=new  Object[][]{
                    {"张",18},
                    {"Lily",16}
            };
        }
        else if (method.getName().equals("Test2"))
    {
        a=new  Object[][]{
                {"王五",50},
                {"赵六",55}
        };
    }
    return a;
    }
}
