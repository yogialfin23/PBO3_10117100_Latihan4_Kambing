/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class Kambing {

    public void tambahKambing() {
        //Deklarasi Variabel Lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah ditambah: " +
                        jumlahKambing);
    }
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
