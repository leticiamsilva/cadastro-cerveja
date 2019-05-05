package cerveja.primefaces;

import java.util.List;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class View {
     
    public List<String> completeArea(String query) {
        List<String> results = new ArrayList<String>();
         
        if(query.toUpperCase().startsWith("LA")) {
            results.add("Lager");
            results.add("Lambic");
        }
        else if(query.toUpperCase().startsWith("AL")) {
            results.add("Ale");
        }
        else {
            for(int i = 0; i < 10; i++) {
                results.add(query + i);
            }
        }
         
        return results;
    }
}