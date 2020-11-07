package my.prwe.collection;

//put方法
//重写toString方法
//get方法，根据键值获取value
//增加泛型
//待完成 remove
public class PrweHashMap2<K,V>  {

    Node3[] table;//位桶数组
    int size;

    public PrweHashMap2() {
        table = new Node3[16];//2的整数次幂
    }

    public void put(K key, V value) {
        //如果需要完善，则需要扩容

        //定义新的节点对象
        Node3 newNode = new Node3();
        newNode.hash = myHash(key.hashCode(), table.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        Node3 temp = table[newNode.hash];
        Node3 itLast = null;//正在遍历的最后一个元素
        boolean keyRepeat = false;
        if (temp == null) {
            //此处数组元素为空，则直接将新节点放入。
            table[newNode.hash] = newNode;
            size++;
        } else {
            //此处元素不为空，则遍历链表。。。
            while (temp != null) {
                //key重复了，则覆盖
                if (temp.key.equals(key)) {
                    keyRepeat = true;
                    System.out.println("key重复了！");
                    temp.value = value;//key重复了只用覆盖value
                    break;
                } else {
                    //key不重复，则遍历下一个
                    itLast = temp;
                    temp = temp.next;
                }
            }
            if (!keyRepeat) {//如果没有发生key重复的情况，则添加到列表后面
                itLast.next = newNode;
                size++;
            }
        }

    }

    @Override
    public String toString() {
        //
        StringBuilder sb = new StringBuilder("{");
        //遍历数组
        for (int i = 0; i < table.length; i++) {
            Node3 temp = table[i];
            //遍历链表
            while (temp != null) {
                sb.append(temp.key + ":" + temp.value + ",");
                temp = temp.next;
            }
        }
        sb.setCharAt(sb.length() - 1, '}');
        return sb.toString();
    }

    public V get(K key) {
        int hash = myHash(key.hashCode(), table.length);
        V value = null;

        if (table[hash] != null) {
            Node3 temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key)) {//如果相等，则返回相应的value
                    value = (V)temp.value;
                    break;
                } else {
                    temp = temp.next;
                }
            }
        }

        return value;
    }

    public static int myHash(int v, int length) {
//        System.out.println("hachcode & :" + (v & (length - 1)));//位运算，效率高
//        System.out.println("hashcode % :" + v % (length - 1));//取模运算，效率低
        return v & (length - 1);
    }


    public static void main(String[] args) {
        PrweHashMap2<Integer,String> prweHashMap = new PrweHashMap2<>();
        //相同的hash的key有21,37,53,69
        prweHashMap.put(11, "prwe");
        prweHashMap.put(22, "haha");
        prweHashMap.put(33, "gg");
        prweHashMap.put(44, "hh");
        prweHashMap.put(21, "jj");
        prweHashMap.put(37, "kk");
        prweHashMap.put(53, "ll");

//        for (int i = 11; i <100 ; i++) {
//            System.out.println(i+"===="+myHash(i,16));
//        }

        System.out.println(prweHashMap.get(53));

        System.out.println(prweHashMap);
    }
}
