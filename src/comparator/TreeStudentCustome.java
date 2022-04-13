package comparator;

import java.util.TreeSet;

public class TreeStudentCustome{
public static void main(String[] args)  {
	StudentnameComparator stdsortname=new StudentnameComparator();
	StudentrollComparator stdsortroll=new StudentrollComparator();
    StudentcityComparator stdsortcity=new StudentcityComparator();
		
    
    
       TreeSet <Student>treeset1=new TreeSet<Student>(stdsortname);	
		TreeSet <Student>treeset2=new TreeSet<Student>(stdsortroll);	
		TreeSet<Student> treeset3=new TreeSet<Student>(stdsortcity);	
		   
		Student std1=new Student("ram",10,"kolhapur");
		Student std2=new Student("nitin",20,"solhapur");
		Student std3=new Student("ravi",23,"sangli");
treeset1.add(std1);
treeset1.add(std2);
treeset1.add(std3);
System.out.println("sorted by name="+treeset1);

treeset2.add(std1);
treeset2.add(std2);
treeset2.add(std3);
System.out.println("sorted by roll="+treeset2);

treeset3.add(std1);
treeset3.add(std2);
treeset3.add(std3);
System.out.println("sorted by city="+treeset3);


}
}
