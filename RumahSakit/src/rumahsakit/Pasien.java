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
public class Pasien extends Orang {
    private String Id_p;
    private String tglDaftar;
    
    public Pasien(String Id_p, String nama,String umur, String alamat, String tglDaftar){
	this.Id_p=Id_p;
	super(nama,umur,alamat);
	this.tglDaftar=tglDaftar;
    }
    public String getID_p(){
    	return Id_p;
    } 
    public String getTglDaftar(){
	return tglDaftar;
    }
}
