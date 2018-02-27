package jdbc_homework;

import org.springframework.beans.factory.annotation.Autowired;

public class WorkWithStudents
{
	
	@Autowired
	private StudentsDAO studentsDAO;
	
	public void saveStudentToDb(Student student) 
        {
		if(student != null && student.getPib() != null && !"".equals(student.getPib()) && student.getCourse() > 0) 
                {
			studentsDAO.addStudent(student);
			System.out.println("Student have been saved: "+student.getPib());
		}
	}
	
}
