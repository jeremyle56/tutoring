package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3", "4", "5");
        strings.forEach(s -> {
            System.out.println(s);
            // System.out.println(s + "GWGAW");
        });
        // for (String s : strings) {
        // System.out.println(s);
        // }

        // .map(s => console.log(s));
        List<String> strings2 = List.of("1", "2", "3", "4", "5");
        // List<Integer> ints = strings2.stream().map(i ->
        // Integer.parseInt(i)).collect(Collectors.toList());
        List<Integer> ints = strings2.stream().map(Integer::parseInt).toList();
        System.out.println(ints.stream().reduce(0, Integer::sum));

        // for (String string : strings2) {
        // ints.add(Integer.parseInt(string));
        // }
        System.out.println(ints);
    }
}
