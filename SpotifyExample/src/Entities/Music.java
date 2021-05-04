package Entities;

public class Music {
	private int Id;
	private String musicName;
	private Album album;
	private Producer producer;
	
	public Music(int id, String musicName, Album album, Producer producer) {
		super();
		Id = id;
		this.musicName = musicName;
		this.album = album;
		this.producer = producer;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	public Producer getProducer() {
		return producer;
	}
	public void setProducer(Producer producer) {
		this.producer = producer;
	}
}
