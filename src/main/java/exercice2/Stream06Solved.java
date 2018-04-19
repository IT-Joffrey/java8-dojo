package exercice2;

import static org.junit.Assert.assertEquals;

import java.util.List;

import model.BoxArt;
import model.Movie;
import util.DataUtil;

/**
 * Récupérer l'URL de la {@link BoxArt} avec la plus grande surface.
 * (Chaque object {@link Movie} contient une liste de {@link BoxArt})
 * Astuce : utiliser map() et reduce().
 * @return
 */
public class Stream06Solved {
	
	public static String executeSansJava8() {
		List<Movie> movies = DataUtil.getMovies();
		int largestBox = 0;
		String resultUrl = "";
		for (Movie movie : movies) {
			for (BoxArt boxArt : movie.getBoxarts()) {
				if (boxArt.getWidth() > largestBox) {
					largestBox = boxArt.getWidth();
					resultUrl = boxArt.getUrl();
				}
			}
		}
		return resultUrl;
	}
	
    public static String execute() {
        List<Movie> movies = DataUtil.getMovies();
        return movies.stream()
        		.flatMap(p -> p.getBoxarts().stream())
        		.reduce((BoxArt a, BoxArt b) -> a.getWidth() > b.getWidth() ? a : b)
        		.map(p -> p.getUrl())
        		.get();
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
