package tn.edu.esprit.gl.trainingJSFClient.junitTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tn.edu.esprit.gl.trainingJSFEJB.domain.Player;
import tn.edu.esprit.gl.trainingJSFEJB.services.interfaces.PlayerServicesRemote;

public class TestRealPlatform {

	private Context context;
	private PlayerServicesRemote playerServicesRemote;

	@Before
	public void init() {
		try {
			context = new InitialContext();
			String name = "ejb:tn.edu.esprit.gl.trainingJSF/tn.edu.esprit.gl.trainingJSFEJB/PlayerServices!"
					+ PlayerServicesRemote.class.getCanonicalName();
			playerServicesRemote = (PlayerServicesRemote) context.lookup(name);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void itShouldAddPlayer() {
		Player player = new Player();
		player.setId(1);
		player.setName("ramzi");
		Assert.assertTrue(playerServicesRemote.addPlayer(player));
	}

}
