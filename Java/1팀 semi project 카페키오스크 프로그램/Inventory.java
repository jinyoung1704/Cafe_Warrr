// 재고 속성 클래스(이채빈, 최호석)
class Inventory	
{										
	private static int bean; //원두
	private static int beanL;//원두기준값	

	private static int milk;//우유
	private static int milkL;//우유기준값

	private static int choco; //초코시럽
	private static int chocoL;

	private static int vanilla; //바닐라시럽
	private static int vanillaL;

	private static int hazel;	// 헤이즐넛시럽
	private static int hazelL;

	private static int caramel;	//카라멜시럽
	private static int caramelL;

	private static int grapefruit;//자몽
	private static int grapefruitL;//자몽기준값

	private static int spawater;//탄산수
	private static int spawaterL;//탄산수 기준값

	private static int yogurtpowder;//요거트파우더
	private static int yogurtpowderL;//요거트파우더 기준값

	private static int teabag;//티백
	private static int teabagL;//티백 기준값

	private static int goguma;//고구마
	private static int gogumaL;//고구마 기준값

	private static int orange;//오렌지
	private static int orangeL;//오렌지 기준값

	private static int cake;//케이크
	private static int cakeL;//케이크 기준값

	private static int bagel;//베이글
	private static int bagelL;//베이글 기준값

	private static int scone;//스콘
	private static int sconeL;//스콘 기준값

	private static int macaron;//마카롱
	private static int macaronL;//마카롱 기준값

	private static int cookie;//쿠키
	private static int cookieL;//쿠키 기준값

	private static int creamcheese;//크림치즈
	private static int creamcheeseL;//크림치즈 기준값

	private static int stroberryjam;//딸기잼
	private static int stroberryjamL;//딸기잼 기준값

	private static int whipcream;//휘핑크림
	private static int whipcreamL;//휘핑크림 기준값

	///////////////////////누적 수량 받을 속성(이채빈)////////////////////

	private static int Nbean; //원두
	private static int Nmilk;//우유
	private static int Nchoco; //초코시럽
	private static int Nvanilla; //바닐라시럽
	private static int Nhazel;	// 헤이즐넛시럽
	private static int Ncaramel;	//카라멜시럽
	private static int Ngrapefruit;//자몽
	private static int Nspawater;//탄산수
	private static int Nyogurtpowder;//요거트파우더
	private static int Nteabag;//티백
	private static int Ngoguma;//고구마
	private static int Norange;//오렌지
	private static int Ncake;//케이크
	private static int Nbagel;//베이글
	private static int Nscone;//스콘
	private static int Nmacaron;//마카롱
	private static int Ncookie;//쿠키
	private static int Ncreamcheese;//크림치즈
	private static int Nstroberryjam;//딸기잼
	private static int Nwhipcream;//휘핑크림

