/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119014.andri.dwi.p.no2;

/**
 *
 * @author Andri Dwi P
 * Nama : Andri Dwi p
 * Kelas: IF-1
 * NIM  : 10119014
 */
class Tabungan {
    private int saldo;
     
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    public int ambilUang(int jumlah){
      return saldo - jumlah; 
    }
}
