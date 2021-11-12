package picture.chapter1;

/**
 * @description : �̵߳�����--����Thread������
 * @auther : Y.H.
 * @time : 2021/11/12 23:47
 */
public class Demo3 {
    public static void main(String[] args) {
        new PrintThread("Good!").start();
        new PrintThread("Nice!").start();
    }
}
class PrintThread extends Thread {
    private String message;
    public PrintThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(message);
        }
    }
}
