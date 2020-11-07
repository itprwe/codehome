package my.prwe.oo;


public class TestCallback {
    public static void main(String[] args) {
        G g = new G();
        L l = new L(g);
        l.askQuestion("问一个问题");
    }
}

interface CallBack{
    public void answer(String result);
}

class L implements CallBack{

    private G g;

    public L(G g){
        this.g  = g;
    }

    @Override
    public void answer(String result) {
        System.out.println("G告诉L答案是:"+result);
    }

    public void askQuestion(String question){
        g.excute(L.this,question);
    }
}

class G{

    public void excute(CallBack c,String question){
        System.out.println("L的问题是:"+question);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c.answer("哈哈哈哈哈哈！");
    }
}