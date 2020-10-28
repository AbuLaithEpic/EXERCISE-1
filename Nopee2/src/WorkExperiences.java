
public class WorkExperiences {
	String exp1, exp2;
	
	WorkExperiences(){//default constructor
		this.exp1 = "Restaurant Crew";
		this.exp2 = "Cashier";

	}
	
	WorkExperiences(String ex1, String ex2){//constructor with parameter
		this.exp1 = ex1;
		this.exp2 = ex2;

	}
	 
	public void printWorkExperiences() {//constructor with parameter
		WorkExperiences obj1 = new WorkExperiences();
		WorkExperiences obj2 = new WorkExperiences("Restaurant Crew","Cashier");
		
		
		System.out.println("---------DEFAULT CONSTRUCTOR-----------------------");
		System.out.println("Work Experiences : \n\t1)"+obj1.exp1 + "\n\t2)"+obj1.exp2);
		System.out.println("------------CONSTRUCTOR WITH PARAMETER--------------------");
		System.out.println("Work Experiences : \n\t1)"+obj2.exp1 + "\n\t2)"+obj2.exp2);
	}
}
