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

        // ���ǳ�����һ��
        // 1. ʹ��Properties�࣬���Զ�д�����ļ�
        Properties properties = new Properties();
        properties.load(new FileInputStream("E:\\ComputerScience\\Learn\\Java\\Reflection\\src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println(classfullpath);
        System.out.println(method);

        // 2. �������󣬴�ͳ�ķ������в�ͨ =���������
        // new classfullpath();

        // 3. ʹ�÷�����ƽ��
        // (1)����
    }
}
