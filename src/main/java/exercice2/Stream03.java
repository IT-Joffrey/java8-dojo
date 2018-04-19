package exercice2;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.google.common.collect.ImmutableList;

import model.MovieList;
import util.DataUtil;

public class Stream03 {
	
	/**
	 * Transfomer la liste d'objets {@link MovieList} pour récupérer seulement les ID de vidéos (à stocker dans une liste).
	 * Astuce : utiliser map() et flatMap().
	 */
    public static List<Integer> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        // TODO
        
        return ImmutableList.of(1, 2, 3);
    }
    
    /**
     * NE PAS TOUCHER - Launcher
     * @param args
     */
	public static void main(String[] args) {
		List<Integer> results = execute();
		assertEquals(results.size(), 4);
		assertEquals(results.toString(), "[70111470, 654356453, 65432445, 675465]");
		System.out.println("Solved !");
	}
}
