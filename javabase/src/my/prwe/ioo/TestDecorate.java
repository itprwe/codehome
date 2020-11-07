package my.prwe.ioo;

/**
 * 实现放大器堆声音的放大功能
 */
public class TestDecorate {
    public static void main(String[] args) {
        Person p =new Person();
        p.say();
        //装饰
        Amplifier a =new Amplifier(p);
        a.say();
    }

}

interface Say{
    void say();
}

class Person implements Say{

    //人声音分贝
    private int voice=10;

    //实现say方法
    @Override
    public void say() {
        System.out.println("人的声音为："+this.getVoice());
    }

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }
}

//放大器
class Amplifier implements Say{

    //加入对人声音的装饰
    private Person p;

    Amplifier(Person p){
        this.p=p;
    }

    @Override
    public void say() {
        System.out.println("人的声音为："+p.getVoice()*100);
        System.out.println("噪音。。");
    }
}