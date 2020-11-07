package my.prwe.thread;

/**
 * 创建：实现Runnable接口重写run()方法
 * 启动：创建Thread对象，将实现类对象传入
 *
 * 推荐避免继承的局限性，优先使用接口
 * 方便共享资源
 */
public class TestRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <30 ; i++) {
            System.out.println("thread A,,,");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new TestRunnable());
        thread.start();

        for (int i = 0; i <30 ; i++) {
            System.out.println("main thread,,,");
        }
    }
}
