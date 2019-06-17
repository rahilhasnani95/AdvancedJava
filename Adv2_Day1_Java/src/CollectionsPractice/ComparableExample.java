package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students>
{
	int studentId;
	int marks;
	public Students(int studentId, int marks) {
		super();
		this.studentId = studentId;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", marks=" + marks + "]";
	}
	
	@Override
	public int compareTo(Students s) {
		return this.marks > s.marks ? -1 : this.marks < s.marks ? 1 : 0;
	}
	
}

public class ComparableExample {

	public static void main(String[] args) {
		List<Students> values = new ArrayList<>();
		values.add(new Students(1,65));
		values.add(new Students(2,88));
		values.add(new Students(3,63));
		values.add(new Students(4,94));
		values.add(new Students(5,77));
		
		Collections.sort(values);	
		
		/*
		 * for(Students s : values) { System.out.println(s); }
		 */
		
		values.forEach(System.out::println);
	}
	
	
	
}
