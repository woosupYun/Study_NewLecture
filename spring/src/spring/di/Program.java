package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;

public class Program {
	public static void main(String[] args) {

		/* 스프링에서 지시하는 방법으로 코드를 변경
		//Exam exam = new NewLecExam();
		Exam exam = new NewLecExam(10,10,10,10);
		ExamConsole console = new GridExamConsole(exam);
		
		console.setExam(exam);
		*/
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		
		// 형식변환으로 값 꺼내기
		ExamConsole console = (ExamConsole) context.getBean("console");
				
		// 해당 형식에 맞는 값으로 꺼내달라고 하기
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}
}
