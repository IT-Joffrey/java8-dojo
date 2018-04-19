package examples.example1;

import examples.model.Name;

public class NameParserBeforeJava8 {
	
	public interface Creator<T> {

		T create(String firstname, String lastname);
	}
	
	public <T> T parse(String name, Creator<T> creator) {
		String[] tokens = name.split(" ");
		String firstname = tokens[0];
		String lastname = tokens[1];
		return creator.create(firstname, lastname);
	}
	
	public static void main(String[] args) {
		NameParserBeforeJava8 parser = new NameParserBeforeJava8();
		Name res = parser.parse("John Doe", new Creator<Name>() {
			@Override
			public Name create(String firstname, String lastname) {
				return new Name(firstname, lastname);
			}
		});
		
	}

}
