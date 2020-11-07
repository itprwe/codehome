package my.prwe.collection;

//增加泛型
//自动扩容
//增加set get方法
//增加 数组边界的检查
//增加remove方法
public class PrweArrayList02<E> {
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;


    public PrweArrayList02(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public PrweArrayList02(int capacity){
        if(capacity<0){
            throw new RuntimeException("数组初始化长度不能为负数");
        }else if(capacity==0){
            elementData = new Object[DEFAULT_CAPACITY];
        }else {
            elementData = new Object[capacity];
        }
    }

    public void add(E element){
        //何时扩容
        if(size==elementData.length){//添加元素后的数组大小与数组容量相同时候就该扩容了
            //扩容
            Object[] newArray = new Object[elementData.length+(elementData.length>>1)];
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }
        elementData[size++] = element;
    }

    public E get(int index){
        checkRange(index);
        return (E)elementData[index];
    }

    public void set(E element,int index){
        checkRange(index);
        elementData[index]=element;
    }

    private void checkRange(int index) {
        //索引合法判断
        if(index<0||index>size-1){
            throw new RuntimeException("索引不合法"+index);
        }
    }

    //remove
    public void remove1(E element){
        //将element与所有元素比较，获得第一个比较为true的，返回
        for (int i = 0; i <size ; i++) {
            if (element.equals(get(i))){//容器中所有比较用的都是equls
                //将元素从此处移除
                remove(i);
            }
        }
    }
    //将某个index处的元素移除
    public void remove(int index){
        //删除就是数组的拷贝
        int len = elementData.length-index-1;
        if(len>0){
            System.arraycopy(elementData,index+1,elementData,index,len);
        }
        elementData[size--]=null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpy(){
        return size==0?true:false;
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
        PrweArrayList02 s1 = new PrweArrayList02(20);
        for (int i = 0; i <40 ; i++) {
            s1.add("prwe"+i);
        }
        System.out.println(s1);
        System.out.println(s1.get(39));
        s1.set("hhhh",10);
        System.out.println(s1.get(10));

        s1.remove(3);
        s1.remove1("prwe5");
        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println(s1.isEmpy());
    }
}
