package com.javaSE04.Exception.exception01;


/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/20 0:10
 * <br/>
 * 测试 自定义异常
 */
class MyExceptions extends MyException_04 {

}

class parent {

    public void m() throws MyException_04 {

    }
}

class Son extends parent {

    /**
     *  重写方法时，你不能比你父类 更坏了，
     *  所以你只能抛 你父类哪个方法抛出的异常的 子异常才行。？？？
     *
     */
    @Override
    public void m() throws MyException_04,MyExceptions {
        super.m();
    }
}

public class TestOverride_07 extends Exception {





}
