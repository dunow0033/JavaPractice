package collections;

public class StudentMain {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentid(1);
		student1.setStudentname("Jorden");
		student1.setScore(90);
		Student student2 = new Student();
		student2.setStudentid(1);
		student2.setStudentname("Jorden");
		student2.setScore(90);
		
		if(student1.equals(student2))
		{
			System.out.println("Both students are equal");
		}
		else
		{
			System.out.println("Students are not equals");
		}
	}
		
//		if(student1.equals(student2))
//		{
//			System.out.println("Both students are equal");
//		}
//		else
//		{
//			System.out.println("Students are not equals");
//		}
//		}

}