	///////////////////////////누적수량 게터세터////////////////////////////
	public static int getNbean() {
		return Nbean;
	}
	public static void setNbean(int nbean) {
		Nbean = nbean;
	}
	public static int getNmilk() {
		return Nmilk;
	}
	public static void setNmilk(int nmilk) {
		Nmilk = nmilk;
	}
	public static int getNchoco() {
		return Nchoco;
	}
	public static void setNchoco(int nchoco) {
		Nchoco = nchoco;
	}
	public static int getNvanilla() {
		return Nvanilla;
	}
	public static void setNvanilla(int nvanilla) {
		Nvanilla = nvanilla;
	}
	public static int getNhazel() {
		return Nhazel;
	}
	public static void setNhazel(int nhazel) {
		Nhazel = nhazel;
	}
	public static int getNcaramel() {
		return Ncaramel;
	}
	public static void setNcaramel(int ncaramel) {
		Ncaramel = ncaramel;
	}
	public static int getNgrapefruit() {
		return Ngrapefruit;
	}
	public static void setNgrapefruit(int ngrapefruit) {
		Ngrapefruit = ngrapefruit;
	}
	public static int getNspawater() {
		return Nspawater;
	}
	public static void setNspawater(int nspawater) {
		Nspawater = nspawater;
	}
	public static int getNyogurtpowder() {
		return Nyogurtpowder;
	}
	public static void setNyogurtpowder(int nyogurtpowder) {
		Nyogurtpowder = nyogurtpowder;
	}
	public static int getNteabag() {
		return Nteabag;
	}
	public static void setNteabag(int nteabag) {
		Nteabag = nteabag;
	}
	public static int getNgoguma() {
		return Ngoguma;
	}
	public static void setNgoguma(int ngoguma) {
		Ngoguma = ngoguma;
	}
	public static int getNorange() {
		return Norange;
	}
	public static void setNorange(int norange) {
		Norange = norange;
	}
	public static int getNcake() {
		return Ncake;
	}
	public static void setNcake(int ncake) {
		Ncake = ncake;
	}
	public static int getNbagel() {
		return Nbagel;
	}
	public static void setNbagel(int nbagel) {
		Nbagel = nbagel;
	}
	public static int getNscone() {
		return Nscone;
	}
	public static void setNscone(int nscone) {
		Nscone = nscone;
	}
	public static int getNmacaron() {
		return Nmacaron;
	}
	public static void setNmacaron(int nmacaron) {
		Nmacaron = nmacaron;
	}
	public static int getNcookie() {
		return Ncookie;
	}
	public static void setNcookie(int ncookie) {
		Ncookie = ncookie;
	}
	public static int getNcreamcheese() {
		return Ncreamcheese;
	}
	public static void setNcreamcheese(int ncreamcheese) {
		Ncreamcheese = ncreamcheese;
	}
	public static int getNstroberryjam() {
		return Nstroberryjam;
	}
	public static void setNstroberryjam(int nstroberryjam) {
		Nstroberryjam = nstroberryjam;
	}
	public static int getNwhipcream() {
		return Nwhipcream;
	}
	public static void setNwhipcream(int nwhipcream) {
		Nwhipcream = nwhipcream;
	}


	//////////////////////////////////////////////////////////////////////////
	public void setBean(int bean)
	{
		this.bean = bean;
	}
	public int getBean()
	{
		return bean;
	}
	public void setBeanL(int beanL)
	{
		this.beanL = beanL;
	}
	public int getBeanL()
	{
		return beanL;
	}

	public void setMilk(int milk)
	{
		this.milk = milk;
	}
	public int getMilk()
	{
		return milk;
	}
	public void setMilkL(int milkL)
	{
		this.milkL = milkL;
	}
	public int getMilkL()
	{
		return milkL;
	}

	public int getChoco() 
	{
		return choco;
	}
	public void setChoco(int choco) 
	{
		this.choco = choco;
	}
	public int getChocoL() 
	{
		return chocoL;
	}
	public void setChocoL(int chocoL) 
	{
		this.chocoL = chocoL;
	}
	public int getVanilla() 
	{
		return vanilla;
	}
	public void setVanilla(int vanilla) 
	{
		this.vanilla = vanilla;
	}
	public int getVanillaL() 
	{
		return vanillaL;
	}
	public void setVanillaL(int vanillaL) 
	{
		this.vanillaL = vanillaL;
	}
	public int getHazel() 
	{
		return hazel;
	}
	public void setHazel(int hazel) 
	{
		this.hazel = hazel;
	}
	public int getHazelL() 
	{
		return hazelL;
	}
	public void setHazelL(int hazelL) 
	{
		this.hazelL = hazelL;
	}
	public int getCaramel() 
	{
		return caramel;
	}
	public void setCaramel(int caramel) 
	{
		this.caramel = caramel;
	}
	public int getCaramelL() 
	{
		return caramelL;
	}
	public void setCaramelL(int caramelL) 
	{
		this.caramelL = caramelL;
	}
	public  int getGrapefruit() {
		return grapefruit;
	}
	public void setGrapefruit(int grapefruit) 
	{
		this.grapefruit = grapefruit;
	}
	
	public  int getGrapefruitL() 
	{
		return grapefruitL;
	}
	public  void setGrapefruitL(int grapefruitL) 
	{
		this.grapefruitL = grapefruitL;
	}

	
	public  int getSpawater() 
	{
		return spawater;
	}
	public  void setSpawater(int spawater) 
	{
		this.spawater = spawater;
	}
	public  int getSpawaterL() 
	{
		return spawaterL;
	}
	public  void setSpawaterL(int spawaterL) 
	{
		this.spawaterL = spawaterL;
	}

