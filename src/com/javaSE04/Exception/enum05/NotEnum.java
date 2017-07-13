package com.javaSE04.Exception.enum05;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/22 1:32
 * <br/>
    没有枚举 的类
 */

// 申明 枚举 类。
enum Gender{
    /**
     * 申明 Gender 枚举类，它只有这两个实例
     *
     * MALE 男
     * FEMALE 女。
     *
     */
    MALE,FEMALE;
}

public class NotEnum {

    //public static String getGender(char c){
    //    /**
    //     * 判断参数 必须是 f 或者是 m 都能继续往下面执行，不是的话直接抛异常。
    //     * 也可以枚举。
    //     * 也可以直接 else{} 里面处理
    //     * 但是
    //     * 它们都没有 【枚举】 处理的好。
    //     */
    //
    //    if (c == 'f') {
    //        return "女";
    //    } else if (c == 'm') {
    //        return "男";
    //    } else {
    //        return ""; // 这里可以加自定义异常。
    //    }
    //}


    /**
     * 改枚举版本。
     *
     * 你在传递参数时，就只能传递 哪两个实例老。因为它只有两个
     *
     * @param g 枚举实例
     * @return x
     */
    public static String getGender(Gender g){

            return "";
    }



    public static void main(String[] args) {
        /**
         * 你没法控制用户传递的参数，如果它传递的是一个 x 也是可以的，
         * 这种情况就可以用 【枚举】 了。
         */
        //System.out.println(NotEnum.getGender('m'));
    }
}
