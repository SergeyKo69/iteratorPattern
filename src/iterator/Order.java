package iterator;

import java.util.ArrayList;
import java.sql.Date;

public class Order extends Document {
    public Order() {
    }

    public Order(String id, String number, Date date) {
        this.id = id;
        this.number = number;
        this.date = date;
    }

    @Override
    public ArrayList<Document> getDocuments() {
        ArrayList<Document> list = new ArrayList<>();
        list.add(new Order("1","00001",new Date(new java.util.Date().getTime())));
        list.add(new Order("2","00002",new Date(new java.util.Date().getTime())));
        list.add(new Order("3","00003",new Date(new java.util.Date().getTime())));
        list.add(new Order("4","00004",new Date(new java.util.Date().getTime())));
        list.add(new Order("5","00005",new Date(new java.util.Date().getTime())));
        list.add(new Order("6","00006",new Date(new java.util.Date().getTime())));
        list.add(new Order("7","00007",new Date(new java.util.Date().getTime())));
        return list;
    }

    @Override
    public String toString() {
        return "Order №: " + this.number + " to: " + this.date;
    }
}
