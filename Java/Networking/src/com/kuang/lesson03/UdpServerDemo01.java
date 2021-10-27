package com.kuang.lesson03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServerDemo01 {
    public static void main(String[] args) throws Exception {
        // 创建socket建立连接
        DatagramSocket socket = new DatagramSocket(9090);

        // 拆包
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length);

        // 接收包
        socket.receive(packet);

        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(new String(packet.getData()));

        // close
        socket.close();
    }
}
