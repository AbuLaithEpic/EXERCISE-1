
public class NewCGPA {
	double gpa[] =new double[4];
	double cgpa;
	
	NewCGPA(){//default constructor
		this.gpa= new double[]{3.5, 3.5, 3.4, 3.6};
		this.cgpa=3.5;
	}
	
	NewCGPA(double a[], double b){//constructor with parameter
		this.gpa= a;
		this.cgpa=b;
	}
	
	public void printCGPA() {
		NewCGPA obj1 = new NewCGPA();
		NewCGPA obj2 = new NewCGPA(new double[]{3.5, 3.5, 3.4, 3.6} , 3.5);
		
		//default
		System.out.println("------------DEFAULT CONSTRUCTOR-------------");
		double sum=0, finalCGPA=0;
		for(int i=0; i<obj1.gpa.length; i++) {
			sum+= obj1.gpa[i];
			System.out.println("GPA Sem"+i+ " : "+obj1.gpa[i]);
		}
		finalCGPA= sum/obj1.gpa.length;
		System.out.println("Average GPA "+finalCGPA);
		System.out.println("CGPA : "+obj1.cgpa);
		
		//parameter
		System.out.println("------------CONSTRUCTOR WITH PARAMETER---------");
		double sum2=0, finalCGPA2=0;
		for(int i=0; i<obj2.gpa.length; i++) {
			sum2= obj2.gpa[i]+sum2;	
			System.out.println("GPA Sem"+i+ " : "+obj2.gpa[i]);
		}
		finalCGPA2=(sum2/obj1.gpa.length);
		System.out.println("Average GPA : "+finalCGPA2);
		System.out.println("CGPA : "+ obj2.cgpa);
		
		
		
	}
}
