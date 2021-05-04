import java.io.Console;

import Abstract.UserService;
import Concrete.ListenerManager;
import Concrete.ProducerManager;
import Concrete.Utilies;
import Entities.Album;
import Entities.Listener;
import Entities.Music;
import Entities.Producer;

public class main {

	public static void main(String[] args) {
	
		Producer producer = new Producer(0, "Ketvolkan1@gmail.com", "KetMusic");
		Producer producer2 = new Producer(1, "add@gmail.com", "MusicNet");
		
		Listener listener = new Listener(0,"abc@gmail.com", "Nazmi", "Becerik", "03432224234", 1999);
		Listener listener2 = new Listener(1,"adadass@gmail.com", "Mehmet", "Erbil", "0222224234", 1987);
		
		Album album = new Album(0,"Yanýk Sigara", 2021);
		Album album2 = new Album(1,"Patlamýþ Teker", 2020);
		Album[] albums = {album,album2};
		
		Music music = new Music(0,"Ayrýlacaðým", album, producer);
		Music music2 = new Music(0,"Elveda", album, producer);	
		Music music3 = new Music(0,"Yakýyorum", album2, producer2);
		Music music4 = new Music(0,"Gençliðimi", album2, producer2);
		Music[] musics = {music,music2,music3,music4};		
		
	    UserService producerManager = new ProducerManager();
	    System.out.println("");
	    System.out.println("*****Producer Ekleme*****");
	    producerManager.Add(producer);
	    producerManager.Add(producer2);
	    System.out.println("");
	    System.out.println("*****Albüm Ekleme*****");
	    ((ProducerManager)producerManager).addAlbum(album2);
	    ((ProducerManager)producerManager).addAlbum(album);
	    System.out.println("");
	    System.out.println("*****Muzik Ekleme*****");
	    ((ProducerManager)producerManager).addMusic(music2);
	    ((ProducerManager)producerManager).addMusic(music4);
	    ((ProducerManager)producerManager).addMusic(music3);
	    ((ProducerManager)producerManager).addMusic(music);
	    
	    UserService listenerManager = new ListenerManager();
	    System.out.println("");
	    System.out.println("*****Listener Ekleme*****");
	    listenerManager.Add(listener);
	    listenerManager.Add(listener2);
	    System.out.println("");
	    System.out.println("*****Müzik Beðenme Ekleme*****");
	    ((ListenerManager)listenerManager).likeMusic(music4, listener2);
	    ((ListenerManager)listenerManager).likeMusic(music3, listener);
	    System.out.println("");
	    Utilies.getAllAlbum(albums);
	    System.out.println("");
	    Utilies.getAllMusic(musics);
		

	}

}
