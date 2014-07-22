package com.torsa;

import org.hibernate.Session;

import com.torsa.entity.Student;
import com.torsa.entity.StudentContact;
import com.torsa.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
            System.out.println("Maven + Hibernate + MySQL");
            Session session = HibernateUtil.getSessionFactory().openSession();
     
            session.beginTransaction();
            Student student=new Student();
            student.setFirstName("Torsa");
            student.setLastName("Das");
            StudentContact studentContact=new StudentContact();
            studentContact.setAddess("11 Bagha Jatin Road Kolkata 700036");
            studentContact.setStudent(student);
            studentContact.setPhone("9748707698");
            student.setStudentContact(studentContact);
            session.save(student);
            session.getTransaction().commit();
        }   
}
