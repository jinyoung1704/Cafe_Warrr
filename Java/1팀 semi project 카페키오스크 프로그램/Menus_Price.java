
// 사용자 메뉴 가격 담을 속성 클래스(이채빈) 
class Menus_Price 
{
	//속성 : 메뉴별 가격 - 변하지 않으므로 final로
	// ① 커피류
	private final int Pespresso = 2500;
	private final int Pamericano = 3000;	
	private final int Platte = 3500;
	private final int PcafeMoca= 4000;
	private final int Pcappuccino = 4000;
	private final int PvanillaLatte = 4500;
	private final int PcaramelM = 4000;
	
	// ② 논커피류
	private final int PjamongAde= 4000;
	private final int Pyogurt= 4500;
	private final int Ptea= 3500;
	private final int PorangeJuice= 4000;
	private final int PgogumaLatte= 4000;
	
	// ③ 디저트류 
	private final int Pcake = 4000;
	private final int Pbagel = 3500;
	private final int Pscone = 3500;
	private final int Pmacaron = 2500;
	private final int Pcookie = 2500;
	

	// ④ 옵션
	private final int Pice = 500;
	private final int Pshot = 500;
	private final int Pvanilla = 500;
	private final int Pchoco = 500; 
	private final int Phazel = 500;
	private final int Pcaramel = 500; 
	private final int Pwhipcream = 500;

	private final int Pcreamcheese = 1000;
	private final int Pstroberryjam = 500;
	

	// 게터 완성 
  // 커피류 
	public int getPespresso() {
		return Pespresso;
	}

	public int getPamericano() {
		return Pamericano;
	}

	public int getPlatte() {
		return Platte;
	}
	
	public int getPcafeMoca() {
		return PcafeMoca;
	}
	
	public int getPcappuccino() {
		return Pcappuccino;
	}
	
	public int getPvanillaLatte() {
		return PvanillaLatte;
	}
	
	public int getPcaramelM() {
		return PcaramelM;
	}
	
	// 논커피류 
	public int getPjamongAde() {
		return PjamongAde;
	}
	
	public int getPyogurt() {
		return Pyogurt;
	}
	
	public int getPtea() {
		return Ptea;
	}
	
	public int getPorangeJuice() {
		return PorangeJuice;
	}
	
	public int getPgogumaLatte() {
		return PgogumaLatte;
	}

	// 디저트류 
	
	public int getPcake() {
		return Pcake;
	}

	public int getPbagel() {
		return Pbagel;
	}
	
	public int getPscone() {
		return Pscone;
	}
	
	public int getPmacaron() {
		return Pmacaron;
	}
	
	public int getPcookie() {
		return Pcookie;
	}



	// 옵션 
	public int getPice() {
		return Pice;
	}
	
	public int getPshot() {
		return Pshot;
	}

	public int getPvanilla() {
		return Pvanilla;
	}
	
	public int getPchoco() {
		return Pchoco;
	}
	
	public int getPhazel() {
		return Phazel;
	}
	
	public int getPcaramel() {
		return Pcaramel;
	}
	
	public int getPcreamcheese() {
		return Pcreamcheese;
	}
	
	public int getPstroberryjam() {
		return Pstroberryjam;
	}
	
	public int getPwhipcream() {
		return Pwhipcream;
	}
	
}