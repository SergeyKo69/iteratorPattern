package iterator;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Nakl extends Document {
    public Nakl(String id, String number, Date date) {
        this.id = id;
        this.number = number;
        this.date = date;
    }

    public Nakl() {
    }

    @Override
    public ArrayList<Document> getDocuments() {
        ArrayList<Document> list = new ArrayList<>();
        list.add(new Nakl("1","00001",new Date(new java.util.Date().getTime())));
        list.add(new Nakl("2","00002",new Date(new java.util.Date().getTime())));
        list.add(new Nakl("3","00003",new Date(new java.util.Date().getTime())));
        list.add(new Nakl("4","00004",new Date(new java.util.Date().getTime())));
        list.add(new Nakl("5","00005",new Date(new java.util.Date().getTime())));
        list.add(new Nakl("6","00006",new Date(new java.util.Date().getTime())));
        list.add(new Nakl("7","00007",new Date(new java.util.Date().getTime())));
        return list;
    }

    @Override
    public String toString() {
        return "Nakl №: " + this.number + " to: " + this.date;
    }
}
