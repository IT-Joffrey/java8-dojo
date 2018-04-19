package exercice2;

import static org.junit.Assert.assertEquals;

import java.util.List;

import model.Movie;
import util.DataUtil;

/**
 * Récupérer la meilleure note.
 * Astuce : utiliser la méthode reduce().
 * @return
 */
public class Stream05Solved {
	
	public static Double executeSansJava8() {
		List<Movie> movies = DataUtil.getMovies();
		Double maxRating = 0d;
		for (Movie movie : movies) {
			if (movie.getRating() > maxRating) {
				maxRating = movie.getRating();
			}
		}
		return maxRating;
	}
	
    public static Double execute() {
        List<Movie> movies = DataUtil.getMovies();
        return movies.stream().map(p -> p.getRating()).reduce(Double::max).get();
    }
    
    /**
     * NE PAS TOUCHER - Launcher
     * @param args
     */
	public static void main(String[] args) {
		assertEquals(execute().doubleValue(), 5, 0);
		System.out.println("Solved !");
	}
}
