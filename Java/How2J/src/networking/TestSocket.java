package networking;

import java.io.IOException;
import java.net.InetAddress;

public class TestSocket {
    public static void main(String[] args) throws IOException {
        InetAddress host = InetAddress.getLocalHost();
        String ip = host.getHostAddress();
        System.out.println("±¾»úipµØÖ·" + ip);
    }
}
