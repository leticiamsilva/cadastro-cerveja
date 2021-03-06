package cerveja.bean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import org.springframework.web.context.annotation.RequestScope;

import cerveja.model.Cerveja;

@RequestScope
@ManagedBean
public class CervejaBean
{
	public static ArrayList<Cerveja> cervejas = new ArrayList<Cerveja>();
	private Cerveja cerveja = new Cerveja();
	private ArrayList<Cerveja> cervejasLista =  new ArrayList<Cerveja>();
	
	
	public ArrayList<Cerveja> getCervejas()
	{
		return cervejas;
	}
	
	
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
	
	public void remover(Cerveja cerveja) {
	    System.out.println("Removendo cerveja desejada " + cerveja.getRotulo());	    
	    cervejas.remove(cerveja); //removendo da lista
	    this.cervejasLista.remove(cerveja);
	    //new DAO<Cerveja>(Cerveja.class).remove(cerveja);
	}

	public void carregar(Cerveja cerveja) {	   
	    this.cerveja = cerveja;
	    System.out.println("carregou " + cerveja.getRotulo());	
	}
	
}
