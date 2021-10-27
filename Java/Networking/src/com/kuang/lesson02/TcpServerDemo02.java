package com.kuang.lesson02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo02 {
    public static void main(String[] args) throws Exception {
        // 1. 创建服务器
        ServerSocket serverSocket = new ServerSocket(9800);

        // 2. 监听客户端
        Socket accept = serverSocket.accept();

        // 3. 获取输入流
        InputStream inputStream = accept.getInputStream();

        // 4. 文件输出
        FileOutputStream fileOutputStream = new FileOutputStream(new File("receive.png"));
        byte[] bytes = new byte[1024];
        int readCount;
        while((readCount = inputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, readCount);
        }

        // 5. 通知客户端我接收完毕了
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("我接收完毕了，你可以断开了".getBytes());

        // 6. 关闭资源
        serverSocket.close();
        accept.close();
        inputStream.close();
        fileOutputStream.close();

    }
}
