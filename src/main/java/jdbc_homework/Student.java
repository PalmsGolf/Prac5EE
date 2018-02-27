package jdbc_homework;

public class Student 
{	
	private int id;
	private String name;
	private int course;

        Student(String _name, int _course) 
        {
            name = _name;
            course = _course;
        }
	
	public int getId() 
        {
		return id;
	}
	
	public void setId(int id) 
        {
		this.id = id;
	}
	
	public String getPib() 
        {
		return name;
	}
	
	public void setName(String name) 
        {
		this.name = name;
	}
	
	public int getCourse() 
        {
		return course;
	}
	
	public void setCourse(int course) 
        {
		this.course = course;
	}

}
