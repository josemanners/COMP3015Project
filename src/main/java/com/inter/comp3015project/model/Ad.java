package com.inter.comp3015project.model;

import java.sql.Blob;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ad")
public class Ad 
{
	@XmlAttribute
	private int id;
	@XmlAttribute
	private String title;
	@XmlAttribute
	private String desciption;
	@XmlAttribute
	private int type;
	@XmlAttribute
	private Blob image;
	@XmlAttribute
	private String phone;
	@XmlAttribute
	private String email;
	@XmlAttribute
	private int ownerID;
	@XmlAttribute
	private double price;
	
	public Ad()
	{
		super();
	}
	
	public Ad(int id, String title)
	{
		super();
		this.id = id;
		this.title = title;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getDesciption()
	{
		return desciption;
	}

	public void setDesciption(String desciption)
	{
		this.desciption = desciption;
	}

	public int getType()
	{
		return type;
	}

	public void setType(int type)
	{
		this.type = type;
	}

	public Blob getImage()
	{
		return image;
	}

	public void setImage(Blob image)
	{
		this.image = image;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public int getOwnerID()
	{
		return ownerID;
	}

	public void setOwnerID(int ownerID)
	{
		this.ownerID = ownerID;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
}
