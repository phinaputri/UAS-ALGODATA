public class insertWord{
    public static void main(String[] args){
        //Mendefinisikan Objek Beserta Nilainya
        StringBuffer data = new StringBuffer("Saya menonton drama korea");
        
        //Menyisipkan Karakter pada Objek StringBuffer
        data.insert(5, " ");
        data.insert(6, "s");
        data.insert(7, "e");
        data.insert(8, "d");
        data.insert(9, "a");
        data.insert(10, "n");
        data.insert(11, "g");
        data.insert(12, " ");
        //Menampilkan Output
        System.out.println(data);
    }
}