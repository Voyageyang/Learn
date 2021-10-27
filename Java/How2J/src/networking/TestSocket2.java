package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSocket2 {
    public static void main(String[] args) throws IOException {

        Process p = Runtime.getRuntime().exec("ping " + "192.168.3.22");
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine()) != null) {
            if(line.length() != 0) {
                sb.append(line + "\n");
            }
        }
        System.out.println("����ָ��ص���Ϣ�ǣ�");
        System.out.println(sb.toString());
    }
}
