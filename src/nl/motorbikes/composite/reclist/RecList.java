package nl.motorbikes.composite.reclist;

public class RecList {


    private String head;
    private RecList tail;


    public void add(String element) {
        if (this.head == null) {
            this.head = element;
            this.tail = new RecList();
        }
        else {
            this.tail.add(element);
        }
    }

    public int size() {
        if (this.head != null) {
            return 1 + tail.size();
        }
        return 0;
    }

    public void print() {
        if (this.head != null) {
            System.out.print(this.head+", ");
            this.tail.print();
        }
    }
}
