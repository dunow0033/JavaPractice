package collections;

import java.util.Objects;

public class Student {
	
	private int studentid;
	private String studentname;
	private double score;
	
	@Override
	public int hashCode() {
		return Objects.hash(score, studentid, studentname);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		
//		return Double.doubleToLongBits(score) == Double.doubleToLongBits(other.score) && studentid == other.studentid
//				&& Objects.equals(studentname, other.studentname);
//	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	
}
