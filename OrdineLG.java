public class OrdineLG {
	
// Creo 3 stringhe per l'input
String uno;
String due;
String tre;
// Creo 3 stringhe da aggiungere all'output per specificare la posizione

String a = "La prima e': " ;
String b = "La seconda e': " ;
String c = "La terza e': " ;
 
 //Inizalizzo le stringhe
public OrdineLG(String u, String d, String t)
  {
    uno = u;
	due = d;
	tre = t;
  }

//Creo metodo per il riordino lessicografgico delle 3 stringhe
  public void ordina()
   {
	  
	  System.out.println("Eccoti le tre parole in ordine Lessicografico:");
	   
      if (uno.compareTo(due)<0 && due.compareTo(tre)<0)
      {
      System.out.println(a + uno);
	  System.out.println(b + due);
      System.out.println(c + tre);
      }
      else if (tre.compareTo(due)<0 && due.compareTo(uno)<0)
      {
      System.out.println(a + tre);
	  System.out.println(b + due);
      System.out.println(c + uno);
	   }
	   else if (due.compareTo(tre)<0 && tre.compareTo(uno)<0)
	   {  
	   System.out.println(a + due);
	   System.out.println(b + tre);
       System.out.println(c + uno);
	   }
	    else if (uno.compareTo(tre)<0 && tre.compareTo(due)<0)
	   {   
	    System.out.println(a + uno);
	   System.out.println(b + tre);
       System.out.println(c + due);
	   }   
	   else if (tre.compareTo(uno)<0 && uno.compareTo(due)<0)
	   {
	   System.out.println(a + tre);
	   System.out.println(b + uno);
       System.out.println(c + due);
	   } 
	   else if (due.compareTo(uno)<0 && uno.compareTo(tre)<0)
	   {  
	   System.out.println(a + due);
	   System.out.println(b + uno);
       System.out.println(c + tre);
	   } 
	  
    
    }
}