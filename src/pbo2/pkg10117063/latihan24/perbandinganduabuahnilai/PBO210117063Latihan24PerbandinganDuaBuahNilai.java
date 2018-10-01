/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author DEADPOOL
 */
public class PBO210117063Latihan24PerbandinganDuaBuahNilai {

    /*Nama : Cessario Sheva Lakita Purwa Adidjaya
      Nim  : 10117063
      Kelas : IF-2
      Deskripsi Program : membandingkan dua buah nilai 
     */
    public static void main(String[] args) {
    int nilai1,nilai2;
    String ulangi;
    
    
        System.out.println("====Program Perbandingan NIlai====");
        
        do{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = scanner.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = scanner.nextInt();
        
        System.out.println("Hasil : " );
        if (nilai1 > nilai2){
            System.out.println(nilai1+ " Lebih Besar Dari " +nilai2);
        }else if (nilai1 == nilai2){
            System.out.println(nilai1+ " Sama Besar Dengan " +nilai2);
        }else if (nilai1 < nilai2){
            System.out.println(nilai1+ " Lebih Kecil dari " +nilai2);
        }
            System.out.println("");
            System.out.print("Ulangi aktifitas diatas ? (Ya/Tidak) :");
            ulangi = scanner.next();
       } while (ulangi.equals("Ya"));   
        
    }
}

        
        
        
        
        
    


