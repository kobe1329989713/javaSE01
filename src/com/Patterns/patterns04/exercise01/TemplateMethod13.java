package com.Patterns.patterns04.exercise01;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/16 0016
 * <br/> time：15:23
 * <br/> now：星期五
 * <br/> description：<br/>
 *
 * 模板方法模式：
 * 统计代码执行时间的。
 *      代码 startg
 *      方法() 抽象的，你要统计哪个你重写这个方法就好。
 *      计算，这个代码执行了多久。
 */

abstract class AbstractCalculator2 {

    /*主方法，实现对本类其它方法的调用*/
    public final int calculate(String exp,String opt){
        int array[] = split(exp,opt);
        return calculate(array[0],array[1]);
    }

    /*被子类重写的方法*/
    abstract public int calculate(int num1,int num2);

    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}

class Plus2 extends AbstractCalculator2 {
    @Override
    public int calculate(int num1,int num2) {
        return num1 + num2;
    }
}
// Test
public class TemplateMethod13 {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator2 cal = new Plus2();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
