package Java;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


import java.*;

public class conexion {

	 private static SessionFactory sessionFactory;

	    public static SessionFactory getSessionFactory() {
	         if (sessionFactory == null) {
	            try {
	                 Configuration configuration = new Configuration();

	                 // Hibernate settings equivalent to hibernate.cfg.xml's properties
	                 Properties settings = new Properties();
	                 settings.put(Environment.DRIVER, "oracle.jdbc.driver.OracleDriver");
	                 settings.put(Environment.URL, "jdbc:oracle:thin:@localhost:1521/freepdb1");
	                 settings.put(Environment.USER, "hr");
	                 settings.put(Environment.PASS, "oracle");
	               settings.put(Environment.DIALECT, "org.hibernate.dialect.Oracle8iDialect");

	                 settings.put(Environment.SHOW_SQL, "true");

	                 settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

	                 settings.put(Environment.HBM2DDL_AUTO, "update");

	                 configuration.setProperties(settings);
	                 configuration.addAnnotatedClass(Instituto.class);
	                 configuration.addAnnotatedClass(Grupo.class);
	                 ;
	                 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	                 .applySettings(configuration.getProperties()).build();
	                 System.out.println("Hibernate Java Config serviceRegistry created");
	                 sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	                 return sessionFactory;

	              } catch (Exception e) {
	                 e.printStackTrace();
	              }
	          }
	        return sessionFactory;
	    }
	}
	
	
	
