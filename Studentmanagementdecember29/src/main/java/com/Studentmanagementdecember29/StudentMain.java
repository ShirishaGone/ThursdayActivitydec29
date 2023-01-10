package com.Studentmanagementdecember29;
import java.lang.reflect.Executable;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	public static <Query, SessionFactory> void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.Session();
		session.beginTransaction();

		Student std=new Student();
		std.setRoll_no(1);
		std.setName("Shireesha");

		std.setMarks(95.89);

		Student std1=new Student(2,"Mounika",76.88);
		Student std2=new Student(3,"Srija",78.68);
		Student std3=new Student(4,"Sindhu",98.79);
		Student std4=new Student(5,"Asleetha",87.68);

		session.save(std3);
		session.save(std2);
		session.save(std1);
		session.save(std);

		session.save(std4);

		session.getTransaction().commit();

		System.out.println("1.View All Student Details 2.Update student name");
		System.out.println("3.Delete student details   4.View Specific student details");

		int option;
			Scanner sc=new Scanner(System.in);
			System.out.println("Select the option");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				try
				{
					Query query01=session.createQuery("from Student");
					List list=query01.List();
					System.out.println(list);

				}
				catch(Exception e)
				{
				System.out.println(e);
				}
			case 2:
				try
				{
					session.beginTransaction();
					Query query02=session.createQuery("update Student set name='Srija' where roll_no='3'");
					int list02=query02.hashCode();
					System.out.println("Row are updated"+list02);
					session.getTransaction().commit();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			case 3:
				try
				{
					int num1;
					System.out.println("Enter the roll number");
					num1=sc.nextInt();
					session.beginTransaction();
					Query query03=session.createQuery("delete from Student where roll_no="+num1 );
					int list03=query03.hashCode();
					session.getTransaction().commit();


				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			case 4:
				try
				{
					int num2;
					System.out.println("Enter the roll number");
					num2=sc.nextInt();
					session.beginTransaction();
					Query query04=session.createQuery("from Student where roll_no="+num2);
					List list=query04.List();
					System.out.println(list);
					session.getTransaction().commit();

				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			case 5:
				try
				{

				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			}

}
