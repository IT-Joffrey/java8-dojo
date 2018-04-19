package exercice2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Movie;
import model.MovieList;
import util.DataUtil;

/**
 * Transfomer la liste d'objets {@link MovieList} pour récupérer seulement les ID de vidéos (à stocker dans une liste).
 * Astuce : utiliser map() et flatMap().
 */
public class Stream03Solved {
	
	public static List<Integer> executeSansJava8() {
		List<MovieList> movieLists = DataUtil.getMovieLists();
		List<Integer> results = new ArrayList<>();
		
		for (MovieList movieList : movieLists) {
			for (Movie movie : movieList.getVideos()) {
				results.add(movie.getId());
			}
		}
		
		return results;
	}
	
    public static List<Integer> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();
        
        return movieLists.stream()
        		.flatMap(p -> p.getVideos().stream())
        		.map(p -> p.getId())
        		.collect(Collectors.toList());
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
