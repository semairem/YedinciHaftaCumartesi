package com.semairem;

import java.util.Scanner;

public class ogrenci {

	private int numara;
	private String isim;
	private okul okul;
	
	public int getNumara() {
		return numara;
	}
	
public String getIsim() {
	return isim;
}
public okul getOkul() {
	return okul;
}

public void setNumara(int numara) {
	this.numara = numara;
}
public void setIsim(String isim) {
	this.isim = isim;
}
public void setOkul(okul okul) {
	this.okul = okul;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return numara+" "+isim+" "+okul;
}
}

