package skrull.rmi.server;


import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import skrull.game.controller.IServerController;
import skrull.game.view.IClientAction;

public class ServerListenerTest {

	IServerController mockController;
	private IServerListener listener;
	
	@Before
	public void setUp(){
		mockController = EasyMock.createNiceMock(IServerController.class);
		listener = new ServerListener(mockController);
	}
	
	
	@Test
	public void testProcessClientAction() throws Exception {
		IClientAction action = EasyMock.createNiceMock(IClientAction.class);

		
	    mockController.processClientAction(action);
	    EasyMock.expectLastCall();
	
	    EasyMock.replay(mockController);
		listener.processClientAction(action);
		EasyMock.verify(mockController);

		
	}
	
	

}
