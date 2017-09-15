
public class Patient {
	
	private String name;
	private int age;
	
	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
	};
	
	public String getName() {return name;};
	
	public int getAge() {return age;}
	
	public String toString() {
		return "Patient " + name + " is " + age + " years old.";
	}
	
	public double dosage() {
		return 600.0;
	}
	
	public double bmi(double heightInMeters, 
			double weightInKilograms) {
		return weightInKilograms/Math.sqrt(heightInMeters);
	}
	
	public double bmi(double height, String heightUnits, 
			double weight, String weightUnits) {
		double heightInMeters, weightInKilograms;
		if(heightUnits.contains("in")) heightInMeters = height*0.0254;
		else if (heightUnits.contains("cm")) heightInMeters = height*0.01;
		else heightInMeters = height;
		
		if(weightUnits.contains("lbs")) weightInKilograms = weight*0.453592;
		else if (weightUnits.contains("stone")) weightInKilograms = weight*6.35029;
		else weightInKilograms = weight;
		
		return weightInKilograms/Math.sqrt(heightInMeters);
	}
}
