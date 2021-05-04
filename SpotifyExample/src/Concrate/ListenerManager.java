package Concrate;

import Abstract.IListenerService;
import Abstract.UserService;
import Entities.Listener;
import Entities.Music;
import Entities.Users;

public class ListenerManager extends UserService implements IListenerService{
	@Override
	public void Add(Users users) {
		System.out.println(((Listener)(users)).getFirstName()+" Listener'a Eklendi...");
	}
	@Override
	public void Delete(Users users) {
		System.out.println(((Listener)(users)).getFirstName()+" Listener'Dan Silindi...");
	}
	@Override
	public void Update(Users users) {
		System.out.println(((Listener)(users)).getFirstName()+" Listener'Da Güncellendi...");
	}
	@Override
	public void likeMusic(Music music,Listener listener) {
		System.out.println(listener.getFirstName()+" Muzik Beðenilenlere Ekledi. -->"+ music.getMusicName());
		
	}
}
