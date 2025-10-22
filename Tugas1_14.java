import java.util.Scanner;
public class Tugas1_14 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double tiket=50000,i=1, hari =1, totalharga=0, totharga=0, harian=0;
        System.out.println("=====Selamat Datang=====");

        while(i>=hari){
            System.out.print("Masukan jumlah tiket yang dibeli\t: ");
            int jmltiket =sc.nextInt();

            if(jmltiket<0){
                System.out.println("Jumlah Tiket Tidak Valid Masukan Kembali");
                continue;
            }
            if (jmltiket==0){
                break;
            }
            if (jmltiket>=10){
                System.out.println("Selamat Anda Mendapat diskon 15%");
                totalharga = (jmltiket*tiket)*0.15;
                totharga = ((jmltiket*tiket)-totalharga);
                harian += totharga;
                System.out.println("Total yang harus dibayarkan adalah\t: "+totharga);
                System.out.println("");
            }
            if  (jmltiket>=4){
                System.out.println("Selamat Anda Mendapat diskon 10%");
                totalharga = (jmltiket*tiket)*0.1;
                totharga = ((jmltiket*tiket)-totalharga);
                harian += totharga;
                System.out.println("Total yang harus dibayarkan adalah\t: "+totharga);
                System.out.println("");
            }
            if (jmltiket<4){
                totalharga = (jmltiket*tiket);
                harian += totalharga;
                System.out.println("Total yang harus dibayarkan adalah\t: "+totalharga);
                System.out.println("");
            }
            
        }
        System.out.println("________________________________________________________");
        System.out.println("Pendapatan Penjualan Tiket Hari ini : "+harian);
        System.out.println("Terimakasih Atas Kerja Kerasnya :) ");
        System.out.println("");
        sc.close();
    }
}