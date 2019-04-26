package cerveja.dao;

import javax.persistence.EntityManager;

/*COMENT�RIOS 
 * 
 *JPA, o EntityManager, � respons�vel pela persist�ncia de entidades dentro de uma transa��o.
 * 
 */

public class DAO <T>
{
	private final Class<T> classe;

	public DAO (Class<T> classe)
	{
		this.classe = classe;
	}
	
	
	public void incluir(T classe)
	{
		
		JPAUtil util = new JPAUtil();
		util.emf.toString();
		
		EntityManager em = util.getEntityManager();
		
	
		
		em.getTransaction().begin(); //inicia a transa��o
        em.persist(classe);
        em.getTransaction().commit();
        em.close();
	}
}
