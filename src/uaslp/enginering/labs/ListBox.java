package uaslp.enginering.labs;

import java.util.ArrayList;
import java.util.List;

public class ListBox extends Control{
  private List<String> options;
    //OPERADOR ELLIPSIS INDICA ARGUMENTOS VARIABLES (0 A N)
    public ListBox(String ... options) {
       this.options = new ArrayList<>(options.length);
        for(String option: options)
        {
            this.options.add(option);
        }
    }
    public void draw() {
        for(String option: options)
        {
            System.out.print(option+" - ");
        }
    }
}
