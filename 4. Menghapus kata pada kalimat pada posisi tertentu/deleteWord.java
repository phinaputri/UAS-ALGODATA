public class deleteWord {
 
   // Metoda main
   public static void main(String[] args) {
 
      StringBuffer str;
      str = new StringBuffer("Inggris dan Korea adalah bahasa yang mudah.");
 
      System.out.println("\nIsi dari variabel str : ");
      System.out.println(str);
      System.out.println();
 
      // setCharAt adalah metoda void
      str.setCharAt(14, 'r');
      System.out.println("Eksekusi metoda str.setCharAt(14, \'r\') : ");
      System.out.println(str);
      System.out.println();
 
      System.out.println("Eksekusi metoda str.deleteCharAt(14) : ");
      System.out.println(str.deleteCharAt(14));
      System.out.println();
      
       str.setCharAt(15, 'a');
      System.out.println("Eksekusi metoda str.setCharAt(14, \'e\') : ");
      System.out.println(str);
      System.out.println();
 
      System.out.println("Eksekusi metoda str.deleteCharAt(15) : ");
      System.out.println(str.deleteCharAt(15));
      System.out.println();
 
      System.out.println("Eksekusi metoda str.delete(7, 15) : ");
      System.out.println(str.delete(7, 15));
      System.out.println();
      
   }
}