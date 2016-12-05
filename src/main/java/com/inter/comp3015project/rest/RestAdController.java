package com.inter.comp3015project.rest;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inter.comp3015project.model.Ad;
import com.inter.comp3015project.service.AdService;

@RestController
@RequestMapping(value = "rest/ad")
public class RestAdController {

	@Autowired
	AdService adService;
	
	@RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Collection<Ad> getAds()
	{
		return this.adService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Ad createAd(@RequestBody Ad ad)
	{	
		System.err.println("AD: " + ad.getDesciption());
		return this.adService.save(ad);		
	}
}
