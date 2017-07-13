package com.javaSE04.Exception.enum05;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/22 2:04
 * <br/>
 * 枚举还没有看完。
 */
public class SwitchNumeTest {

    // 枚举 用在 switch case 当中。你只能传递这几个 参数。传递其它从语法上就不让你传，传递 null 了。
    public static String getSeason(Enum1 s) {
        switch (s) {
            case WINXX:
                return "spring";
            case AUTUMN:
                return "sutun";
            case SPRING:
                return "spring";
            case SUMMER:
                return "summer";
            default:
                return "default";
        }
    }

    public static void main(String[] args) {
        //System.out.println(getSeason(Enum1.WINXX));
        // 直接报 NullPointerException
        //System.out.println(getSeason(null));


        // 获取 枚举里面的 成员变量。
        Serson spring = Serson.WINXX;
        System.out.println(spring.getName());

    }
}
