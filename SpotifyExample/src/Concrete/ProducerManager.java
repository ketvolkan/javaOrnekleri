package Concrete;

import Abstract.IProducerService;
import Abstract.UserService;
import Entities.Album;
import Entities.Listener;
import Entities.Music;
import Entities.Producer;
import Entities.Users;

public class ProducerManager extends UserService implements IProducerService {
	@Override
	public void Add(Users users) {
		System.out.println(((Producer)(users)).getCompanyName()+" Producer'a Eklendi...");
	}
	@Override
	public void Delete(Users users) {
		System.out.println(((Producer)(users)).getCompanyName()+" Producer'Dan Silindi...");
	}
	@Override
	public void Update(Users users) {
		System.out.println(((Producer)(users)).getCompanyName()+" Producer'Da Güncellendi...");
	}
	@Override
	public void addAlbum(Album album) {
		System.out.println(album.getAlbumName() + " Eklendi");
		
	}
	@Override
	public void addMusic(Music music) {
		System.out.println(music.getMusicName() + " Eklendi");
		
	}
}
