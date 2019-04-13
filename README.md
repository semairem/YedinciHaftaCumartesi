# YedinciHaftaCumartesi


static ArrayList<Okul> okulList = new ArrayList<Okul>();
	static ArrayList<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean donguDevamEdiyor = true;
		do {
			
			MenuUtils.menuYazdir();
			System.out.print("Seçiminiz=");
			int secim = scanner.nextInt();
			switch (secim) {
			case 1:
				System.out.println("Okul tanımı yapılacak");
				
				System.out.print("Okul Id =");
				int okulId = scanner.nextInt();
				System.out.print("Okul Adı = ");
				String okulAdi = scanner.next();
				
				Okul okul = new Okul();
				okul.setId(okulId);
				okul.setAdi(okulAdi);
				okulList.add(okul);
				okulListele();
				break;
			case 2:
				System.out.println("Okul listele yapılacak");
				okulListele();
				break;
			case 3:
				System.out.println("Öğrenci tanımı yapılacak");
				
				okulListele();
				
				System.out.println("Öğrenci Numarası = ");
				int ogrenciNo = scanner.nextInt();
				
				System.out.println("Öğrenci Adı = ");
				String ogrenciAdi = scanner.next();
				
				
				System.out.println("Okul Id = ");
				int ogrenciOkulId = scanner.nextInt();
				Okul ogrencininOkulu = findOkulById(ogrenciOkulId);

				Ogrenci ogrenci = new Ogrenci();
				ogrenci.setNumara(ogrenciNo);
				ogrenci.setIsim(ogrenciAdi);
				ogrenci.setOkul(ogrencininOkulu);
				ogrenciList.add(ogrenci);
				
				break;
			case 4:
				System.out.println("Öğrenci listele yapılacak");
				for (Ogrenci ogrenciNesnesi : ogrenciList) {
					System.out.println(ogrenciNesnesi);
				}
				break;
			case 5:
				// Hangi okulda hangi öğrenciler var. 
				break;
			case 6:
				System.out.println("Çıkış yapılacak");
				donguDevamEdiyor = false;
				break;
			default:
				break;
			}
		} while (donguDevamEdiyor);
	}
	
	private static void okulListele() {
		for (Okul okulNesnesi : okulList) {
			System.out.println(okulNesnesi);
		}
	}

	private static Okul findOkulById(int id) {
		for (Okul okul : okulList) {
			if (id == okul.getId()) {
				return okul;
			}
		}
		return null;
	}
  
  
  
  
  	public static void menuYazdir() {
		System.out.println("1. Okul Tanımla");
		System.out.println("2. Okul Listele");
		System.out.println("3. Öğrenci Tanımla");
		System.out.println("4. Öğrenci Listele");
		System.out.println("5. Çıkış");
	}
  
  
  private int id;
	private String adi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi + " OKULU";
	}
	
	@Override
	public String toString() {
		// 1 - ABCDEF
		return id + " - " + adi;
	}
  
  
  
  
  
  
  
  
  private int numara;
	private String isim;
	private Okul okul;

	public int getNumara() {
		return numara;
	}

	public void setNumara(int numara) {
		this.numara = numara;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Okul getOkul() {
		return okul;
	}

	public void setOkul(Okul okul) {
		this.okul = okul;
	}
	
	@Override
	public String toString() {
		return numara + " " + isim + " " + okul;
	}
  
  
  
  
  
  
  
  
  
  
  
  Kodu yazan burdan paylaşşın arkadaşlar :))
  System.out.println("Selamlar"); :))))
  
