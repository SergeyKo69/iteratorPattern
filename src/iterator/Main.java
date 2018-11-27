package iterator;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        DocIterator iterator = order.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getNext().toString());
        }
        Nakl nakl = new Nakl();
        DocIterator iterator1 = nakl.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.getNext().toString());
        }
    }
}
