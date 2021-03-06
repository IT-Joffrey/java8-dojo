package exercice1;

import examples.model.Name;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExamples {

	public void sortWithoutLambda() {

		List<Name> names = init();
		//sort by age
		Collections.sort(names, new Comparator<Name>() {
			@Override
			public int compare(Name o1, Name o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		//sort by name
		Collections.sort(names, new Comparator<Name>() {
			@Override
			public int compare(Name o1, Name o2) {
				return o1.getLastname().compareTo(o2.getLastname());
			}
		});
	}

	public void sortWithLambda() {
		// TODO
		List<Name> names = init();
		
	}
	
	public static List<Name> init() {
		List<Name> names = new ArrayList<>();
		names.add(new Name("John", "Doe", 999));
		names.add(new Name("Jean", "Dupont", 10));
		names.add(new Name("Brigitte", "Macron", 102));
		return names;
	}

}
