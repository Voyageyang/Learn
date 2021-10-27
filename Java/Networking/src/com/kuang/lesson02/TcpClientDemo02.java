package com.kuang.lesson02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo02 {
    public static void main(String[] args) throws Exception {
        // 1. ����һ��socket����
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9800);

        // 2. ����һ�������
        OutputStream outputStream = socket.getOutputStream();

        // 3. ��ȡ�ļ�
        FileInputStream fileInputStream = new FileInputStream(new File("aa.png"));

        // 4. д�ļ�
        byte[] bytes = new byte[1024];
        int readCount;
        while((readCount = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, readCount);
        }

        // 5. ֪ͨ������������д�����
        socket.shutdownOutput(); // ���Ѿ���������

        // 6. ȷ��������������ϣ��ſ��ԶϿ�����
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
