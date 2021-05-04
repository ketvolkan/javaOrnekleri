package Entities;

public class Album {
	private int Id;
	private String albumName;
	private int year;
	
	public Album(int id, String albumName, int year) {
		super();
		Id = id;
		this.albumName = albumName;
		this.year = year;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
