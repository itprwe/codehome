package my.prwe.thread;

/**
 * 一个资源有多个代理去操作的时候并发问题
 * 共享资源，会存在并发问题（线程安全问题）
 */
public class TestThread12306 implements Runnable {
    private int ticketNum = 99;

    @Override
    public void run() {
        while (true){
            if(ticketNum<0){
                break;
            }else {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-->"+ticketNum--);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        //一份资源
        TestThread12306 t = new TestThread12306();
        //多个代理
        new Thread(t,"prwe").start();
        new Thread(t,"haha").start();
        new Thread(t,"gaga").start();
    }
}
