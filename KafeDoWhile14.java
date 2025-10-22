import java.util.Scanner;
public class KafeDoWhile14 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//Deklarasi Variable
        int kopi, teh, roti;
        String namaPelanggan;
        int hargakopi =12000, hargaTeh=7000, hargaRoti=20000;
        
        do {
            System.out.print("Masukan nama pelanggan\t: ");
            namaPelanggan =input.nextLine();    //Masukan Nama Pelanggan
            System.out.println("_____________________________");

            if(namaPelanggan.equalsIgnoreCase("batal")){    //Memberhentikan Tranksaksi
                System.out.println("Transaksi Dibatalkan.");
                break;  //Memperhentikan Progam
            }
//Menginput Jumlah Kopi, Teh, Roti
            System.out.print("Masukan Jumlah Kopi\t: ");
            kopi =input.nextInt();
            System.out.print("Masukan Jumlah Teh\t: ");
            teh = input.nextInt();
            System.out.print("Masukan Jumlah Roti\t: ");
            roti = input.nextInt();
            System.out.println("____________________________________");
//Menghintung Total harga
            int totalharga = (kopi*hargakopi)+(teh*hargaTeh)+(roti*hargaRoti);
            System.out.println("Harga yang harus dibayarkan\t: "+totalharga);
            input.nextLine(); //Menghapus sisa karakter newline (\n) yang tertinggal di buffer.
            System.out.println("____________________________________");

        } while (true);
        input.close();
    }
}