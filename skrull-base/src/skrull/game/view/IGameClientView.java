package skrull.game.view;

import skrull.game.model.IGameModel;

/**
 * The primary view interface
 *
 */
public interface IGameClientView {

	public abstract void modelChanged(IGameModel model);

	public abstract String getChatText();

}