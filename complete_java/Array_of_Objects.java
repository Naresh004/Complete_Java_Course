package complete_java;

class Student{
	int roll;
	String name;
	int marks;
}

public class Array_of_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = new int[5];
		
		Student s1 = new Student();
		s1.roll=1;
		s1.name="sai";
		s1.marks=50;
		
		Student s2 = new Student();
		s2.roll=10;
		s2.name="kiran";
		s2.marks=60;
		
		Student s3 = new Student();
		s3.roll=15;
		s3.name="varun";
		s3.marks=90;
		
		Student arr[] = new Student[3];  //creating array
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].name+" "+arr[i].marks);
		}
		
		int nums[] = {1,2,3,4,5};
		for(int n :nums) {
			System.out.print(n);
		}

	}

}
