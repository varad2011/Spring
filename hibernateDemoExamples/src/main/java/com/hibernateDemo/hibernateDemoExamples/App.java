package com.hibernateDemo.hibernateDemoExamples;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
	public  void StoreToDatabaseUsingHibernate(String name, String lastName, String password, String emailId, String mobileNumber, String gender, String address ) {

        RegistrationDetails details = new RegistrationDetails();
        details.setName(name);
        details.setLastName(lastName);
        details.setPassword(password);
        details.setEmailId(emailId);
        details.setGender(gender);
        details.setMobileNumber(mobileNumber);
        details.setAddress(address);
        Configuration con = new Configuration().configure("/com/hibernateDemo/hibernateDemoExamples/hibernate.cfg.xml").addAnnotatedClass(RegistrationDetails.class);
    //   ServiceRegistry registory  =  new StandardServiceRegistryBuilder().applySettings(con.getProperties());
        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(details);
        tx.commit();
	}
    public static void main( String[] args )
    {
    	String name = "aksh";
    	String lastName = "ggg";
    	String password = "123"; 
    	String emailId = "qwq@defd.com";
    	String mobileNumber = "3232423";
    	String address = "addreasb";
    	String gender = "f";
      App hibernateDataBaseStore = new App();
      hibernateDataBaseStore.StoreToDatabaseUsingHibernate(name, lastName, password, emailId, mobileNumber, gender, address);
    	
    }
}
