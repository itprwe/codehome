package my.prwe.oo;

public class TestInterf implements C{

    @Override
    public void testa() {

    }

    @Override
    public void testb() {

    }

    @Override
    public void testc() {

    }
}

interface A{
    void testa();
}
interface B{
    void testb();
}

interface C extends A,B{
    void testc();
}