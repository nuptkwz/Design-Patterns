package com.designpatterns.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Description 组合模式：针对树状格式
 * 任何递归都可以改成压栈
 * Date 2020/8/2 9:49
 * Created by kwz
 */
public class Main {

    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        LeafNode c11 = new LeafNode("c11");
        LeafNode c12 = new LeafNode("c12");
        BranchNode b21 = new BranchNode("selection21");
        LeafNode c211 = new LeafNode("c211");
        LeafNode c212 = new LeafNode("c212");

        root.add(chapter1);
        root.add(chapter2);
        chapter1.add(c11);
        chapter1.add(c12);
        chapter2.add(b21);
        b21.add(c211);
        b21.add(c212);

        tree(root, 0);
    }

    private static void tree(Node root, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }
        root.print();
        if (root instanceof BranchNode) {
            for (Node n : ((BranchNode) root).nodes) {
                tree(n, depth + 1);
            }
        }
    }


}

abstract class Node {
    abstract public void print();
}

class LeafNode extends Node {

    String content;

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}

class BranchNode extends Node {

    List<Node> nodes = new ArrayList<>();

    String name;

    public BranchNode(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public void add(Node node) {
        nodes.add(node);
    }
}