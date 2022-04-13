package comparable;

import java.util.Comparator;

public class Student implements Comparable<Student> {
String name;
String city;
int rollno;
Student(){
	
}
Student(String name,String city,int rollno){
	this.name=name;
	this.city=city;
	this.rollno=rollno;
	
}
@Override
public String toString() {
	return "Student [name=" + name + ", city=" + city + ", rollno=" + rollno + "]";
}
@Override
public int compareTo(Student a1) {
	
	return a1.name.compareTo(this.name);
}

}

