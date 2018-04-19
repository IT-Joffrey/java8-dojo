package examples.example4;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CallbacksExampleWithJava8 {

    private static <T> void doSomething(Supplier<T> function,
                                Consumer<T> onSuccess,
                                Consumer<Exception> onError) {
        try {
            T res = function.get();
            onSuccess.accept(res);
        } catch (Exception ex) {
            onError.accept(ex);
        }
    }

    public static void main(String[] args) {
        // Avec java 8
        doSomething(() -> 42,
                System.out::println,
                ex -> System.err.println("Error: " + ex.getMessage()));
    }

}
