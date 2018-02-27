package jdbc_homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

@SuppressWarnings("deprecation")
@Repository
public class JdbcStudentsDAO implements StudentsDAO 
{
	private static final String SQL_INSERT_STUDENT = "INSERT INTO students values (0,?,?)";

	@Autowired
	private SimpleJdbcTemplate jt;
	
	@Override
	public void addStudent(Student student)
        {
		jt.update(SQL_INSERT_STUDENT,student.getPib(),student.getCourse());
	}

}
