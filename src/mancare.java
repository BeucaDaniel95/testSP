
public class mancare {
     public int cantitate;
     public double pret;
     public String nume;
     public mancare(int c,String n, double p){
         this.cantitate=c;
         this.nume=n;
         this.pret=p;
     }

    public double getPret() {
        return pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public String getNume() {
        return nume;
    }
}
