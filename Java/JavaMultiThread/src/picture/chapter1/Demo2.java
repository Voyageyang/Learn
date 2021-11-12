package picture.chapter1;

/**
 * @description : 继承Thread实现多线程
 * @auther : Y.H.
 * @time : 2021/11/12 23:40
 */
public class Demo2 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.print("Good!");
        }
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("Nice!");
        }
    }
}
