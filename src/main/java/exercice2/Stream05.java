package exercice2;

import static org.junit.Assert.assertEquals;

import java.util.List;

import model.Movie;
import util.DataUtil;


public class Stream05 {
	
	/**
	 * Récupérer la meilleure note.
	 * Astuce : utiliser la méthode reduce().
	 * @return
	 */
    public static Double execute() {
        List<Movie> movies = DataUtil.getMovies();
        
        // TODO
        
        return 3.0;
    }
    
    /**
     * NE PAS TOUCHER - Launcher
     * @param args
     */
	public static void main(String[] args) {
		assertEquals(execute().doubleValue(), 5.0);
		System.out.println("Solved !");
	}
}
