package cerveja.dao;

import javax.persistence.EntityManager;

/*COMENTÁRIOS 
 * 
 *JPA, o EntityManager, é responsável pela persistência de entidades dentro de uma transação.
 * 
 */

public class DAO <T>
{
	
	public void incluir(T classe)
	{
		
		JPAUtil util = new JPAUtil();
		util.emf.toString();
		
		EntityManager em = util.getEntityManager();
		
	
		
		em.getTransaction().begin(); //inicia a transação
        em.persist(classe);
        em.getTransaction().commit();
        em.close();
	}
}
