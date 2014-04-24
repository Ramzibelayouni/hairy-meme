package tn.edu.esprit.gl.trainingJSFEJB.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity

public class Player implements Serializable {

	
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	public Player() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
