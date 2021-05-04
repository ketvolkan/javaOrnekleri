package Abstract;

import Entities.Album;
import Entities.Music;

public interface IProducerService {
	void addAlbum(Album album);
	void addMusic(Music music);
}
