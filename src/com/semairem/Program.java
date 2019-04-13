package com.semairem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import com.sun.javafx.collections.MappingChange.Map;

public class Program {
//	static ArrayList<okul> okulList = new ArrayList<okul>();
//	static ArrayList<ogrenci> ogrenciList = new ArrayList<ogrenci>();
//
//	public static void main(String[] args) {
//
//
//	Scanner scanner = new Scanner(System.in);
//
//		boolean donguDevamEdiyor=true;
//		do {
//			MenuUtils.menuyuYazdir();
//			
//			System.out.println("Lütfen yapmak istediðiniz iþlemin idsini yazýnýz");
//			int islemIdsi = scanner.nextInt();
//			System.out.println(islemIdsi + ". iþlemi seçtiniz ");
//			switch (islemIdsi) {
//			case 1:
//				System.out.println("Okulu Tanýmlanacak");
//				System.out.println(" ");
//				System.out.println("Okul Id Giriniz");
//				int id = scanner.nextInt();
//				System.out.println("Okul Adýný Giriniz");
//				String adi = scanner.next();
//				okul okul = new okul();
//				okul.setAdi(adi);
//				okul.setId(id);
//				okulList.add(okul);
//				System.out.println(" ");
//				okulListeleme();
//				System.out.println(" ");
//
//				break;
//			case 2:
//				System.out.println("Okul Listelenecek");
//				okulListeleme();
//				System.out.println(" ");
//				break;
//			case 3:
//				System.out.println("Öðrenci Tanýmlanacak");
//
//				System.out.println("Öðrenci Numarasý Giriniz");
//				int numara = scanner.nextInt();
//				System.out.println("Öðrenci Ýsmini Giriniz");
//				String ismini = scanner.next();
//				okulListeleme();
//				System.out.println("Okulunuzu seçiniz");
//				int okulIdsi = scanner.nextInt();
//				ogrenci ogrenci = new ogrenci();
//				ogrenci.setNumara(numara);
//				ogrenci.setIsim(ismini);
//				
//				
//				ogrenciList.add(ogrenci);
//				ogrenciListeleme();
//				System.out.println(" ");
//
//				break;
//			case 4:
//				System.out.println("Öðrenci Listelenecek");
//
//				ogrenciListeleme();
//				System.out.println(" ");
//				break;
//			case 5:
//				System.out.println("Çýkýþ Yapýlýyor");
//				donguDevamEdiyor=false;
//
//				break;
//
//			default:
//				System.out.println("Hatalý iþlem numarasý seçtiniz");
//				
//				break;
//			}
//		} while (donguDevamEdiyor);
//
//	}
//
//	static void okulListeleme() {
//
//		for (okul okul : okulList) {
//			System.out.println(okul.getId() + " " + okul.getAdi());
//
//		}
//	}
//
//	static void ogrenciListeleme() {
//
//		for (ogrenci ogrenci : ogrenciList) {
//			System.out.println(ogrenci.getNumara() + " " + ogrenci.getIsim() + " " + ogrenci.getOkul());
//		}
//	}
//	
//	private static okul findOkulById(int id) {
//		
//		for (okul okul : okulList) {
//			if(okul.getId()==id) {
//				return okul;
//				
//				
//			}
//			return null;
//		}
//	}
//	
	
	
	
	static ArrayList<okul> okulList = new ArrayList<okul>();
	static ArrayList<ogrenci> ogrenciList = new ArrayList<ogrenci>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean donguDevamEdiyor = true;
		do {
			
			MenuUtils.menuyuYazdir();
			System.out.print("Seçiminiz=");
			int secim = scanner.nextInt();
			switch (secim) {
			case 1:
				System.out.println("Okul tanýmý yapýlacak");
				
				System.out.print("Okul Id =");
				int okulId = scanner.nextInt();
				System.out.print("Okul Adý = ");
				String okulAdi = scanner.next();
				
				okul okul = new okul();
				okul.setId(okulId);
				okul.setAdi(okulAdi);
				okulList.add(okul);
				okulListele();
				break;
			case 2:
				System.out.println("Okul listele yapýlacak");
				okulListele();
				break;
			case 3:
				System.out.println("Öðrenci tanýmý yapýlacak");
				
				okulListele();
				
				System.out.println("Öðrenci Numarasý = ");
				int ogrenciNo = scanner.nextInt();
				
				System.out.println("Öðrenci Adý = ");
				String ogrenciAdi = scanner.next();
				
				
				System.out.println("Okul Id = ");
				int ogrenciOkulId = scanner.nextInt();
				okul ogrencininOkulu = findOkulById(ogrenciOkulId);

				ogrenci ogrenci = new ogrenci();
				ogrenci.setNumara(ogrenciNo);
				ogrenci.setIsim(ogrenciAdi);
				ogrenci.setOkul(ogrencininOkulu);
				ogrenciList.add(ogrenci);
				
				break;
			case 4:
				System.out.println("Öðrenci listele yapýlacak");
				for (ogrenci ogrenciNesnesi : ogrenciList) {
					System.out.println(ogrenciNesnesi);
				}
				break;
			case 5:
				// Hangi okulda hangi öðrenciler var. 
				
				HashMap<okul, ArrayList<ogrenci>> ogrenciMap = new HashMap<okul, ArrayList<ogrenci>>();
				for (okul okul2 : okulList) {
					 ArrayList<ogrenci> ogrlist = new ArrayList<ogrenci>();
					 for (ogrenci ogrenci2 : ogrenciList) {
						if (okul2.getId()==ogrenci2.getOkul().getId()) {
							ogrlist.add(ogrenci2);
						} 
					}
					ogrenciMap.put(okul2, ogrlist);
					System.out.println(ogrenciMap);
					
				}
				break;
			case 6:
				System.out.println("Çýkýþ yapýlacak");
				donguDevamEdiyor = false;
				break;
			default:
				break;
			}
		} while (donguDevamEdiyor);
	}
	
	private static void okulListele() {
		for (okul okulNesnesi : okulList) {
			System.out.println(okulNesnesi);
		}
	}

	private static okul findOkulById(int id) {
		for (okul okul : okulList) {
			if (id == okul.getId()) {
				return okul;
			}
		}
		return null;
	}	

}
