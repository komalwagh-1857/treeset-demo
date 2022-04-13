package comparator;

public class Student {
String name;
int roll;
String city;
Student(){
	
}
Student(String name,int roll,String city){
	this.name=name;
	this.roll=roll;
	this.city=city;
}
@Override
public String toString() {
	return "Student [name=" + name + ", roll=" + roll + ", city=" + city + "]";
}

}
