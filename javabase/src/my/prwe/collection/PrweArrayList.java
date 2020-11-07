package my.prwe.collection;

public class PrweArrayList {
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;


    public PrweArrayList(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public PrweArrayList(int capacity){
        elementData = new Object[capacity];
    }

    public void add(Object obj){
        elementData[size++] = obj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i <size ; i++) {
            sb.append(elementData[i]+",");

        }
        sb.setCharAt(sb.length()-1, ']');
        return  sb.toString();
    }

    public static void main(String[] args) {
        PrweArrayList s1 = new PrweArrayList();
        s1.add("aa");
        s1.add("bb");
        System.out.println(s1);
    }
}
