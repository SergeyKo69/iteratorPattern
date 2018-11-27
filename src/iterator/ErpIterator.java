package iterator;

public interface ErpIterator {
    public boolean hasNext();
    public Document getNext();
    public void reset();
}
