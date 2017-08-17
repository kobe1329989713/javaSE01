package com.Patterns.patterns08.facade;

/**
 * Created by kobe on 2017/8/17.18:03
 * <br/>
 * Description:
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup() {
        System.out.println("start the computer");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished!");
    }

    public void shutdown() {
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
    }
}
