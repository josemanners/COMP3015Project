package com.inter.comp3015project.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "user")
public class User
{
	@XmlAttribute
	private int id;
	@XmlAttribute
    private String firstName;
	@XmlAttribute
    private String middleName;
	@XmlAttribute
    private String paternalSurname;
	@XmlAttribute
    private String maternalSurname;
	@XmlAttribute
    private Date birthDate;
	@XmlAttribute
    private String userName;
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
