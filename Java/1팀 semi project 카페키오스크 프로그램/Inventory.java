// ��� �Ӽ� Ŭ����(��ä��, ��ȣ��)
class Inventory	
{										
	private static int bean; //����
	private static int beanL;//���α��ذ�	

	private static int milk;//����
	private static int milkL;//�������ذ�

	private static int choco; //���ڽ÷�
	private static int chocoL;

	private static int vanilla; //�ٴҶ�÷�
	private static int vanillaL;

	private static int hazel;	// ������ӽ÷�
	private static int hazelL;

	private static int caramel;	//ī���÷�
	private static int caramelL;

	private static int grapefruit;//�ڸ�
	private static int grapefruitL;//�ڸ����ذ�

	private static int spawater;//ź���
	private static int spawaterL;//ź��� ���ذ�

	private static int yogurtpowder;//���Ʈ�Ŀ��
	private static int yogurtpowderL;//���Ʈ�Ŀ�� ���ذ�

	private static int teabag;//Ƽ��
	private static int teabagL;//Ƽ�� ���ذ�

	private static int goguma;//����
	private static int gogumaL;//���� ���ذ�

	private static int orange;//������
	private static int orangeL;//������ ���ذ�

	private static int cake;//����ũ
	private static int cakeL;//����ũ ���ذ�

	private static int bagel;//���̱�
	private static int bagelL;//���̱� ���ذ�

	private static int scone;//����
	private static int sconeL;//���� ���ذ�

	private static int macaron;//��ī��
	private static int macaronL;//��ī�� ���ذ�

	private static int cookie;//��Ű
	private static int cookieL;//��Ű ���ذ�

	private static int creamcheese;//ũ��ġ��
	private static int creamcheeseL;//ũ��ġ�� ���ذ�

	private static int stroberryjam;//������
	private static int stroberryjamL;//������ ���ذ�

	private static int whipcream;//����ũ��
	private static int whipcreamL;//����ũ�� ���ذ�

	///////////////////////���� ���� ���� �Ӽ�(��ä��)////////////////////

	private static int Nbean; //����
	private static int Nmilk;//����
	private static int Nchoco; //���ڽ÷�
	private static int Nvanilla; //�ٴҶ�÷�
	private static int Nhazel;	// ������ӽ÷�
	private static int Ncaramel;	//ī���÷�
	private static int Ngrapefruit;//�ڸ�
	private static int Nspawater;//ź���
	private static int Nyogurtpowder;//���Ʈ�Ŀ��
	private static int Nteabag;//Ƽ��
	private static int Ngoguma;//����
	private static int Norange;//������
	private static int Ncake;//����ũ
	private static int Nbagel;//���̱�
	private static int Nscone;//����
	private static int Nmacaron;//��ī��
	private static int Ncookie;//��Ű
	private static int Ncreamcheese;//ũ��ġ��
	private static int Nstroberryjam;//������
	private static int Nwhipcream;//����ũ��

	///////////////////////////�������� ���ͼ���////////////////////////////
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