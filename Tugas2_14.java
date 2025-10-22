
import java.util.Scanner;
public class Tugas2_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis,durasi,total=0;
        
        System.out.println("Masukan Jenis Kendaraan");
        System.out.println("Ketik 1 untuk Mobil");
        System.out.println("Ketik 2 untuk Motor");
        System.out.print("Jawaban Anda\t\t: ");
        jenis = sc.nextInt();
        
        
        while(jenis != 0){
            if(jenis==1||jenis==2){
                System.out.print("Maasukan Lama Parkir\t: ");
                durasi =sc.nextInt();
                System.out.println("");

                if(durasi>5){
                    total += 12500;
                }
                else if(jenis==1){
                        total += durasi*3000;
                }
                else if (jenis==2){
                        total += durasi*2000;
                }
            }
                System.out.println("Masukan Jenis Kendaraan");
                System.out.println("Ketik 1 untuk Mobil");
                System.out.println("Ketik 2 untuk Motor");
                System.out.print("Jawaban Anda\t\t: ");
                jenis = sc.nextInt();
                

        }
        System.out.println("________________________________________");
        System.out.println("Total Yang Harus Dibayarkan : "+total);
        System.out.println("");
    }
}