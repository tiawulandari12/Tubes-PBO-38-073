/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahsakit;

/**
 *
 * @author tiawulandari
 */
public class Pasien_Inap {
    private Pasien pasien;
    private Dokter dokter;
    private String tglMasuk;
    private String Diagnosa[10];
    private int Jumlah_diagnosa = 0;
    private int kelas;
	
    public Pasien_Inap(Pasien pasien, Dokter dokter, String tglMasuk, int kelas){
        this.pasien=pasien;
	this.tglMasuk=tglMasuk;
	this.dokter=dokter;
	this.kelas=kelas;
	}
    public void setTglMasuk(String tglMasuk){
	this.tglMasuk=tglMasuk;
	}
    public String getTglMasuk(){
	return tglMasuk;
	}
    public void setDokter(Dokter d){
	dokter=d;
	}
    public Dokter getDokter(){
	return dokter;
	}
    private void setPasien(Pasien pasien){
	this.pasien=pasien;
	}
    private Pasien getPasien(){
	return pasien;
	}
    public void setKelas(int kelas){
	this.kelas = kelas;
	}
    public int getKelas(){
	return kelas;
	}
    public void addDiagnosa(String d){
	Diagnosa[Jumlah_diagnosa] = d;
	Jumlah_diagnosa++;
	}

    public String getDiagnosa(int n){
	return diagnosa[n];
    }
}
