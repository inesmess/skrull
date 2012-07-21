package skrull.game.factory;

import skrull.game.controller.IGameController;
import skrull.game.model.IPlayer;

public interface IGameFactory {

	public enum GameType {
		DEFAULT,TIC_TAC_TOE,ROCK_PAPER_SCISSORS;
	}

	/**
	 * Should return a single GameController, with attendant gameModel and all leaf objects instantiated (except for additional players)
	 */
	public IGameController setupGame(GameType type,
			IPlayer startingPlayer);

	public String[] listAvailableGames();

}