package skrull.game.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import skrull.rmi.SkrullRMIException;
import skrull.rmi.client.IClientListener;
import skrull.rmi.server.IClientUpdater;

public class AbstractGameModelTest {

	private IClientUpdater updater;
	private AbstractGameModel game;
	private List<IPlayer> players;
	private IPlayer player1;
	private IPlayer player2;
	private final static UUID p1Id = UUID.randomUUID();;
	private final static UUID p2Id = UUID.randomUUID();;

	@Before
	public void setUp() throws Exception {
		
	
		updater = EasyMock.createMock(IClientUpdater.class);
		game = new DefaultGameModel(1, updater);

		players = new ArrayList<IPlayer>();

		players.add( player1 = EasyMock.createMock(IPlayer.class));
		players.add( player2 = EasyMock.createMock(IPlayer.class));
		
		for (IPlayer p: players){
			game.addPlayer(p);
		}
		
		EasyMock.expect(player1.getPlayerId()).andReturn(p1Id).anyTimes();
		EasyMock.expect(player2.getPlayerId()).andReturn(p2Id).anyTimes();

		
	}


	@Test
	public void testCheckActivity() throws Exception {

		updater.checkPlayerConnected(player1);
		EasyMock.expectLastCall();
		updater.checkPlayerConnected(player2);
		EasyMock.expectLastCall();

			
		EasyMock.replay(updater,player1, player2);
		game.checkActivity();
		EasyMock.verify(updater, player1, player2);

		
	
	}
	
	@Test
	public void testCheckActivityDisconnected() throws SkrullRMIException {
		final String msg = "abcdefg";
		updater.checkPlayerConnected(player1);
		EasyMock.expectLastCall();
		updater.checkPlayerConnected(player2);
		EasyMock.expectLastCall().andThrow(new SkrullRMIException(msg));
		
		
		updater.modelChanged(game);
		EasyMock.expectLastCall();


			
		EasyMock.replay(updater,player1, player2);
		game.checkActivity();
		assertEquals(msg, game.getBroadcastMessage());
		EasyMock.verify(updater, player1, player2);
	
	}
	
	
	
	@Test
	public void testChatUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetChatContents() {
		fail("Not yet implemented");
	}

	@Test
	public void testJoinGame() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessMove() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsGameOver() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWinner() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPlayers() {
		fail("Not yet implemented");
	}


	@Test
	public void testUpdateListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuit() {
		fail("Not yet implemented");
	}

}