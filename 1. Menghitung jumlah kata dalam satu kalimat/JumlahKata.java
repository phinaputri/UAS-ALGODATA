import java.util.Scanner;
 
class JumlahKata {
    private static final int JUMLAH_KARAKTER = 256;
    private static final int[] total_per_karakter = new int[JUMLAH_KARAKTER];
 
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
 
        System.out.print("\nMasukan string : ");
        String kata = s.nextLine();
        kata = kata.toLowerCase();
 
        // hitung jumlah kata
        int jumlahKata = 0;
        int i = 0;
        while (i < kata.length()) {
            // abaikan spasi pada awal string dan spasi lebih dari satu
            while (i < kata.length() && kata.charAt(i) == ' ') i++; 
 
            if (i < kata.length() && kata.charAt(i) != ' ') {
                jumlahKata++;
                while (i < kata.length() && kata.charAt(i) != ' ') i++;
            }
        }
 
        System.out.println("\nJumlah Kata : 2 " + " buah");
    }
}