import java.util.ArrayList;

public class VokalKonsonan {

  public static void main(String[] args) {

    int consonantCount = 0,
        vocalCount = 0;

    String sentence = "Phina Putri Amalia";
    ArrayList<Character> trimmedSentence = new ArrayList<Character>();


    for ( int i = 0; i < sentence.length(); i++) {
      if (!Character.isWhitespace(sentence.charAt(i))) {
        trimmedSentence.add(sentence.charAt(i));
      }
    }

    for ( int i = 0; i < trimmedSentence.size(); i++ ) {
      if (
          Character.toLowerCase(trimmedSentence.get(i)) == 'a' ||
          Character.toLowerCase(trimmedSentence.get(i)) == 'i' ||
          Character.toLowerCase(trimmedSentence.get(i)) == 'u' ||
          Character.toLowerCase(trimmedSentence.get(i)) == 'e' ||
          Character.toLowerCase(trimmedSentence.get(i)) == 'o' 
        ) {
        consonantCount += 1;
      } else  {
        vocalCount += 1;
      }
    }


    System.out.println("Kalimat -> " + sentence);
    System.out.println("Ada " + consonantCount + " Huruf Vokal ");
    System.out.println("Ada " + vocalCount + "  Huruf Konsonan ");
    
  }

}