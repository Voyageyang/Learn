package com.kuang.lesson02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// 客户端
public class TcpClientDemo01 {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        OutputStream os = null;
        try {
            // 1. 要知道服务器地址
            InetAddress serverIp = InetAddress.getByName("localhost");
            int port = 9999;
            // 2.创建连接
            socket = new Socket(serverIp, port);
            // 3.发生消息 IO流
            os = socket.getOutputStream();
            os.write("你好，世界".getBytes());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                os.close();
            }
            if (socket != null) {
                socket.close();
            }
        }


    }
}
