package com.semairem;

import java.util.Scanner;

public class okul {
	
	 private int id;
	 private String adi;

	 public int getId() {
		return id;
	}
	 public String getAdi() {
		return adi;
	}
	 public void setId(int id) {
		this.id = id;
	}
	 public void setAdi(String adi) {
		this.adi = adi;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return id+" -"+adi;
}

}
