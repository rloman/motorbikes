package nl.motorbikes.composite.tree;

public class Tree {

    private Integer value;
    private Tree left; // the smaller ones
    private Tree right; // the larger ones (compared to this.value)


    public void add(Integer value) {
        if (this.value == null) {
            this.value = value;
            this.left = new Tree();
            this.right = new Tree();
        }
        else {
            if (value < this.value) {
                left.add(value);
            }
            else {
                right.add(value);
            }
        }
    }

    public void print() {
        if (this.value != null) {
            this.left.print();
            System.out.print(this.value+", ");
            this.right.print();
        }
    }
}
