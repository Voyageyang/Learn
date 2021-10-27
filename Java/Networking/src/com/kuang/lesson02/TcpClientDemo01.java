package com.kuang.lesson02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// �ͻ���
public class TcpClientDemo01 {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        OutputStream os = null;
        try {
            // 1. Ҫ֪����������ַ
            InetAddress serverIp = InetAddress.getByName("localhost");
            int port = 9999;
            // 2.��������
            socket = new Socket(serverIp, port);
            // 3.������Ϣ IO��
            os = socket.getOutputStream();
            os.write("��ã�����".getBytes());
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
