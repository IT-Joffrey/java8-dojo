package examples.example3;

public class CallbacksExample {

    interface Operation<T> {
        T function();
        void onSuccess(T res);
        void onError(Exception ex);
    }

    private static <T> void doSomething(Operation<T> operation) {
        try {
            T res = operation.function();
            operation.onSuccess(res);
        } catch (Exception ex) {
            operation.onError(ex);
        }
    }

    public static void main(String[] args) {
        // Sans java 8
        doSomething(new Operation<Object>() {
            @Override
            public Object function() {
                return 42;
            }
            @Override
            public void onSuccess(Object res) {
                System.out.println(res);
            }
            @Override
            public void onError(Exception ex) {
                System.err.println("Error: " + ex.getMessage());
            }
        });
    }

}
