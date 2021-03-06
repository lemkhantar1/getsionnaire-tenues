package entities;
// Generated Aug 26, 2016 11:30:02 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Mesure generated by hbm2java
 */
@Entity
@Table(name = "mesure", catalog = "bankelmaghrib")
public class Mesure implements java.io.Serializable {

	private Integer id;
	private String taille;
	private int pointure;
	private Set<Agent> agents = new HashSet<Agent>(0);

	public Mesure() {
	}

	public Mesure(String taille, int pointure) {
		this.taille = taille;
		this.pointure = pointure;
	}

	public Mesure(String taille, int pointure, Set<Agent> agents) {
		this.taille = taille;
		this.pointure = pointure;
		this.agents = agents;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "taille", nullable = false, length = 256)
	public String getTaille() {
		return this.taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	@Column(name = "pointure", nullable = false)
	public int getPointure() {
		return this.pointure;
	}

	public void setPointure(int pointure) {
		this.pointure = pointure;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mesure")
	public Set<Agent> getAgents() {
		return this.agents;
	}

	public void setAgents(Set<Agent> agents) {
		this.agents = agents;
	}

}