	public  int getYogurtpowder() 
	{
		return yogurtpowder;
	}

	public  void setYogurtpowder(int yogurtpowder) 
	{
		this.yogurtpowder = yogurtpowder;
	}

	public  int getYogurtpowderL()
	{
		return yogurtpowderL;
	}

	public  void setYogurtpowderL(int yogurtpowderL)
	{
		this.yogurtpowderL = yogurtpowderL;
	}

	public  int getTeabag() 
	{
		return teabag;
	}

	public  void setTeabag(int teabag) 
	{
		this.teabag = teabag;
	}
	public  int getTeabagL()
	{
		return teabagL;
	}

	public  void setTeabagL(int teabagL) 
	{
		this.teabagL = teabagL;
	}
	public  int getGoguma() 
	{
		return goguma;
	}
	public  void setGoguma(int goguma) 
	{
		this.goguma = goguma;
	}
	public  int getGogumaL() 
	{
		return gogumaL;
	}

	public  void setGogumaL(int gogumaL) 
	{
		this.gogumaL = gogumaL;
	}

	public  int getOrange()
	{ 
		return orange;
	}

	public  void setOrange(int orange) 
	{
		this.orange = orange;
	}

	public  int getOrangeL() 
	{
		return orangeL;
	}

	public  void setOrangeL(int orangeL) 
	{
		this.orangeL = orangeL;
	}

	public  int getCake() 
	{
		return cake;
	}
	public  void setCake(int cake)
	{
		this.cake = cake;
	}

	public  int getCakeL() 
	{
		return cakeL;
	}

	public  void setCakeL(int cakeL) 
	{
		this.cakeL = cakeL;
	}

	public  int getBagel() 
	{
		return bagel;
	}

	public  void setBagel(int bagel) 
	{
		this.bagel = bagel;
	}

	public  int getBagelL() 
	{
		return bagelL;
	}

	public  void setBagelL(int bagelL)
	{
		this.bagelL = bagelL;
	}
	public  int getScone()
	{
		return scone;
	}

	public  void setScone(int scone) 
	{
		this.scone = scone;
	}

	public  int getSconeL()
	{
		return sconeL;
	}

	public  void setSconeL(int sconeL)
	{
		this.sconeL = sconeL;
	}

	public  int getMacaron() 
	{
		return macaron;
	}

	public  void setMacaron(int macaron) 
	{
		this.macaron = macaron;
	}
	public  int getMacaronL()
	{
		return macaronL;
	}

	public  void setMacaronL(int macaronL)
	{
		this.macaronL = macaronL;
	}

	public  int getCookie() 
	{
		return cookie;
	}

	public  void setCookie(int cookie)
	{
		this.cookie = cookie;
	}

	public  int getCookieL() 
	{
		return cookieL;
	}

	public  void setCookieL(int cookieL)
	{
		this.cookieL = cookieL;
	}

	public  int getCreamcheese()
	{
		return creamcheese;
	}

	public  void setCreamcheese(int creamcheese) 
	{
		this.creamcheese = creamcheese;
	}

	public  int getCreamcheeseL() 
	{
		return creamcheeseL;
	}

	public  void setCreamcheeseL(int creamcheeseL) 
	{
		this.creamcheeseL = creamcheeseL;
	}

	public  int getStroberryjam() 
	{
		return stroberryjam;
	}

	public  void setStroberryjam(int stroberryjam)
	{
		this.stroberryjam = stroberryjam;
	}

	public  int getStroberryjamL() 
	{
		return stroberryjamL;
	}

	public  void setStroberryjamL(int stroberryjamL) 
	{
		this.stroberryjamL = stroberryjamL;
	}

	public  int getWhipcream() 
	{
		return whipcream;
	}

	public  void setWhipcream(int whipcream) 
	{
		this.whipcream = whipcream;
	}

	public  int getWhipcreamL() 
	{
		return whipcreamL;
	}

	public  void setWhipcreamL(int whipcreamL)
	{
		this.whipcreamL = whipcreamL;
	}
	

}