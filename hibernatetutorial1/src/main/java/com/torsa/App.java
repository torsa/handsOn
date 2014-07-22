package com.torsa;

import org.hibernate.Session;

import com.torsa.entity.Student;
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
            session.save(student);
            session.getTransaction().commit();
        }   
}
