package com.javaSE.stream;

import java.util.Arrays;
import java.util.List;

/**
 * stream
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        // 将一个数组转换成 List 集合。 它就是一个数据源。
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        // 每一个集合里面都有这个方法。
        // 只要 偶数，一个过滤。
        //nums.stream().filter(n -> n%2==0).map(n -> n*2).forEach(System.out::println);
        // 这种就是 函数式编程 或者是 链式编程。
        System.out.println(nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(Integer::sum).get());
        // 它是先通过一个数据源产生一个 stream
        // 然后在通过各种操作来到达你的需求。
        // reduce() 方法是：你的什么都执行完了。调用它来 终止 操作，就可以打印结果了。
        // 必须要对 郎母表达式 狠熟悉才行。












    }
}
