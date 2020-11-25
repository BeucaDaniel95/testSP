import java.util.ArrayList;

public class CreateOrderCmd {
    private ArrayList<mancare> listademancare;
    //CreateOrder va crea o lista precum cea mai de jos
    /**2 x Supe pui x 7.5 RON
    1 x Friptura de porc la tava x 15 RON
    1 x Snitel vienez x 13 RON
    2 x Cartofi Wedges x 6 RON
    2 x Salata rosii x 5 RON
    2 x Ape minerale x 3 RON
   **/
    public CreateOrderCmd(){
        listademancare= new ArrayList<mancare>();
        listademancare.add(new mancare(2,"Supe pui",7.5));
        listademancare.add(new mancare(1,"Friptura de porc la tava ",15));
        listademancare.add(new mancare(1,"Snitel vienez",13));
        listademancare.add(new mancare(2,"Cartofi Wedges",6));
        listademancare.add(new mancare(2,"Salata rosii",5));
        listademancare.add(new mancare(2,"Ape minerale",3));
    }
    public void afisare(){
        System.out.println("O comanda de mancare poate contine diverse produse cu diverse cantitati:");
        Double suma=0.0;
        for(int i=0; i<listademancare.size();i++){
            System.out.println(" "+listademancare.get(i).cantitate+" x "+listademancare.get(i).nume+" x "+listademancare.get(i).pret+" RON");
            suma=suma+listademancare.get(i).getCantitate()*listademancare.get(i).getPret();
        }
        System.out.println("TOTAL "+suma);
    }

}
