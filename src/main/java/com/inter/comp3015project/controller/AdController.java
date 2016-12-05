package com.inter.comp3015project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inter.comp3015project.model.Ad;
import com.inter.comp3015project.model.User;
import com.inter.comp3015project.service.AdService;

@Controller
public class AdController
{
	@Autowired
	AdService adService;

	@RequestMapping("/")
	public String displayAllAds(Model model)
	{
		List<Ad> ads = adService.findAll();
		model.addAttribute("ads", ads);
		return "ads";
	}

	@RequestMapping("/ads/type/{type}")
	public String displayAllAdsOfType(@PathVariable int type, Model model)
	{
	    List<Ad> ads = adService.findByAdType(type);
	    model.addAttribute("ads", ads);
	    return "ads";
	}

	@RequestMapping(value = "/ad/new", method = RequestMethod.GET)
	public String createArticle(Model model)
	{
	    Ad ad = new Ad();
	    model.addAttribute("ad", ad);
	    return "adform";	// tengo que cambiar el nombre basado en lo que Christopher Pagan y Kathereen Rivera diseñen en HTML
	}

	@RequestMapping(value = "/ad/new", method = RequestMethod.POST)
	public String saveAd(@ModelAttribute("ad") @Valid Ad ad, BindingResult result, @AuthenticationPrincipal User currentUser)
	{
		if (result.hasErrors())
		{
		    return "adform"; // tengo que cambiar el nombre basado en lo que Christopher Pagan y Kathereen Rivera diseñen en HTML
		}
		ad.setOwnerID(currentUser.getId());
		adService.save(ad);
		return "redirect:/ads";
	}

	@RequestMapping("/ads/{id}")
	public String displayAd(Model model, @PathVariable int id)
	{
	    Ad ad = adService.findById(id);
	    model.addAttribute("ad", ad);
	    return "ad";
	}

	@RequestMapping(value = "/delete/{id}")
	public String deleteAd(@PathVariable int id)
	{
	    adService.delete(adService.findById(id));
	    return "redirect:/ads";
	}
}
