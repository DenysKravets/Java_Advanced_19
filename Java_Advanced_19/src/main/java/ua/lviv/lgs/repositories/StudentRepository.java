package ua.lviv.lgs.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.lgs.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
