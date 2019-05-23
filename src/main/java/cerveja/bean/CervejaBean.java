package cerveja.bean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import org.springframework.web.context.annotation.RequestScope;

import cerveja.dao.DAO;
import cerveja.model.Cerveja;

@RequestScope
@ManagedBean
public class CervejaBean
{
	public static ArrayList<Cerveja> cervejas = new ArrayList<Cerveja>();
	private Cerveja cerveja = new Cerveja();
	
	public Cerveja getCerveja() {
		return cerveja;
	}

	public void gravar()
	{
        if(this.cerveja.getRotulo().isEmpty()) 
            throw new RuntimeException("Cerveja precisa ter rótulo");
        else
        {
        	cervejas.add(this.cerveja);
        	System.out.println("Adicionado");
        }       
       
        System.out.println("Gravando cerveja " + this.cerveja.getRotulo());
        //new DAO<Cerveja>(Cerveja.class).incluir(this.cerveja);        
	}
	
	public void listar()
	{
		 for(int i=0; i < cervejas.size(); i++) {
        	 System.out.println(cervejas.get(i).getRotulo());        		
        }
	}

}
