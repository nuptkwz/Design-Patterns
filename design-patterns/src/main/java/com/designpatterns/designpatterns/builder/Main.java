package com.designpatterns.designpatterns.builder;

/**
 * Description
 * 建造者模式(类似于Lombok里面的builder、MyBatis中的SqlSessionFactoryBuilder)
 * <p>
 * 分离复杂对象的构建和表示
 * 同样的构建过程可以创建不同的表示
 * 无需记忆，自然使用
 * Date 2020/7/29 22:36
 * Created by kwz
 */
public class Main {
    public static void main(String[] args) {
        //可以灵活指定需要build的参数
        Person person = new Person.PersonBuilder()
                .basicInfo(1, "zhangsan", 22)
                .score(96)
                .weight(66)
                .loc("aa", "22")
                .build();

        System.out.println(person);
    }
}
