package examples.example1;

import examples.model.Name;

public class NameParserWithJava8 {
	
	@FunctionalInterface
	public interface Creator<T> {
		T create(String firstname, String lastname);
	}
	
	public <T> T parse(String name, Creator<T> creator) {
		String[] tokens = name.split(" ");
		String firstname = tokens[0];
		String lastname = tokens[1];
		return creator.create(firstname, lastname);
	}
	
	public static class FactoryStatic {
		public static Name createName(String firstname, String lastname) {
			return new Name(firstname, lastname);
		}
	}
	
	/**
	 * Avec {@link Creator} qui est devenu une interface fonctionnelle, on peut maintenant passer toute méthode dont la signature répondra aux contraintes suivantes:
	 * - Deux paramètres de type String
	 * - Type de retour générique
	 * @param args
	 */
	public static void main(String[] args) {
		NameParserBeforeJava8 parser = new NameParserBeforeJava8();
		
		// Exemple 1 : en appelant le constructeur de Name.
		Name res = parser.parse("John Doe", Name::new);
		
		// Exemple 2 : avec une expression de lambda
		Name res2 = parser.parse("John Doe", (s1, s2) -> new Name(s1, s2));
		
		// Exemple 3
		Name res3 = parser.parse("John Doe", FactoryStatic::createName);
		
		
	}
}
