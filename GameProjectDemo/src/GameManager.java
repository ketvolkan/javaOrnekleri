
public class GameManager implements IGameManager {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" Eklendi...");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" Silindi...");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" Güncellendi...");
		
	}

}
