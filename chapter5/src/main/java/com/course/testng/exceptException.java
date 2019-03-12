package com.course.testng;

import org.testng.annotations.Test;

public class exceptException {
@Test(expectedExceptions =RuntimeException.class)
    public void runTimeExceptionFail(){
        System.out.println("这是异常测试用例");
    }

    @Test(expectedExceptions =RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是异常测试——成功");
        throw new RuntimeException();
    }
}
