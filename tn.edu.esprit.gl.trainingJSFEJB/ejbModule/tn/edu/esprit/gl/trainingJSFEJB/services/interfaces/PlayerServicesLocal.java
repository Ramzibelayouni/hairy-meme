package tn.edu.esprit.gl.trainingJSFEJB.services.interfaces;

import javax.ejb.Local;

import tn.edu.esprit.gl.trainingJSFEJB.domain.Player;

@Local
public interface PlayerServicesLocal {
	boolean addPlayer(Player player);
}
