package Concrete;

import Entities.Album;
import Entities.Music;

public class Utilies {
	public static void getAllMusic(Music[] music) {
		System.out.println("*************Muzikler*************");
		for (Music music2 : music) {
			System.out.println(music2.getMusicName());
		}
	}
	public static void getAllAlbum(Album[] album) {
		System.out.println("*************Albumler*************");
		for (Album album2 : album) {
			System.out.println(album2.getAlbumName());
		}
	}
}
