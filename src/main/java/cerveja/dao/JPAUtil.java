package cerveja.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil 
{
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("cerveja"); //ou Cerveja ou cervejariadb

	public EntityManager getEntityManager() {
		emf = Persistence.createEntityManagerFactory("cerveja"); //ou Cerveja ou cadastro

		return emf.createEntityManager();
	}

	public void close(EntityManager em) {
		em.close();
	}

}
