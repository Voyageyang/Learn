package com.kuang.lesson02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo02 {
    public static void main(String[] args) throws Exception {
        // 1. ����������
        ServerSocket serverSocket = new ServerSocket(9800);

        // 2. �����ͻ���
        Socket accept = serverSocket.accept();

        // 3. ��ȡ������
        InputStream inputStream = accept.getInputStream();

        // 4. �ļ����
        FileOutputStream fileOutputStream = new FileOutputStream(new File("receive.png"));
        byte[] bytes = new byte[1024];
        int readCount;
        while((readCount = inputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, readCount);
        }

        // 5. ֪ͨ�ͻ����ҽ��������
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("�ҽ�������ˣ�����ԶϿ���".getBytes());

        // 6. �ر���Դ
        serverSocket.close();
        accept.close();
        inputStream.close();
        fileOutputStream.close();

    }
}
