package my.prwe.thread;

public class TestThreadRacer implements Runnable {
    private String winner;//胜利者

    @Override
    public void run() {
        for (int steps=1;steps<=100;steps++){
            //模拟休息
            if (Thread.currentThread().getName().equals("wugui")&&steps%10==0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName()+"-->"+steps);
            //比赛是否结束
            boolean b = gameOver(steps);
            if (b){
                break;
            }
        }
    }

    private boolean gameOver(int steps){
        if (winner!=null){
            return true;
        }else {
            if (steps==100){
                winner=Thread.currentThread().getName();
                System.out.println("winner-->"+winner);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TestThreadRacer racer =new TestThreadRacer();
        new Thread(racer,"tuzi").start();
        new Thread(racer,"wugui").start();
    }
}
