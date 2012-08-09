package skrull.game.factory;

import skrull.game.controller.IGameController;
import skrull.game.model.IPlayer;
import skrull.rmi.server.IClientUpdater;

public interface IGameFactory {

	public enum GameType {
		DEFAULT(true),TIC_TAC_TOE(false),ROCK_PAPER_SCISSORS(false);
		
		private boolean isDefault;

		GameType(boolean isDefault){
			this.isDefault = isDefault;
		}

		public boolean isDefault() {
			return isDefault;
		}

	}

	public static final int DEFAULT_GAME_ID = 0;

	/**
	 * Should return a single GameController,
	 *  with attendant gameModel and all leaf objects instantiated (except players)
	 *  
	 *  Should handle every type of GameType
	 * @param updater TODO
	 */
	public IGameController setupGame(GameType type, IPlayer startingPlayer, int gameId);

}