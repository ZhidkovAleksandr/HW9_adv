package Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        CalcActions add, sub, div, mult;

        add = (a,b)->a+b;
        sub = (a,b)->a-b;
        div = (a,b)->a/b;
        mult = (a,b)->a*b;

        List<Double> list = new ArrayList<>();
        list.add(add.makeAction(2.0,1.0));
        list.add(sub.makeAction(2.0,1.0));
        list.add(div.makeAction(2.0,1.0));
        list.add(mult.makeAction(2.0,1.0));


       list.forEach(res->System.out.println(res));

    }
}
