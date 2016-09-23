package br.edu.ifspcaraguatatuba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Phone {

	@Id
	@Column
	@GeneratedValue
	private Integer idPhone;
	
	@Column
	private String number;
	@Column
	private String ddd;
	
	public Phone(){
		
	}
	
	
	
	public Integer getIdPhone() {
		return idPhone;
	}
	public void setIdPhone(Integer idPhone) {
		this.idPhone = idPhone;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
}
