
public class ChildPatient extends Patient {
	
	private String parentName;
	
	public ChildPatient(String name, int age, String parentName) {
		super(name, age);
		this.parentName = parentName;
	}
	
	public String getParentName() {return parentName;}
	
	public String toString() {
		return "Patient " + getName() + " is " + getAge() + " years old" + 
				" and has parent " + parentName + ".";
	}
	
	public double dosage() {
		return 300.0;
	}
	
}
