package Database;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import utils.PersistanceUtils;
import entity.Student;

public class Repo {
	static EntityManager entityManager = PersistanceUtils.getEntityManager();
	
	public static void persist(Student student) {
		System.out.println(">>>>>>>>>>>>>  persist >>>>>>>>>>>>>");
		EntityTransaction etxt = entityManager.getTransaction();
		etxt.begin();
		entityManager.persist(student);
		etxt.commit();
		System.out.println("<<<<<<<<<<<<<<  persist <<<<<<<<<<<<<<");
		
	}
	
	
	

}
