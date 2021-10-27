package com.kuang.lesson02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo02 {
    public static void main(String[] args) throws Exception {
        // 1. 创建一个socket连接
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9800);

        // 2. 创建一个输出流
        OutputStream outputStream = socket.getOutputStream();

        // 3. 读取文件
        FileInputStream fileInputStream = new FileInputStream(new File("aa.png"));

        // 4. 写文件
        byte[] bytes = new byte[1024];
        int readCount;
        while((readCount = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, readCount);
        }

        // 5. 通知服务器，我已写入完毕
        socket.shutdownOutput(); // 我已经传输完了

        // 6. 确定服务器接收完毕，才可以断开链接
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes1 = new byte[1024];
        int readCount1;
        while((readCount1 = inputStream.read(bytes1)) != -1) {
            baos.write(bytes1, 0, readCount1);
        }
        System.out.println(baos.toString());


        // close
        socket.close();
        outputStream.close();
        fileInputStream.close();
    }
}
