package com.kuang.lesson03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClientDemo01 {
    public static void main(String[] args) throws Exception {
        // 创建socket
        DatagramSocket socket = new DatagramSocket();

        // 建包
        String msg = "你好，接收端";
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, localhost, port);

        // 发包
        socket.send(packet);

        // close
        socket.close();
    }
}
