package exercice2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import model.Movie;
import util.DataUtil;


public class Stream02 {
	

	/**
	 * Récupérer les ID des films ayant une note égale à 5.
	 * Astuce: utiliser les méthodes filter() et map().
	 */
    public static List<Integer> execute() {
        List<Movie> movies = DataUtil.getMovies();
        
        // TODO
        
        return new ArrayList<>();
    }
    
    
    
    
    
    
    
    
    /**
     * NE PAS TOUCHER - Launcher
     * @param args
     */
	public static void main(String[] args) {
		assertEquals(execute().size(), 2);
		System.out.println("Solved !");
	}
}
