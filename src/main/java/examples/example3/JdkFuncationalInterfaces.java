package examples.example3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JdkFuncationalInterfaces {

    public void consumerExample() {
        Iterable<String> strings = Arrays.asList("a", "b", "c");
        strings.forEach(System.out::println);
    }

    public void functionExample() {
        List<String> strings = Arrays.asList("b", "a", "c");
        Comparator<String> comparator = Comparator.comparing(String::toLowerCase);
        strings.sort(comparator);
    }

    public void predicateExample() {
        List<String> strings = new ArrayList<String>() {{
            add("ab");
            add("bb");
            add("cb");
        }};
        strings.removeIf(s -> s.contains("c"));
    }

}
