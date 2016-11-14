package com.inter.comp3015project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="User")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "user")
public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	@XmlAttribute
	private int id;
	
	@Column(name = "FirstName", nullable = false)
	@XmlAttribute
    private String firstName;
	
	@Column(name = "MiddleName", nullable = true)
	@XmlAttribute
    private String middleName;
	
	@Column(name = "PaternalSurname", nullable = false)
	@XmlAttribute
    private String paternalSurname;
	
	@Column(name = "MaternalSurname", nullable = true)
	@XmlAttribute
    private String maternalSurname;
	
	@Column(name = "BirthDate", nullable = false)
	@XmlAttribute
    private Date birthDate;
	
	@Column(name = "UserName", nullable = false)
	@XmlAttribute
    private String userName;
	
	@Column(name = "Password", nullable = false)
	@XmlAttribute
    private String password;
    
	public User()
	{
		super();
	}
	
	public User(int id, String firstName, String paternalSurname, Date birthDate)
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.paternalSurname = paternalSurname;
		this.birthDate = birthDate;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getMiddleName()
	{
		return middleName;
	}
	
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	
	public String getPaternalSurname()
	{
		return paternalSurname;
	}
	
	public void setPaternalSurname(String paternalSurname)
	{
		this.paternalSurname = paternalSurname;
	}
	
	public String getMaternalSurname()
	{
		return maternalSurname;
	}
	
	public void setMaternalSurname(String maternalSurname)
	{
		this.maternalSurname = maternalSurname;
	}
	
	public Date getBirthDate()
	{
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
}
