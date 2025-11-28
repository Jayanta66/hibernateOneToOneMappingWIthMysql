package myhibernateOnetoOne.myhibernateOnetoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
System.out.println( "Project Started ...." );
        
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is java .");
		
		Answer answer= new Answer();
		answer.setAnswer_id(243);
		answer.setAnswer("Java is programming language ");
		q1.setAnswer(answer);


		
		Session s = factory.openSession();
		
		
		Transaction tx = s.beginTransaction();
	
		s.persist(q1);
		s.persist(answer);

		tx.commit();

		
		Question newQ = s.get(Question.class, 1212);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		
		s.close();
		
		
		factory.close();

    
    
    }
}
