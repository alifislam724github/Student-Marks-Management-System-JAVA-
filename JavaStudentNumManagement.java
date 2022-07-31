import java.util.Scanner;
import java.util.Formatter;
import java.io.*;
//import java.io.FileNotFoundException;
public class JavaStudentNumManagement extends StudentNumManagement
{
	private String teacherName;
	private String teacherID;
	
	
	public JavaStudentNumManagement()
	{
		//System.out.println();
	}
	public void setTeacherName(String teacherName)
	{
		this.teacherName=teacherName;
	}
	public String getTeacherName()
	{
		return teacherName;
	}
	public void setTeacherID(String teacherID)
	{
		this.teacherID=teacherID;
	}
	public String getTeacherID()
	{
		return teacherID;
	}
	
	
	public void CourseTeacherInformation()
	{
		Scanner obj11=new Scanner(System.in);
		System.out.print("Enter course teacher name:");
		String teacherName=obj11.nextLine();
		System.out.println("Teacher name:"+teacherName);
		
		System.out.print("Enter course teacher id:");
		String teacherID=obj11.nextLine();
		System.out.println("Teacher id:"+teacherID);
		
		try
		{System.out.print("Enter course  id:");
		int courseID=obj11.nextInt();
		System.out.println("Teacher id:"+teacherID);
		}catch(Exception i)
		{
			System.out.println("Please Input an integer number") ; 
		}
		
	}
	void getInformation()
	{
		try {Formatter fobj=new Formatter("C:/Users/ASUS/Desktop/project/student.txt");
		Scanner objw=new Scanner(System.in);
		System.out.print("Enter total number of student of the section :");
		int x=objw.nextInt();
		
		for (int i=1;i<=x;i++)
		{
			
		Scanner obj=new Scanner(System.in);
			
			
		System.out.println("Enter student name:");
		String name=obj.nextLine();
		System.out.println("student name:"+name);
		
		System.out.print("Enter student id:");
		String id=obj.nextLine();
		System.out.println("Student id:"+id);
		
		System.out.print("Enter student section:");
		String section=obj.nextLine();
		System.out.println("Student section:"+section);
		
		System.out.print("Enter student course:");
		String course=obj.nextLine();
		System.out.println("Student course:"+course);
		
		
		System.out.print("Enter student mid mark:");
		double midMark=obj.nextDouble();
		System.out.println("mid mark:"+midMark);
		
		System.out.print("Enter student final mark if final don't held yet enter 0:");
		double finalMark=obj.nextDouble();
		System.out.println("final mark:"+finalMark);
		
		double totalMark=0.4*midMark+0.6*finalMark;
		System.out.println("total mark:"+totalMark);
		
		fobj.format("%s %s %s %s %s %s\r\n", name,id,section,midMark,finalMark,totalMark);
		
		
		}
			fobj.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
			
		}
		
		
			
	}
	void readFile()
	{
		
		{
			try 
			{
				File file=new File("C:/Users/ASUS/Desktop/project/student.txt");
				Scanner scanner=new Scanner(file);
				
				while(scanner.hasNext()) 
				{
					String name=scanner.next();
					String id=scanner.next();
					String section=scanner.next();
					String midMark=scanner.next();
					String finalMark=scanner.next();
					String totalMark=scanner.next();
					System.out.println("file has been read");
					System.out.println("name:"+name+"--id:"+id+" --section:"+section+" --mid mark:"+midMark+"-- final mark"+finalMark+"-- total mark:"+totalMark);
					
					
				}
				scanner.close();
					
			}catch (FileNotFoundException e)
			{
				System.out.println(e);
			}
			
		}	
		
	}

	
}