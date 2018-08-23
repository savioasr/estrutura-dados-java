import java.util.Comparator;

public class Person implements Comparator<Person>, Comparable<Person> {

	private String name;
	private Integer  age;
	
	Person() {
		
	}
	
	Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compare(Person p1, Person p2) {
		return p1.age - p2.age;
	}

	@Override
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
	}

}
