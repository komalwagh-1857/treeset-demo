package comparable;

import java.util.TreeSet;

public class StudentComparable {
public static void main(String[] args) {
	TreeSet treeset=new TreeSet();
	Student s1=new Student("ram","kolhapur",12);
	Student s2=new Student("neeta","sangli",13);
	Student s3=new Student("geeta","satara",14);
	Student s4=new Student("shyam","solhapur",15);

	treeset.add(s1);
	treeset.add(s2);
	treeset.add(s3);
	treeset.add(s4);
	System.out.println(treeset);
}
}
