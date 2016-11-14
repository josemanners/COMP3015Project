package com.inter.comp3015project.model;

import java.sql.Blob;

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
@Table(name="Ad")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ad")
public class Ad 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	@XmlAttribute
	private int id;
	
	@Column(name = "Title", nullable = false)
	@XmlAttribute
	private String title;
	
	@Column(name = "Descr", nullable = true)
	@XmlAttribute
	private String desciption;
	
	@Column(name = "Type", nullable = true)
	@XmlAttribute
	private int type;
	
	@Column(name = "Image", nullable = true)
	@XmlAttribute
	private Blob image;
	
	@Column(name = "Phone", nullable = true)
	@XmlAttribute
	private String phone;
	
	@Column(name = "Email", nullable = true)
	@XmlAttribute
	private String email;
	
	@Column(name = "OwnerID", nullable = true)
	@XmlAttribute
	private int ownerID;
	
	@Column(name = "Price", nullable = true)
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
