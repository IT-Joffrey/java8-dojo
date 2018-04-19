package examples.example1;

@FunctionalInterface
public interface BasicLambdaInterface {

	void doSomething();
	
	default int methodWithDefaultImpl() {
		return 0;
	}
	
}
