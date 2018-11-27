package iterator;

import java.util.ArrayList;

public class DocIterator implements ErpIterator {
    public ArrayList<Document> listDoc;
    public int curPos;

    public DocIterator(Document document) {
        this.listDoc = document.getDocuments();
        this.curPos = 0;
    }

    @Override
    public boolean hasNext() {
        return curPos < listDoc.size();
    }

    @Override
    public Document getNext() {
        Document doc = listDoc.get(curPos);
        curPos++;
        return doc;
    }

    @Override
    public void reset() {
        curPos = 0;
    }
}
