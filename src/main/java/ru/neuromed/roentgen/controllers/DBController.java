package ru.neuromed.roentgen.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ru.neuromed.roentgen.db.fileRecord;
import ru.neuromed.roentgen.db.filesService;

@Controller
@RequestMapping(path="/files")
public class DBController {
	@Autowired
	private filesService FService;
	
	// Add new student
	@PostMapping(path="/add")
	public @ResponseBody String addNewFR (@RequestBody fileRecord s) {
		return FService.addFR(s);
	}
	
}
