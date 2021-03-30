package chap11.verify.exam03;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	// 작성 위치
    @Override
	public int hashCode() {
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stobj = (Student) obj;
			if(hashCode() == stobj.hashCode()) {
				return true;
			}
		}
		return false;
	}
}