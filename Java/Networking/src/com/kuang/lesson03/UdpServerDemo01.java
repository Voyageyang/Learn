package com.kuang.lesson03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServerDemo01 {
    public static void main(String[] args) throws Exception {
        // ����socket��������
        DatagramSocket socket = new DatagramSocket(9090);

        // ���
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length);

        // ���հ�
        socket.receive(packet);

        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(new String(packet.getData()));

        // close
        socket.close();
    }
}
