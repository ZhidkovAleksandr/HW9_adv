package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<10; i++){
            list.add(i);
        }




        Stream<Integer> integerStream = list.stream();

        Optional<Integer> sum = integerStream.map(n -> n*n).reduce((left, right) -> left + right);
        System.out.println(sum);

    }
}