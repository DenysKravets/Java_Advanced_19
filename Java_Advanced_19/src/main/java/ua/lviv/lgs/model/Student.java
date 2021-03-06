package ua.lviv.lgs.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String surname;
	
	private Integer age;
	
	@Lob
	private byte[] photo;

	public Student() {}

	public Student(String name, String surname, Integer age, byte[] photo) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.photo = photo;
	}

	public Student(Long id, String name, String surname, Integer age, byte[] photo) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.photo = photo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", photo="
				+ Arrays.toString(photo) + "]";
	}

	
	
	
}
