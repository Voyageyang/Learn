package com.hspedu.reflection.question;

import com.hspedu.Cat;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReflectionQuestion {
    public static void main(String[] args) throws IOException {
        //
//        Cat cat = new Cat();
//        cat.hi();

        // 我们尝试做一做
        // 1. 使用Properties类，可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("E:\\ComputerScience\\Learn\\Java\\Reflection\\src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println(classfullpath);
        System.out.println(method);

        // 2. 创建对象，传统的方法，行不通 =》反射机制
        // new classfullpath();

        // 3. 使用反射机制解决
        // (1)加载
    }
}
