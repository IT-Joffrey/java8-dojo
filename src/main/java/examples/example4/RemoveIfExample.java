package examples.example4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import examples.model.Name;
import util.Timer;

public class RemoveIfExample {

	public static void main(String[] args) {
		
		List<Name> names = new ArrayList<>();
		names.add(new Name("Christophe", "Champagne", 32));
		names.add(new Name("Mikael", "Tokotuu", 30));
		names.add(new Name("Nicolas", "Camoin", 25));
		names.add(new Name("Joffrey", "Chambrin", 28));
		for (int i = 0; i < 100000; i++) {
			names.add(new Name("John", "Doe", 100));
		}


		Timer timer = new Timer("SANS JAVA 8");
		timer.start();
		Iterator<Name> it = names.iterator();
		while (it.hasNext()) {
			Name name = it.next();
			if ("Doe".equals(name.getLastname()) && "John".equals(name.getFirstname())) {
				it.remove();
			}
		}
		timer.stopAndPrint();

		Timer timer2 = new Timer("AVEC JAVA 8");
		timer2.start();
		names.removeIf((name) -> "Doe".equals(name.getLastname()) && "John".equals(name.getFirstname()));
		timer2.stopAndPrint();

	}



}
