package com.Rama_Solution.backend_pfe.entities;
import javax.persistence.*;

@Entity
@Table(name = "Album")
public class Album {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "type")
	private String type;
	@Column(name = "picByte", length = 1000)
	private byte[] picByte;
	
	//@ManyToMany
	//private Eleve fk_photo;

	public Album() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/*public Eleve getFk_photo() {
		return fk_photo;
	}

	public void setFk_photo(Eleve fk_photo) {
		this.fk_photo = fk_photo;
	}
*/
	public Album(String name, String type, byte[] picByte) {
		super();
		this.name = name;
		this.type = type;
		this.picByte = picByte;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getPicByte() {
		return picByte;
	}

	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}
	

	
}

