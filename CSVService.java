package com.crud.demo;

	import java.io.ByteArrayInputStream;
	import java.io.IOException;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.web.multipart.MultipartFile;


	@Service
	public class CSVService  {
	  @Autowired
	  UserRepository repository;

	  public void save(MultipartFile file) {
	    try {
	      List<Details> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
	      repository.saveAll(tutorials);
	    } catch (IOException e) {
	      throw new RuntimeException("fail to store csv data: " + e.getMessage());
	    }
	  }

	  public ByteArrayInputStream load() {
	    List<Details> tutorials = repository.findAll();

	    ByteArrayInputStream in = CSVHelper.tutorialsToCSV(tutorials);
	    return in;
	  }

	  public List<Details> getAllTutorials() {
	    return repository.findAll();
	  }
	}

