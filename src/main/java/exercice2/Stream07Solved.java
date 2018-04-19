package exercice2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import exercice2.Stream07.VideoInfo;
import model.BoxArt;
import model.Movie;
import model.MovieList;
import util.DataUtil;

/**
 * Récupérer l'ID, le titre, et l'URL de la {@link BoxArt} la plus petite pour chaque vidéo (=> objet {@link VideoInfo}).
 * @return
 */
public class Stream07Solved {
	
	
	public static List<VideoInfo> executeSansJava8() {
		List<MovieList> movieLists = DataUtil.getMovieLists();
		List<VideoInfo> results = new ArrayList<>();
		for (MovieList movieList : movieLists) {
			for (Movie movie : movieList.getVideos()) {
				Double smallestArea = -1d;
				BoxArt smallestBox = null;
				for (BoxArt box : movie.getBoxarts()) {
					double area = box.getWidth() * box.getHeight();
					if (smallestArea == -1 || area < smallestArea) {
						smallestArea = area;
						smallestBox = box;
					}
				}
				results.add(new VideoInfo(movie.getId(), movie.getTitle(), smallestBox));
			}
		}
		
		return results;
	}
	
    public static List<VideoInfo> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();
        final Comparator<BoxArt> comp = (p1, p2) -> Double.compare(p1.getHeight() * p1.getWidth(), p2.getHeight() * p2.getWidth());
        return movieLists.stream()
        		.flatMap(p -> p.getVideos().stream())
        		.map(p -> p.getBoxarts().stream()
        				.min(comp)
        				.map(box -> new VideoInfo(p.getId(), p.getTitle(), box))
        				.get()
    				).collect(Collectors.toList());

    }
    
    public static class VideoInfo {
    		public int id;
    		public String title;
    		public BoxArt boxArt;
    		
    		public VideoInfo(int id, String title, BoxArt boxArt) {
    			this.id = id;
    			this.title = title;
    			this.boxArt = boxArt;
    		}

		@Override
		public String toString() {
			return "VideoInfo [id=" + id + ", title=" + title + ", boxArt=" + boxArt.getUrl() + "]";
		}
    		
    }
    
    /**
     * NE PAS TOUCHER - Launcher
     * @param args
     */
	public static void main(String[] args) {
		List<VideoInfo> videoInfos = execute();
		assertEquals(videoInfos.size(), 4);
		assertEquals(videoInfos.toString(), "[VideoInfo [id=70111470, title=Die Hard, boxArt=http://cdn-0.nflximg.com/images/2891/DieHard150.jpg], VideoInfo [id=654356453, title=Bad Boys, boxArt=http://cdn-0.nflximg.com/images/2891/BadBoys150.jpg], VideoInfo [id=65432445, title=The Chamber, boxArt=http://cdn-0.nflximg.com/images/2891/TheChamber150.jpg], VideoInfo [id=675465, title=Fracture, boxArt=http://cdn-0.nflximg.com/images/2891/Fracture150.jpg]]");
		System.out.println("Solved !");
		System.out.println(execute());
	}
}
