package com.patterns.patterns04.exercise01;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/16 0016
 * <br/> time：15:05
 * <br/> now：星期五
 * <br/> description：<br/>
 * <p>
 * 策略模式：
 *  策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换。
 *  因为结果都是一样，就看效率了。
 *  就是有几个算法(就是几个实现)，算出来都等于 23，？？？？
 */
interface ICalculator {
    // 计算，参数是：计算的表达式。
    public int calculate(String exp);
}
// 辅助类：
abstract class AbstractCalculator {
    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
// 三个实现类：
class Plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}

class Minus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }

}

class Multiply extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\*");
        return arrayInt[0]*arrayInt[1];
    }
}
// Test
public class strategy12 {
    public static void main(String[] args) {
//        外部用户只需要决定用哪个算法即可。
        String exp = "2+8";
        // 一个体系当中的，某个具体？？？
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
