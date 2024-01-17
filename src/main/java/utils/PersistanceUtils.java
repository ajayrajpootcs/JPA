package utils;
import jakarta.persistence.Persistence;
//import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
public class PersistanceUtils {
	private static EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("default-mysql");
	
	public static EntityManager getEntityManager() {
		
		return entityManagerfactory.createEntityManager();
	}
	

}
