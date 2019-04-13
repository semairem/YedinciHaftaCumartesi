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
//			System.out.println("L�tfen yapmak istedi�iniz i�lemin idsini yaz�n�z");
//			int islemIdsi = scanner.nextInt();
//			System.out.println(islemIdsi + ". i�lemi se�tiniz ");
//			switch (islemIdsi) {
//			case 1:
//				System.out.println("Okulu Tan�mlanacak");
//				System.out.println(" ");
//				System.out.println("Okul Id Giriniz");
//				int id = scanner.nextInt();
//				System.out.println("Okul Ad�n� Giriniz");
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
//				System.out.println("��renci Tan�mlanacak");
//
//				System.out.println("��renci Numaras� Giriniz");
//				int numara = scanner.nextInt();
//				System.out.println("��renci �smini Giriniz");
//				String ismini = scanner.next();
//				okulListeleme();
//				System.out.println("Okulunuzu se�iniz");
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
//				System.out.println("��renci Listelenecek");
//
//				ogrenciListeleme();
//				System.out.println(" ");
//				break;
//			case 5:
//				System.out.println("��k�� Yap�l�yor");
//				donguDevamEdiyor=false;
//
//				break;
//
//			default:
//				System.out.println("Hatal� i�lem numaras� se�tiniz");
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
			System.out.print("Se�iminiz=");
			int secim = scanner.nextInt();
			switch (secim) {
			case 1:
				System.out.println("Okul tan�m� yap�lacak");
				
				System.out.print("Okul Id =");
				int okulId = scanner.nextInt();
				System.out.print("Okul Ad� = ");
				String okulAdi = scanner.next();
				
				okul okul = new okul();
				okul.setId(okulId);
				okul.setAdi(okulAdi);
				okulList.add(okul);
				okulListele();
				break;
			case 2:
				System.out.println("Okul listele yap�lacak");
				okulListele();
				break;
			case 3:
				System.out.println("��renci tan�m� yap�lacak");
				
				okulListele();
				
				System.out.println("��renci Numaras� = ");
				int ogrenciNo = scanner.nextInt();
				
				System.out.println("��renci Ad� = ");
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
				System.out.println("��renci listele yap�lacak");
				for (ogrenci ogrenciNesnesi : ogrenciList) {
					System.out.println(ogrenciNesnesi);
				}
				break;
			case 5:
				// Hangi okulda hangi ��renciler var. 
				
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
				System.out.println("��k�� yap�lacak");
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
