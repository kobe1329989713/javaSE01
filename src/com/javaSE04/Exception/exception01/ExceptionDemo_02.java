package com.javaSE04.Exception.exception01;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/20 0:10
 * <br/>
 * 见名知意？？？
 */
public class ExceptionDemo_02 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 0;
        int[] nums = {1, 2, 3};

        try {
            System.out.println(num1 / num2);
            System.out.println(nums[3]);

            // 它会一个个的匹配下去的。
            // 多个异常的匹配处理。 如果想一个 catch(){} 解决异常名写它们的父就好 Exception。
        } catch (ArithmeticException e) { // 算术异常。
            // catch 里面至少要有它
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) { // 数组越界的异常。
            e.printStackTrace();
        } catch (Exception e) { // 它能防止，你没有捕获到的异常
            System.out.println("这个Exception放在最后是可以的，不能放在它的子异常前。");
        } finally {
            System.out.println("这里面的代码一定会执行的。");
            // 就像 if()else().... 这种样。
        }
        // 就算出错了，至少不会影响到它的执行。
        System.out.println("Hello");

        // 它还可以这样。
        //catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
    }
}
