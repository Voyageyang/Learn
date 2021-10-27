package com.kuang.lesson02;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

// �����
public class TcpServerDemo01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;

        // 1. �ҵ���һ����ַ
        try {
            serverSocket = new ServerSocket(9999);
            // 2. �ȴ��ͻ������ӹ���
            accept = serverSocket.accept();
            // 3. ��ȡ�ͻ�����Ϣ
            is =  accept.getInputStream();

            // �ܵ���
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
