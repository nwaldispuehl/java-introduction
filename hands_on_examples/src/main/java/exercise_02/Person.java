package exercise_02;

public class Person {

	private String name;
	private int yearOfBirth;

	public Person(String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	public int getAgeIn(int year) {
		return year - yearOfBirth;
	}
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	
	public String compareAgeWith(Person otherPerson) {
		if (yearOfBirth < otherPerson.getYearOfBirth()) {
			return "...";
		}
		else {
			return "...";
		}
	}
}
