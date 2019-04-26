package cerveja.bean;

import javax.faces.bean.ManagedBean;

import cerveja.dao.DAO;
import cerveja.model.Cerveja;

@ManagedBean
public class CervejaBean
{
	private Cerveja cerveja = new Cerveja();
	
	public Cerveja getCerveja() {
		return cerveja;
	}

	public void gravar()
	{
        if(cerveja.getRotulo().isEmpty()) 
            throw new RuntimeException("Cerveja precisa ter rótulo");

        System.out.println("Gravando cerveja " + this.cerveja.getRotulo());
        new DAO<Cerveja>(Cerveja.class).incluir(this.cerveja);
        
		System.out.println("Gravando ok cerveja " + this.cerveja.getRotulo());
	}

}
