package ua.lviv.lgs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.model.Student;
import ua.lviv.lgs.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Transactional
	public void create(Student participant) {
		studentRepository.save(participant);
	}
	
	public Student read(Long id) {
		return studentRepository.findById(id).get();
	}
	
	public void update(Student participant) {
		studentRepository.save(participant);
	}
	
	public void delete(Student participant) {
		studentRepository.delete(participant);
	}

	
	
}
