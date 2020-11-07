package my.prwe.collection;

//定义一个链表
public class PrweLinkList<E> {
    private Node first;//第一个节点
    private Node last;//最后一个节点
    private int size;//大小

    public void add(int index, E element) {
        checkRange(index);
        Node newNode = new Node(element);
        Node temp = getNode(index);

        if (temp != null) {
            Node up = temp.previous;
            up.next = newNode;
            newNode.previous = up;
            newNode.next = temp;
            temp.previous = newNode;
        }

    }

    public void remove(int index) {
        checkRange(index);
        Node node = getNode(index);
        if (node != null) {
            Node up = node.previous;
            Node down = node.next;

            if (up != null) {
                up.next = down;
            }
            if (down != null) {
                down.previous = up;
            }
            size--;
        }
    }


    public E get(int index) {
        checkRange(index);
        Node temp = getNode(index);
        return temp != null ? (E)temp.element : null;
    }

    private void checkRange(int index){
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引数字不合法" + index);
        }
    }

    private Node getNode(int index) {
        checkRange(index);
        Node temp = null;

        if (index < (size >> 1)) {
            temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = last;
            for (int i = size - 1; i > index; i--) {
                temp = temp.previous;
            }
        }
        return temp;
    }

    //[]
    //["a"]
    public void add(E element) {
        Node node = new Node(element);

        if (first == null) {
            //容器开始为空
            first = node;
            last = node;
        } else {
            node.previous = last;
            node.next = null;
            last.next = node;
            last = node;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        Node temp = first;
        while (temp != null) {
            sb.append(temp.element + ",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) {
        PrweLinkList<String> pl = new PrweLinkList<>();
        pl.add("a");
        pl.add("b");
        pl.add("c");
        pl.add("d");
        pl.add("e");
        pl.add("f");
        pl.add("g");
        pl.add("h");
        pl.add("i");
        pl.add("j");
        System.out.println(pl);

        System.out.println(pl.get(0));
        System.out.println(pl.get(1));
        System.out.println(pl.get(6));

        pl.remove(1);
        System.out.println(pl);

        pl.add(2,"mm");
        System.out.println(pl);
    }
}
