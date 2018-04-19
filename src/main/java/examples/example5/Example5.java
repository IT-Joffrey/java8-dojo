package examples.example5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import examples.model.Name;

public class Example5 {

	public static void main(String[] args) {
		
		List<Name> names = new ArrayList<>();
		names.add(new Name("Christophe", "Champagne", 32));
		names.add(new Name("Mikael", "Tokotuu", 30));
		names.add(new Name("Nicolas", "Camoin", 25));
		names.add(new Name("Joffrey", "Chambrin", 28));
		
		Iterator<Name> it = names.iterator();
		while (it.hasNext()) {
			Name name = it.next();
			if ("Chambrin".equals(name.getLastname()) && "Joffrey".equals(name.getFirstname())) {
				it.remove();
			}
		}
		
		names.removeIf((name) -> "Chambrin".equals(name.getLastname()) && "Joffrey".equals(name.getFirstname()));

	}

}
