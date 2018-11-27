package iterator;

import java.sql.Date;
import java.util.ArrayList;

public abstract class Document {
    public String id;
    public String number;
    public boolean isDelete;
    public Date date;
    public String comment;

    public abstract ArrayList<Document> getDocuments();

    public DocIterator iterator(){
        return new DocIterator(this);
    }
}
