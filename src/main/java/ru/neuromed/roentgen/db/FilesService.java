package ru.neuromed.roentgen.db;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class filesService {
	@Autowired
	private FileRepo filesRepository;
	
	// Add new file record
	public String addFR(fileRecord s) {
		
		try {
			filesRepository.save(s);
			return "saved";
		} catch(Exception e) {
			return "failed";
		}
	}
    // Update a file record
	public String updateFR(Integer id, fileRecord s) {
		try {
			s.setId(id);
			filesRepository.save(s);
			return "Updated";
		}catch(Exception e) {
			return "Failed";
		}
	}


	// Get all file records
	public Iterable<fileRecord> getAllFR(){
		return filesRepository.findAll();
	}


	// Get single file record by Id
	public Optional<fileRecord> getFR(Integer id) {
		return filesRepository.findById(id);
	}


	// Delete a file record
	public String deleteFR(Integer id) {
		try{
			filesRepository.deleteById(id);
			return "Deleted";
		}catch(Exception e) {
			return "Failed";
		}
}

}
