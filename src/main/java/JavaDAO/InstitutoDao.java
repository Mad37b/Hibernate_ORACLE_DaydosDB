package JavaDAO;

import java.util.List;

import java.*;

import org.hibernate.Session;
import org.hibernate.Transaction;



import Java.Instituto;

public class InstitutoDao {


public void saveInstituto(Instituto saveInstituto) {
	Transaction transaction = null;
	try (Session session = Java.conexion.getSessionFactory().openSession()) {
		// start a transaction
		transaction = session.beginTransaction();
		// save the country object
		session.save(saveInstituto);
		// commit transaction
		transaction.commit();
	} catch (Exception e) {
		if (transaction != null) {
			transaction.rollback();
		}
		e.printStackTrace();
	}
}

/**
 * Update User
 * @param user
 */
public void updateInstituto(Instituto updateInstituto) {
	Transaction transaction = null;
	try (Session session = Java.conexion.getSessionFactory().openSession()) {
		// start a transaction
		transaction = session.beginTransaction();
		// save the student object
		session.update(updateInstituto);
		// commit transaction
		transaction.commit();
	} catch (Exception e) {
		if (transaction != null) {
			transaction.rollback();
		}
		e.printStackTrace();
	}
}

/**
 * Delete User
 * @param id
 */
public void deleteUser(int id) {

	Transaction transaction = null;
	try (Session session = Java.conexion.getSessionFactory().openSession()) {
		// start a transaction
		transaction = session.beginTransaction();

		// Delete a user object
		Instituto aCountry = session.get(Instituto.class, id);
		if (aCountry != null) {
			session.delete(aCountry);
			System.out.println("user is deleted");
		}

		// commit transaction
		transaction.commit();
	} catch (Exception e) {
		if (transaction != null) {
			transaction.rollback();
		}
		e.printStackTrace();
	}
}

/**
 * Get User By ID
 * @param String
 * @return
 */
public Instituto getInstituto(String id) {

	Transaction transaction = null;
	Instituto getInstituto = null;
	try (Session session = Java.conexion.getSessionFactory().openSession()) {
		// start a transaction
		transaction = session.beginTransaction();
		// get an user object
		getInstituto = session.get(Instituto.class, id);
		// commit transaction
		transaction.commit();
	} catch (Exception e) {
		if (transaction != null) {
			transaction.rollback();
		}
		e.printStackTrace();
	}
	return getInstituto;
}

/**
 * Get all Users
 * @return
 */
@SuppressWarnings("unchecked")
public List<Instituto> getAllUser() {

	Transaction transaction = null;
	List<Instituto> listOfInstitutos = null;
	try (Session session = Java.conexion.getSessionFactory().openSession()) {
		// start a transaction
		transaction = session.beginTransaction();
		// get an user object
		
		listOfInstitutos = session.createQuery("from Instituto").getResultList();
		
		// commit transaction
		transaction.commit();
	} catch (Exception e) {
		if (transaction != null) {
			transaction.rollback();
		}
		e.printStackTrace();
	}
	return listOfInstitutos;
}



}
