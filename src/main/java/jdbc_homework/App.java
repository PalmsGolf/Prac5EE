/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author rottenmagnolia
 */

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        WorkWithStudents worker = (WorkWithStudents) context.getBean("worker");
        //new WorkWithStudents();
        Student testStudent = new Student("Vova", 3);
        worker.saveStudentToDb(testStudent);

    }
}
