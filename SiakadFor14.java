import java.util.Scanner;
public class SiakadFor14{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Deklarassi 
        double nilai=0, tertinggi=0, terendah=100;
        int lulus=0, tidaklulus=0;
        //menginisialisai, mengkondisikan, dan merubah suatu perulangan
        for(int i=1; i<= 10; i++){
            System.out.print("Masukan Nilai Siswa Ke-"+i+"\t: ");
            nilai =sc.nextDouble();     //user input nilai

            if (nilai >= 60) {      //Menentukan lulus atau tidak dengan minimum nilai 60
                lulus++;
            } else {
                tidaklulus++;
            }

            if(nilai>tertinggi){        //menentukan nilai tertinggi
                tertinggi=nilai;
            }
            if(nilai<terendah){         //menentukan nilai terendah
                terendah=nilai;
            }
        }
        System.out.println("____________________________________");
        System.out.println("Nilai Tertinggi\t:"+tertinggi);  //output nilai tertinggi
        System.out.print("NIlai Terendah\t:"+terendah);      //output nilai terendah
        System.out.println("");
        
        System.out.println("_______________________________________________");
        System.out.println("Jumlah Siswa Yang Lulus\t\t:"+lulus);
        System.out.println("Jumlah Siswa Yang Tidak Lulus\t:"+tidaklulus);

        sc.close();
    }
}