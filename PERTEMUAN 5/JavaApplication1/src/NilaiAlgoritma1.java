/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author entercomp
 */
public class NilaiAlgoritma1 {
        String namaMhs;
        int nilaiTugas;
        int nilaiKuis;
        int nilaiUTS;
        int nilaiUAS;
        
        NilaiAlgoritma1(){ 
            
        }
        NilaiAlgoritma1(String nama, int tugas, int kuis, int uts, int uas){
            namaMhs = nama;
            nilaiTugas = tugas;
            nilaiKuis = kuis;
            nilaiUTS = uts;
            nilaiUAS = uas;
        }
        public double hitungTotalNilai(){ 
            return (0.30 * nilaiTugas) + (0.20 * nilaiKuis) + (0.20 * nilaiUTS) + (0.30 * nilaiUAS);
        }

}
