package spring.di.entity;

public class NewLecExam implements Exam {
	
	private int kor;
	private int eng;
	private int math;
	private int com;

	@Override
	public int total() {
		return kor+eng+math+com;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total() / 4.0f;
	}

}
