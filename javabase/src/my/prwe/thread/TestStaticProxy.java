package my.prwe.thread;

/**
 * 静态代理
 * 1.真实角色
 * 2.代理角色
 *
 * 要实现同一个接口
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        new MarryCompany(new You()).happyMarry();
    }
}

interface Marray{
    void happyMarry();
}

//真实角色
class You implements Marray{

    @Override
    public void happyMarry() {
        System.out.println("you got married really happy,,,");
    }
}

//代理角色
class MarryCompany implements Marray{

    //真实角色
    private Marray target;
    public MarryCompany( Marray target){
        this.target=target;
    }

    @Override
    public void happyMarry() {
        ready();
        this.target.happyMarry();
        end();
    }

    private void ready(){
        System.out.println("ready do something,,");
    }
    private void end(){
        System.out.println("end do something,,");
    }
}


