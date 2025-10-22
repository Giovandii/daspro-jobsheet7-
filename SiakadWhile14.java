import java.util.Scanner;
public class SiakadWhile14 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int nilai, jml, i=0;

        System.out.print("Masukan Jumlah Siswa: "); //input jumlah siswa
        jml =input.nextInt();
        System.out.println("_____________________________");

        while (i<jml) { //perulangan dengan penambahan i di akhir
            System.out.print("Masukan Nilai Siswa Ke-"+(i+1)+"\t:");
            nilai =input.nextInt(); //input nilai siswa

            if(nilai<0 || nilai>100){   //batas input nilai
                System.out.println("Nilai Tidak Valid Maasukan Nilai Kembali");
                System.out.println("");
                continue;   //untuk melanjutkan program dan use harus menginput nilai lagi
            }

            //Batas nilai Huruf
            if( nilai > 80 && nilai <= 100){   
                System.out.println("Nilai Siswa Ke-"+(i+1)+" adalah \t:A");
                System.out.println("Bagus Pertahankan Nilai nya");
                System.out.println("");
            }
            else if(nilai > 73 && nilai <=80){
                System.out.println("Nilai Siswa Ke-"+(i+1)+" adalah \t:B+");
                System.out.println("");
            }
            else if(nilai > 65 && nilai <=73){
                System.out.println("Nilai Siswa Ke-"+(i+1)+" adalah \t:B");
                System.out.println("");
            }
            else if(nilai > 60 && nilai <=65){
                System.out.println("Nilai Siswa Ke-"+(i+1)+" adalah \t:C+");
                System.out.println("");
            }
            else if(nilai > 50 && nilai <=60){
                System.out.println("Nilai Siswa Ke-"+(i+1)+" adalah \t:C");
                System.out.println("");
            }
            else if(nilai > 39 && nilai <=50){
                System.out.println("Nilai Siswa Ke-"+(i+1)+" adalah \t:D");
                System.out.println("");
            }
            else {
                System.out.println("Nilai Siswa Ke-"+(i+1)+" adalah \t:E");
                System.out.println("");
            }
            i++; //penamabahan nilai 1 agar dapat mengikuti jumlah siswa yang akan dimasukan nilai nya
            input.close();
        }
    }
}