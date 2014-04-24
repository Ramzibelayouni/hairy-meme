package tn.edu.esprit.gl.trainingJSFWeb;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import tn.edu.esprit.gl.trainingJSFEJB.domain.Player;
import tn.edu.esprit.gl.trainingJSFEJB.services.interfaces.PlayerServicesLocal;

@ManagedBean
@ViewScoped
public class PlayerBean {

	// models
	private Player player = new Player();

	// injection de proxy
	@EJB
	private PlayerServicesLocal playerServicesLocal;

	// methodes

	public String doAddPlayer() {
		playerServicesLocal.addPlayer(player);
		return "";
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
