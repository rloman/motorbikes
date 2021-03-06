package nl.motorbikes.interpreter;

import java.util.List;


public class Application {

    public static void main(String[] args) {

        Expression query = new Select("name", new From("people"));
        Context ctx = new Context();
        List<String> result = query.interpret(ctx);
        System.out.println(result);

        Expression query2 = new Select("*", new From("people"));
        List<String> result2 = query2.interpret(ctx);
        System.out.println(result2);

        Expression query3 = new Select("name", new From("people", new Where(name -> name.toLowerCase().startsWith("d"))));
        List<String> result3 = query3.interpret(ctx);
        System.out.println(result3);

        Expression query4 = new Select("surname", new From("people", new Where(name -> name.toLowerCase().contains("doe"))));
        List<String> result4 = query4.interpret(ctx);
        System.out.println(result4);
    }
}
