package my.prwe.thread;

/**
 * 继承Thread方法，重写run()方法
 */
public class TestThread extends Thread{

    //里面是线程体
    @Override
    public void run() {
        for (int i = 0; i <30 ; i++) {
            System.out.println(this.getName()+"hahaha prwe,,,");
        }
    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.start();
        for (int i = 0; i <30 ; i++) {
            System.out.println("Thread main,,,");
        }

    }
}
