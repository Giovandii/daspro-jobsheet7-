import java.util.Scanner;
public class SiakadFor14{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//Deklarassi 
        double nilai, tertinggi=0, terendah=100;
//menginisialisai, mengkondisikan, dan merubah suatu perulangan
        for(int i=1; i<= 10; i++){
            System.out.print("Masukan Nilai Siswa Ke-"+i+": ");
            nilai =sc.nextDouble();     //user input nilai
            if(nilai>tertinggi){        //menentukan nilai tertinggi
                tertinggi=nilai;
            }
            if(nilai<terendah){         //menentukan nilai terendah
                terendah=nilai;
            }
        }
        System.out.println("Nilai Tertinggi: "+tertinggi);  //output nilai tertinggi
        System.out.print("NIlai Terendah: "+terendah);      //output nilai terendah
    }
}