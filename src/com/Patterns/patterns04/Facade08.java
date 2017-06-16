package com.Patterns.patterns04;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/16 0016
 * <br/> time：13:59
 * <br/> now：星期五
 * <br/> description：<br/>
 * <p>
 * 外观模式：
 *  外观模式是为了解决类与类之家的依赖关系的,
 *  降低了类类之间的耦合度.
 */
class CPU {
    public void startup(){
        System.out.println("启动CPU");
    }
    public void shutdown(){
        System.out.println("关闭CPU");
    }
}
class Memory{
    public void startup(){
        System.out.println("内存启动!");
    }
    public void shutdown(){
        System.out.println("内存关闭!");
    }
}
class Disk {
    public void startup(){
        System.out.println("磁盘启动");
    }
    public void shutdown(){
        System.out.println("磁盘关闭");
    }
}
public class Facade08 {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Facade08() { // 重点。
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("启动电脑");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("启动计算机完成");
    }

    public void shutdown(){
        System.out.println("开始关闭电脑");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("：电脑关闭!");
    }
}
//Test
class User {
    public static void main(String[] args) {
        Facade08 computer = new Facade08();
        computer.startup();
        computer.shutdown();
    }
}