package attendance;

import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceOperation 
{
	public StudentAttendance attendance(ArrayList<Student> student)
	{
		  Scanner scanner = new Scanner (System.in);
		  
		  System.out.println("Please enter the date");
		  String date = scanner.nextLine();
		  
		  System.out.println("Please enter the course title");
		  String title = scanner.nextLine();
		  
		  System.out.println("Please enter the year");
		  int year = scanner.nextInt();
		  
		  StudentAttendance attendance = new StudentAttendance(title, date,year);
		  attendance.takeAttendance(student);
		  return attendance;
	}
	
	
	
	
	public void searchAttendancebytitle(ArrayList<StudentAttendance> attendance)
	{
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please enter the course title"+"\n");
		String title = scanner.nextLine();
		  
		  for(StudentAttendance Attendance : attendance ) 
		  {
			  if(Attendance.title.equalsIgnoreCase(Attendance.title) == true)
			 {
				 this.displayAttendance(Attendance); 
				 return; //
		         }	  
		  }
	 }
	
	
	
	public void displayAttendance(StudentAttendance attendance)
	{
		System.out.println("Date: "+attendance.date+ "\n");
		System.out.println("Title:"+attendance.title+"\n");
		System.out.println("Year: "+attendance.year+ "\n");
		
		for(Student s: attendance.studentAttendance) 
		{
			(new StudentOperation()).display(s);
		}			
	}
}