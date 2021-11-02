package nl.motorbikes.prototype;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcreteFarmer2 c = new ConcreteFarmer2();
        c.name = "It rocks!";

        ConcreteFarmer2 clone = (ConcreteFarmer2) c.clone();
        System.out.println(clone.getClass().getName());
        System.out.println(clone.name);
        System.out.println(clone == c);
        System.out.println(c.getClass().equals(clone.getClass()));
        System.out.println(c.name == clone.name);
        System.out.println(c.builder == clone.builder);
    }
}
