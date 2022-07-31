import java.util.Scanner;
import java.util.Formatter;
public abstract class StudentNumManagement
{
	private String name;
	private String id;
	private String course;
	private String section;
	private double midMark;
	private double finalMark;
	private double totalMark;
	
	public StudentNumManagement()
	{
		
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	void setId(String id)
	{
		this.id=id;
	}
	void setCourse(String course)
	{
		this.course=course;
	}
	void setSection(String section)
	{
		this.section=section;
	}
	String getName()
	{
		return name;
	}
	String getId()
	{
		return id;
	}
	String getCourse()
	{
		return course;
	}
	String getSection()
	{
		return section;
	}
	
	void getMidMark(double midMark)
	{
		this.midMark=midMark;
	}
	
	void getFinalMark()
	{
	this.finalMark=finalMark;
	}
	double setFinalMark()
	{
		return finalMark;
	}
	double getTotalMark()
	{
		return totalMark;
	}
	void getInformation()
	{
		
		
			
	}
	
	abstract public void CourseTeacherInformation();
	
	
}