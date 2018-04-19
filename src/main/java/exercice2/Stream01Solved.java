package exercice2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import exercice2.Stream01.Video;
import model.Movie;
import util.DataUtil;


public class Stream01Solved {
	
	
	/**
	 * Exercice Stream 01 :
	 * Transfomer une liste contenant des objets {@link Movie} et une liste de {@link Video}.
	 * Pour cela il faudra utiliser la méthode map().
	 */
    public static List<Video> execute() {
        List<Movie> movies = DataUtil.getMovies();
        
        // Sans java 8
        List<Video> videos = new ArrayList<>();
        for (Movie movie : movies) {
        		videos.add(new Video(movie.getId(), movie.getTitle()));
        }
        
        // Avec les streams
        return movies.stream()
        		.map(p -> new Video(p.getId(), p.getTitle()))
        		.collect(Collectors.toList());
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
		assertEquals(execute().size(), 4);
		assertEquals(execute().toString(), "[Video [id=70111470, title=Die Hard], Video [id=654356453, title=Bad Boys], Video [id=65432445, title=The Chamber], Video [id=675465, title=Fracture]]");
		System.out.println("Solved !");
		System.out.println(execute());
	}
}
	