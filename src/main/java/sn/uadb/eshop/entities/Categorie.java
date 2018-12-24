package sn.uadb.eshop.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categorie")
public class Categorie implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4643654811812210011L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idcat;
	private String nomCat;
	private String descriptionCat;
	@OneToMany(mappedBy="categorie")
	private List<Article> articles;
	
	  
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Categorie(String nomCat, String descriptionCat) {
		super();
		this.nomCat = nomCat;
		this.descriptionCat = descriptionCat;
	}
	
	

}
