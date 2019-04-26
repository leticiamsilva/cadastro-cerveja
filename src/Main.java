import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cerveja.bean.CervejaBean;
import cerveja.model.Cerveja;

public class Main {

	public static void main(String[] args) {
		CervejaBean CB = new CervejaBean();
		
		CB.getCerveja().setRotulo("Buzios");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cerveja"); //ou Cerveja ou cervejariadb

		emf.close();
		
		CB.gravar();
	}
}
