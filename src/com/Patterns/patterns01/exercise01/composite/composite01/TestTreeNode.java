package com.Patterns.patterns01.exercise01.composite.composite01;

import java.util.Enumeration;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/23/ 15:40 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>
 *
 *
 *  组合模式 就是部分与整体 关系。
 *
 *
 *  组合模式使得用户对单个对象和组合对象的使用具有一致性,<br/>
 *  例：<br/>
 *      首先，一张卡可以在总部，分店，加盟店使用，那么总部可以刷卡，分店也可以刷卡，加盟店也可以刷卡，这个属性结构的店面层级关系就明确啦。
        那么，总店刷卡消费与分店刷卡消费是一样的道理，那么总店与分店对会员卡的使用也具有一致性。


    组合
        叶子下面是没有节点了。
        组合的结构，它整体的一个组成部分。


    什么时候使用组合模式：
    1、当发现需求中是体现部分与整体层次结构时。
    2、你希望用户可以忽略组合对象与单个对象的不同
    3、统一地使用组合结构中的所有对象时
<BR>
 *
 *
 *          composite(组合)  Component(成分)，它们是聚合关系
 *
 *   合成：a对象引用b对象，a对象销毁了b对象也会跟着被销毁掉掉。它生命周期一样的，如：人与人的四肢关系，房子与房间关系。

 *   聚合：与合成相反。聚合用来表示“拥有”关系或者整体与部分的关系，如：班级和学生，班级销毁了学生还是在的。
 *
 *          先考虑使用，合成关系，不行在考虑，聚合关系，在不行在考虑，继承关系
 *
 *   合成和聚合都是【关联】的特殊种类
 *
 *
 *   依赖：depend
 *      依赖是类与类之间的连接，表示一个类依赖于另外一个类的定义。依赖关系仅仅描述了类与类之间的一种使用与被使用的关系
 *      在Java中体现为局部变量、方法的参数或者是对静态方法的调用。
 *   关联：relevance
 *      关联是类与类之间的连结。关联关系使一个类知道另外一个类的属性和方法。关联可以是双向的，也可以是单向的。
 *      体现在Java中，关联关系是通过成员变量来实现的。
 *
 */
public class TestTreeNode {
    private TreeNode root = null;

    public TestTreeNode(String name) {
        root = new TreeNode(name);
    }
    public TreeNode getRoot() {
        return root;
    }
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public static void main(String[] args) {
        // 设置 root
        TestTreeNode tree = new TestTreeNode("A");

        // 准备 node
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        TreeNode nodeE = new TreeNode("E");

        // 为 root 添加 子node
        tree.root.add(nodeB);
        tree.root.add(nodeC);
        tree.root.add(nodeD);
        tree.root.add(nodeE);

        // 为子node添加子node
        nodeB.add(nodeC);


        // node name  parent  children ,node 增 删 查 改
        TreeNode root1 = tree.getRoot();


        // node 增 删 查
        // 改
        nodeB.setName("b1");
        // 删
//        root1.remove(nodeB);


        // name
        System.out.println(root1.getName());

        // children
        Enumeration<TreeNode> nodes =tree.root.getChildren();
//        if (nodes.hasMoreElements()) {
//            System.out.println(nodes.nextElement().getName());
//        }
        while (nodes.hasMoreElements()) {
            System.out.println(nodes.nextElement().getName());
        }


        // parent
        nodeB.setParent(root1); // 为什么不能直接获取它的父node ,必须要设置下了。
        System.out.println("parent parent:" + nodeB.getParent().getName());








        // 节点的节点在 增 删 查 改

    }
}
