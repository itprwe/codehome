package my.prwe.collection;

public class TextGeneric {
    public static void main(String[] args) {
        MyCollection my = new MyCollection();
        my.set("郑的",0);
        my.set("郑一",1);
        my.set(213,2);
        String o = (String) my.get(0);
        Integer i = (Integer) my.get(2);
        System.out.println(o);
        System.out.println(i);

        MyCollection2<String> my2 = new MyCollection2<String>();
        my2.set("哈哈哈",0);
        String s = my2.get(0);
        System.out.println(s);
    }
}

class MyCollection{
    Object[] objs = new Object[5];
    public void set(Object obj,int index){
        objs[index]=obj;
    }
    public Object get(int index){
        return objs[index];
    }
}

class MyCollection2<E>{
    Object[] objs = new Object[5];
    public void set(E obj,int index){
        objs[index]=obj;
    }
    public E get(int index){
        return (E)objs[index];
    }
}


