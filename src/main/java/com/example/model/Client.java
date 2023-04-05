package com.example.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


//@entity treats as a database table.
@Getter
@Setter
@Entity
@Table(name="Client")
public class Client {
	
	//database column will be generated automaically and will be autoincreement in database.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id ;
	
	@Column(name="firstName", nullable=false)
	private String firstName;
	
	@Column(name="lastName", nullable=false)
	private String lastName ;
	
	@Column(name="email", nullable=false)
	private String email ;
	
	@Column(name="address", nullable=false)
	private String address ;
	
	@Column(name="city", nullable=false)
	private String city ;
	
	@Column(name="country", nullable=false)
	private String country ;
	
	@Column(name="contact", nullable=false)
	private String contact ;
	
	@Column(name="invest_obj", nullable=true)
	private String invest_obj ;
	
	@Column(name="finan_info", nullable=true)
	private String finan_info ;
	
	@Column(name="disclose_consent", nullable=false)
	private String disclose_consent;
	

}
