import java.util.*;
public class Main{
	public static void main(string[] args) throws NullPointerException
	Scanner sc=new Scanner (System.in);
	UserInput userinput =new ScannerInput;
	Object[] details= new Object[3];
	System.outprintln("Enter number of reccords to be Entered");
	int n = sc.nextInt();
	
	Student[] students= new Student[n];
	
	for(int i=0;i<n;i++)
	{
		details= userinput.input();
		
		students[i]= new Student();
		students[i]= setName((String)details[0]) ;
		students[i]= setPrn((Integer)details[1]);
		students[i]= setDob((String)details[2]);
	}
	
	Main m =new Main();
	m.display(students);
	}
	
	public void display(Student[] student){
		for(Student students: student){
			System.out.println(students.getName()+","+ students.getPrn()+","student.getDob());
		}	
	}	
}