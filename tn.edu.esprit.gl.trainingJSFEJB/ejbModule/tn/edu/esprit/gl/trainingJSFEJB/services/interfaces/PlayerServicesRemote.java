package tn.edu.esprit.gl.trainingJSFEJB.services.interfaces;

import javax.ejb.Remote;

import tn.edu.esprit.gl.trainingJSFEJB.domain.Player;

@Remote
public interface PlayerServicesRemote {
	boolean addPlayer(Player player);
}
