package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	private int cod_usua;
	public int getCod_usua() {
		return cod_usua;
	}
	public void setCod_usua(int cod_usua) {
		this.cod_usua = cod_usua;
	}
	public String getNom_usua() {
		return nom_usua;
	}
	public void setNom_usua(String nom_usua) {
		this.nom_usua = nom_usua;
	}
	public String getApe_usua() {
		return ape_usua;
	}
	public void setApe_usua(String ape_usua) {
		this.ape_usua = ape_usua;
	}
	private String nom_usua;
	private String ape_usua;
	
}
