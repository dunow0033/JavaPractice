package newpackage;

import java.util.Scanner;

public class StudentMain {
	private Student studentarr[];
	private Scanner sc;
	public StudentMain()
	{
		sc = new Scanner(System.in);
		System.out.print("Enter how many students you want:  ");
		int noofstudent = sc.nextInt();
		studentarr = new Student[noofstudent];
		
		
//		sc=new Scanner(System.in);
//		System.out.println("Enter for how many students u want to have");
//		int noofstudent=sc.nextInt();
//		studentarr=new Student[noofstudent];
	}
	public void accept()
	{
		for(int i = 0; i < studentarr.length; i++)
		{
			Student s = new Student();
			System.out.print("Enter Student id:  ");
			s.setStudentid(sc.nextInt());
			System.out.print("Enter Student name:  ");
			s.setStudentname(sc.next());
			System.out.print("Enter Score  ");
			s.setScore(sc.nextInt());
			studentarr[i] = s;	
		}
	}
//	public void accept()
//	{
//		for(int x=0;x<studentarr.length;x++)
//		{
//			Student s=new Student();
//			
//			System.out.println("Enter Student id ");
//			s.setStudentid(sc.nextInt());
//			
//			System.out.println("Enter Student Name ");
//			s.setStudentname(sc.next());
//			
//			System.out.println("Enter Score ");
//			s.setScore(sc.nextInt());
//			
//			studentarr[x]=s;
//		}
//	}
	public void display()
	{
		for(Student sobj:studentarr)
		{
			if(sobj != null)
			{
				System.out.println("student id is "+sobj.getStudentid());
				System.out.println("Student Name is "+sobj.getStudentname());
				System.out.println("Score is "+sobj.getScore());
			}
		}
	}
	
	
	public void deleteStudent()
	{
		Student deleteobj = null;
		System.out.print("Enter Student id that you want to delete:  ");
		int id = sc.nextInt();
		for(int i = 0; i < studentarr.length; i++)
		{
			if(studentarr[i].getStudentid() == id)
			{
				studentarr[i] = null;
			}
		}
	}
	
	
	
//	public void deleteStudent()
//	{
//		Student deleteobj = null;
//		System.out.println("Enter Student id which you want to delete");
//		int id = sc.nextInt();
//		for(int x = 0; x < studentarr.length; x++)
//		{
//			if(studentarr[x].getStudentid() == id)
//			{
//				studentarr[x] = null;
//			}
//		}
//	}
	public static void main(String[] args) {
		StudentMain smain=new StudentMain();
		smain.accept();
		smain.deleteStudent();
		smain.display();
	}
}