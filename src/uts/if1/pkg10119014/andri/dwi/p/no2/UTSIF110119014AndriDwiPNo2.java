/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119014.andri.dwi.p.no2;

import java.util.Scanner;

/**
 *
 * @author Andri Dwi P
 * Nama : Andri Dwi p
 * Kelas: IF-1
 * NIM  : 10119014
 */
public class UTSIF110119014AndriDwiPNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("=====Program Penarikan Uang=====");
    System.out.print("Masukan Saldo Awal : "); 
    int saldo = scanner.nextInt();
    Tabungan tabungan = new Tabungan (saldo);
    System.out.print("Jumlah uang yang diambil : ");
    int jumlah = scanner.nextInt();
    System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(jumlah));
    }
}

