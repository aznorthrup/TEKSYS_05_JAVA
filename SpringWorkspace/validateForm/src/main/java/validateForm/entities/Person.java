package validateForm.entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
	@NotNull
	@Size(min=2, max=30, message="Name must be greater than 2 and less than 40 characters!")
	private String name;
	@NotNull(message="Field cannot be left blank!")
	@Min(value=18, message="Must be over 18!")
	private Integer age;
	
	Person(){}
	
	Person(String name, Integer age){
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person name: " + name + "\nPerson age: " + age;
	}
	
}
