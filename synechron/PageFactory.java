package synechron;

import java.util.Objects;

public class PageFactory {
	    
	    // Private fields (attributes)
	    private String name;
	    private int age;
	    private String address;

	    // No-argument constructor (optional but common in POJOs)
	    public PageFactory() {
	    }

	    // Constructor with parameters (optional, if needed)
	    public PageFactory(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    // Getter method for name
	    public String getName() {
	        return name;
	    }

	    // Setter method for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter method for age
	    public int getAge() {
	        return age;
	    }

	    // Setter method for age
	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Getter method for address
	    public String getAddress() {
	        return address;
	    }

	    // Setter method for address
	    public void setAddress(String address) {
	        this.address = address;
	    }

	    // Optionally override the toString() method for better readability
	    @Override
	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + ", address='" + address + "'}";
	    }

	    // Optionally override equals() and hashCode() for object comparison and hashing
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        //Person person = (Person) obj;
	        PageFactory abhilash = (PageFactory) obj;
	        return age == abhilash.age &&
	               name.equals(abhilash.name) &&
	               address.equals(abhilash.address);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, age, address);
	    }
	

}
