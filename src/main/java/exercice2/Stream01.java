package exercice2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import model.Movie;
import util.DataUtil;


public class Stream01 {
	

	/**
	 * Exercice Stream 01 :
	 * Transfomer une liste contenant des objets {@link Movie} et une liste de {@link Video}.
	 * Pour cela il faudra utiliser la méthode map().
	 */
    public static List<Video> execute() {
        List<Movie> movies = DataUtil.getMovies();

        // TODO
        
        return new ArrayList<>();
    }
    
    
	public static class Video {
		public int id;
		public String title;
		
		public Video(int id, String title) {
			this.id = id;
			this.title = title;
		}

		@Override
		public String toString() {
			return "Video [id=" + id + ", title=" + title + "]";
		}
		
	}
    
    /**
     * NE PAS TOUCHER - Launcher
     * @param args
     */
	public static void main(String[] args) {
		List<Video> results = execute();
		assertEquals(results.size(), 4);
		assertEquals(results.toString(), "[Video [id=70111470, title=Die Hard], Video [id=654356453, title=Bad Boys], Video [id=65432445, title=The Chamber], Video [id=675465, title=Fracture]]");
		System.out.println("Solved !");
	}
}
	