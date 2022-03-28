package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sip.ams.entities.Etudiant;

@Controller
public class FirstController {
	
	@RequestMapping("/first")
	public String home(Model m)
	{
		String nom ="Mohamed Amine MEZGHICH";
		String universite ="ENSI";
		String email="amine.mezghich@gmail.com";
		String tel ="+216 51 36 36 34";
		
		m.addAttribute("name", nom);
		m.addAttribute("myUniversity",universite);
		
		m.addAttribute("email", email);
		m.addAttribute("tel",tel);
		
		ArrayList<String> cours = new ArrayList<>();
		cours.add("Java OCA");
		cours.add("Java OCP");
		cours.add("Spring");
		cours.add("Microservices");
		
		m.addAttribute("cours", cours);
		
		return "home/app";
	}
	
	@RequestMapping("/list")
	public String etudiants(Model m)
	{
		ArrayList<Etudiant> students = new ArrayList<>();
		students.add(new Etudiant("Aala", 25, "aala@gmail.com", "Tunis", 20200300));
		students.add(new Etudiant("Mehdi", 24, "mehdi@gmail.com", "Tunis", 50400200));
		students.add(new Etudiant("Amine", 28, "amine@gmail.com", "Tunis", 98100200));
		
		m.addAttribute("students", students);
		
		return "home/etudiants";
	}
	
	@RequestMapping("/add")
	public String addEtudiant(Model m)
	{
		
		return "home/addStudent";
	}

}
