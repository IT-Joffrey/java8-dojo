package exercice2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import model.BoxArt;
import model.MovieList;
import util.DataUtil;

public class Stream07 {
	
	/**
	 * Récupérer l'ID, le titre, et l'URL de la {@link BoxArt} la plus petite pour chaque vidéo (=> objet {@link VideoInfo}).
	 * @return
	 */
    public static List<VideoInfo> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        // TODO
        
        return new ArrayList<>();
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
    

	public static void main(String[] args) {
		List<VideoInfo> videoInfos = execute();
		assertEquals(videoInfos.size(), 4);
		assertEquals(videoInfos.toString(), "[VideoInfo [id=70111470, title=Die Hard, boxArt=http://cdn-0.nflximg.com/images/2891/DieHard150.jpg], VideoInfo [id=654356453, title=Bad Boys, boxArt=http://cdn-0.nflximg.com/images/2891/BadBoys150.jpg], VideoInfo [id=65432445, title=The Chamber, boxArt=http://cdn-0.nflximg.com/images/2891/TheChamber150.jpg], VideoInfo [id=675465, title=Fracture, boxArt=http://cdn-0.nflximg.com/images/2891/Fracture150.jpg]]");
		System.out.println("Solved !");
		System.out.println(execute());
	}
}
