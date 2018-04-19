package exercice2;

import static org.junit.Assert.assertEquals;

import java.util.List;

import model.BoxArt;
import model.Movie;
import util.DataUtil;

public class Stream06 {
	
	/**
	 * Récupérer l'URL de la {@link BoxArt} avec la plus grande surface.
	 * (Chaque object {@link Movie} contient une liste de {@link BoxArt})
	 * Astuce : utiliser map() et reduce().
	 * @return
	 */
    public static String execute() {
        List<Movie> movies = DataUtil.getMovies(); 
        
        // TODO
        
        return "someUrl";
    }
    
    /**
     * NE PAS TOUCHER - Launcher
     * @param args
     */
	public static void main(String[] args) {
		assertEquals(execute(), "http://cdn-0.nflximg.com/images/2891/Fracture300.jpg");
		System.out.println("Solved !");
	}
}
