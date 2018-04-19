package exercice2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Movie;
import util.DataUtil;

/**
 * Récupérer les ID des films ayant une note égale à 5.
 * Astuce: utiliser les méthodes filter() et map().
 */
public class Stream02Solved {
	
	/**
	 * Sans java 8
	 * @return
	 */
    public static List<Integer> executeSansJava8() {
        List<Movie> movies = DataUtil.getMovies();
        List<Integer> results = new ArrayList<>();
        for (Movie movie : movies) {
        		if (movie.getRating() == 5.0) {
        			results.add(movie.getId());
        		}
        }
        return results;
    }
	
    /**
     * Avec Java 8
     * @return
     */
    public static List<Integer> execute() {
        List<Movie> movies = DataUtil.getMovies();
        
        return movies.stream()
        		.filter(p -> p.getRating() == 5.0)
        		.map(p -> p.getId())
        		.collect(Collectors.toList());
    }
    
    /**
     * NE PAS TOUCHER - Launcher
     * @param args
     */
	public static void main(String[] args) {
		List<Integer> results = execute();
		assertEquals(results.size(), 2);
		System.out.println("Solved !");
	}
}
