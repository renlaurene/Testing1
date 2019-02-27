package ClientApplication;

import Domain.*;
import Service.*;

import java.util.List;
import java.util.ArrayList;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {
	public static void main(String args[]) {
		ApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
		CheckoutService checkoutService = (CheckoutService) container.getBean("checkoutService");
		Student student;
		List<Course> courses = new ArrayList<>();
		
		courses.add(new Course("data structure", "Computer Science", false, 3, 50));
		courses.add(new Course("Chemistry", "Chemistry", true, 3, 30));
		
		student = new Student("Tony", 123, false, true, courses);
		checkoutService.checkout(student, courses, "12321312");
	}
}
