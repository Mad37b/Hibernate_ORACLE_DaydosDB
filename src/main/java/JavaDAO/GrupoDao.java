package JavaDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Java.Grupo;
import Java.conexion;

import java.*;

public class GrupoDao {

	public void saveCountry(Grupo saveGrupo) {
		Transaction transaction = null;
		try (Session session = conexion.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the country object
			session.save(saveGrupo);
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
	public void updateCountry(Grupo updateGrupo) {
		Transaction transaction = null;
		try (Session session = conexion.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.update(updateGrupo);
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
		try (Session session = conexion.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a user object
			Grupo deleteGrupo = session.get(Grupo.class, id);
			if (deleteGrupo != null) {
				session.delete(deleteGrupo);
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
	 * @param id
	 * @return
	 */
	public Grupo getGrupo(int id) {

		Transaction transaction = null;
		Grupo getGrupo = null;
		try (Session session = conexion.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			getGrupo = session.get(Grupo.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return getGrupo;
	}
	
	/**
	 * Get all Users
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Grupo> getAllUser() {

		Transaction transaction = null;
		List<Grupo> listOfCountries = null;
		try (Session session = conexion.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			
			listOfCountries = session.createQuery("from countries").getResultList();
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfCountries;
	}
}
	

