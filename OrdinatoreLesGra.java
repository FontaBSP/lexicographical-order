import java.util.Scanner;
public class OrdinatoreLesGra {

  public static void main(String[] args)
  {
	  
	  
//Creo oggetto scanner
    Scanner in = new Scanner(System.in);

    System.out.println("Insersci tre parole(una alla volta poi invio) :");
    String u = in.nextLine();
    String d = in.nextLine();
    String t = in.nextLine();
  
 //Creo oggetto per il riordino  
    OrdineLG x = new OrdineLG(u,d,t);
//Richiamo il metodo per l'ordine
    x.ordina();
  }
}