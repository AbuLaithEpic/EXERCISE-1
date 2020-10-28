
public class WorkSkills {
	String skill1, skill2;
	
	WorkSkills(){//default constructor
		this.skill1 = "MS Package";
		this.skill2 = "JAVA Programming";

	}
	
	WorkSkills(String sk1, String sk2){//constructor with parameter
		this.skill1 = sk1;
		this.skill2 = sk2;

	}
	 
	public void printWorkSkills() {
		WorkSkills obj1 = new WorkSkills();
		WorkSkills obj2 = new WorkSkills("MS Package","JAVA Programming");
		
		System.out.println("------------DEFAULT CONSTRUCTOR--------------------");
		System.out.println("Work Skills : \n\t1)"+obj1.skill1 + "\n\t2)"+obj1.skill2);
		System.out.println("----------CONSTRUCTOR WITH PARAMETER----------------------");
		System.out.println("Work Skills : \n\t1)"+obj2.skill1 + "\n\t2)"+obj2.skill2);
	}
	
}

