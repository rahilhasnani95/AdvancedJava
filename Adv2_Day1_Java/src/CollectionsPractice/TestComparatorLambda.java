package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student
{
	int studentId;
	int marks;
	public Student(int studentId, int marks) {
		super();
		this.studentId = studentId;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", marks=" + marks + "]";
	}
}	
	
public class TestComparatorLambda {

	public static void main(String[] args) {
		
		List<Student> values = new ArrayList<>();
		values.add(new Student(1,65));
		values.add(new Student(2,88));
		values.add(new Student(3,63));
		values.add(new Student(4,94));
		values.add(new Student(5,77));

		Collections.sort(values, (s1,s2) -> 
		{
			return s1.marks > s2.marks? -1: s1.marks < s2.marks? 1: 0;
		});
		
		for(Student s : values) System.out.println(s);			
	}
}

