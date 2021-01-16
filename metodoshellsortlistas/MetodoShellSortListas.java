
package metodoshellsortlistas;

import java.util.LinkedList;
import java.util.List;

public class MetodoShellSortListas {

    public static void main(String[] args) {
         
         List<Integer> Listita = new LinkedList<Integer>();
         Listita.add(12); Listita.add(13); Listita.add(15); Listita.add(16);
         Listita.add(11); Listita.add(14); Listita.add(18); Listita.add(17);
         
         
         System.out.println("Lista original sin el metodo: "+Listita);
         ShellSort(Listita);
         System.out.println("Lista correcta con el metodo ShellSort: "+Listita);
        }
     public static void ShellSort(List <Integer> Lista){
         int i, j, k, salto, aux;
         salto = Lista.size()/2;
         while(salto > 0){
             for (i = salto; i < Lista.size(); i++) {
                 j = i - salto;
                 while (j>=0) {
                     k = j + salto;
                     if(Lista.get(j) >= Lista.get(k)){
                         aux=Lista.get(j);
                         Lista.set(j, Lista.get(k));
                         Lista.set(k, aux);
                         j -= salto;
                     }else{
                         break;
                     }
                 }
             }
             salto/=2;
         }
     }
    
}


  
    

