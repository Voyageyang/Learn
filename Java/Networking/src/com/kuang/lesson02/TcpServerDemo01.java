package com.kuang.lesson02;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 服务端
public class TcpServerDemo01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;

        // 1. 我得有一个地址
        try {
            serverSocket = new ServerSocket(9999);
            // 2. 等待客户端连接过来
            accept = serverSocket.accept();
            // 3. 读取客户端消息
            is =  accept.getInputStream();

            // 管道流
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            System.out.println(baos.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (baos != null) {
                baos.close();
            }
            if (is != null) {
                is.close();
            }
            if (accept != null) {
                accept.close();
            }
            if(serverSocket != null) {
                serverSocket.close();
            }
        }
    }
}
