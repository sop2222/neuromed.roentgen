package ru.neuromed.roentgen.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/upload")

public class UploadController {

	@GetMapping
	public String upload(
		@RequestParam(name="name", required=false, defaultValue="command.com") String name, Model model) {
		model.addAttribute("name", name);
		return "Upload.html";
	}

}
