package tn.edu.esprit.gl.trainingJSFEJB.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.gl.trainingJSFEJB.domain.Player;
import tn.edu.esprit.gl.trainingJSFEJB.services.interfaces.PlayerServicesLocal;
import tn.edu.esprit.gl.trainingJSFEJB.services.interfaces.PlayerServicesRemote;

/**
 * Session Bean implementation class PlayerServices
 */
@Stateless
public class PlayerServices implements PlayerServicesRemote,
		PlayerServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public PlayerServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addPlayer(Player player) {
		boolean b = false;
		try {
			entityManager.persist(player);
			b = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;
	}

}
