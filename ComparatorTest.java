import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.mysongs.Song;

public class ComparatorTest {
	public static void main(String[] args) {
		
		Song s1 = new Song("My Heart Will Go On","Celine D","Titanic",1994);
		Song s2 = new Song("I want it that way","Backstreet Boys","Millenium",1998);
		Song s3 = new Song("Tanhayee","Sonu Nigam","Dil Chahta Hai",2015);
		Song s4 = new Song("Tanha Dil","Shaan","Tanha Dil",2018);
		Song s5 = new Song("Zhingat","AjayAtul","Sairat",2017);
		Song s6 = new Song("Jagga Jiteya","Daler Mehandi","URI",2014);
	
		ArrayList<Song> jukeBox = new ArrayList<Song>();
		jukeBox.add(s1);jukeBox.add(s2);jukeBox.add(s3);jukeBox.add(s4);jukeBox.add(s5);jukeBox.add(s6);
		
		/*
		 * Sorts the specified list according to the order induced by the specified comparator. 
		 * All elements in the list must be mutually comparable using the specified comparator 
		 * (that is, c.compare(e1, e2) must not throw a ClassCastException for any elements e1 
		 * and e2 in the list).
		 */
		/*
		 * Girl g1, mirror , g2, g3, g4 ..... infinite... Comparable
		 * Dancer d1, d2, d3 ........
		 * Judge j1, j2, j3
		 * 
		 */
		Comparator<Song> comparator = new TitleComparator();
		Collections.sort(jukeBox,comparator); //-- will refer Comparable in Song class
		
		for (Song song : jukeBox) {
			System.out.println("Song : "+song);
		}
		
		
	}
}
//The type ArtistComparator must implement the inherited abstract 
//method Comparator<Song>.compare(Song, Song)
									//java.util
class ArtistComparator implements Comparator<Song> //this is not a song
{

	public int compare(Song o1, Song o2) {
		System.out.println("Comparing "+o1.getArtist()+" with "+o2.getArtist());
		return o1.getArtist().compareTo(o2.getArtist());
	}
	
}
class TitleComparator implements Comparator<Song> //this is not a song
{

	public int compare(Song o1, Song o2) {
		System.out.println("Comparing "+o1.getTitle()+" with "+o2.getTitle());
		return o1.getTitle().compareTo(o2.getTitle());
	}
	
}

class AlbumComparator implements Comparator<Song> //this is not a song
{

	public int compare(Song o1, Song o2) {
		System.out.println("Comparing "+o1.getAlbum()+" with "+o2.getAlbum());
		return o1.getAlbum().compareTo(o2.getAlbum());
	}
	
}
