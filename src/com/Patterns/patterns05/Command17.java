package com.Patterns.patterns05;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/19 23:24
 * <br/>
 *
 *  命令模式
 *     命令模式很好理解，举个例子，司令员下令让士兵去干件事情，
 *     从整个事情的角度来考虑，司令员的作用是，发出口令，
 *     口令经过传递，传到了士兵耳朵里，士兵去执行。
 *     这个过程好在，三者相互解耦，任何一方都不用去依赖其他人，
 *     只需要做好自己的事儿就行，司令员要的是结果，
 *     不会去关注到底士兵是怎么实现的
 */
interface Command {
    public void exe();
}

class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}

class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
class Receiver {
    public void action(){
        System.out.println("command received!");
    }
}
public class Command17 {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
