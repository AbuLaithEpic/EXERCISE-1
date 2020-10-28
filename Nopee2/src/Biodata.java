
public class Biodata {
	
	String name, status, examResult;
	int age;
	
	Biodata(){//default constructor
		this.name = "Abu Laith";
		this.status = "Single";
		this.examResult = "A";
		this.age = 20;
	}
	
	Biodata(String n, String s, String e, int a){//constructor with parameter
		this.name = n;
		this.status = s;
		this.examResult = e;
		this.age = a;
	}



	 
	public void printConstructor() {
		Biodata obj1 = new Biodata();
		Biodata obj2 = new Biodata("Abu Laith", "Single", "A", 20);
		
		System.out.println("-------------DEFAULT CONSTRUCTOR-------------------");
		System.out.println("Name : "+obj1.name);
		System.out.println("Status : "+obj1.status);
		System.out.println("Exam Result : "+obj1.examResult);
		System.out.println("Age : "+obj1.age);
		System.out.println("------------CONSTRUCTOR WITH PARAMETER--------------------");
		System.out.println("Name : "+obj2.name);
		System.out.println("Status : "+obj2.status);
		System.out.println("Exam Result : "+obj2.examResult);
		System.out.println("Age : "+obj2.age);
		
	}
	
}
