package my.prwe.oo;

public class TestActor {
    public static void main(String[] args) {
        Acotor a = new Acotor("dilireba");
        a.actMovie();
        a.actTv();
        a.canSing();

    }
}

interface Movie{
    void actMovie();
}
interface Tv{
    void actTv();
}
interface Sing{
    void canSing();
}

class Acotor implements Movie,Tv,Sing{

    String name;

    public Acotor(String name) {
        this.name = name;
        System.out.println("名字是"+name);
    }

    @Override
    public void actMovie() {
        System.out.println("可以演电影，，，");
    }

    @Override
    public void actTv() {
        System.out.println("可以演电，，，");
    }

    @Override
    public void canSing() {
        System.out.println("可以唱歌，，，");
    }
}
