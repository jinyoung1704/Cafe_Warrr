// 메뉴별 판매량 속성 클래스(이채빈) 
class Sales 
{

   //속성 : 일별 판매량 누적 변수  
   // ① 커피류
   private static int Sespresso;
   private static int Samericano;   
   private static int Slatte;
   private static int ScafeMoca;
   private static int Scappuccino;
   private static int SvanillaLatte;
   private static int ScaramelM;
   
   // ② 논커피류
   private static int SjamongAde;
   private static int Syogurt;
   private static int Stea;
   private static int SorangeJuice;
   private static int SgogumaLatte;
   
   // ③ 디저트류 
   private static int Scake;
   private static int Sbagel;
   private static int Sscone;
   private static int Smacaron;
   private static int Scookie;

	 
	// 각 메뉴 총 판매량 누적(주한별)
	 // ① 커피류
	public static int saveEspresso;
	public static int saveAmericano;
	public static int saveLatte;
	public static int saveCafeMoca;
	public static int saveCappuccino;
	public static int saveVanillaLatte;
	public static int saveCaramelM;

	// ② 논커피류
	public static int saveJamongAde;
	public static int saveYogurt;
	public static int saveTea;
	public static int saveOrangeJuice;
	public static int saveGogumaLatte;

	 // ③ 디저트류 
	public static int saveCake;
	public static int saveBagel;
	public static int saveScone;
	public static int saveMacaron;
	public static int saveCookie;


   //게터세터 

   public static int getSespresso() {
         return Sespresso;
      }
      public static void setSespresso(int sespresso) {
         Sespresso = sespresso;
      }
      public static int getSamericano() {
         return Samericano;
      }
      public static void setSamericano(int samericano) {
         Samericano = samericano;
      }
      public static int getSlatte() {
         return Slatte;
      }
      public static void setSlatte(int slatte) {
         Slatte = slatte;
      }
      public static int getScafeMoca() {
         return ScafeMoca;
      }
      public static void setScafeMoca(int scafeMoca) {
         ScafeMoca = scafeMoca;
      }
      public static int getScappuccino() {
         return Scappuccino;
      }
      public static void setScappuccino(int scappuccino) {
         Scappuccino = scappuccino;
      }
      public static int getSvanillaLatte() {
         return SvanillaLatte;
      }
      public static void setSvanillaLatte(int svanillaLatte) {
         SvanillaLatte = svanillaLatte;
      }
      public static int getScaramelM() {
         return ScaramelM;
      }
      public static void setScaramelM(int scaramelM) {
         ScaramelM = scaramelM;
      }
      public static int getSjamongAde() {
         return SjamongAde;
      }
      public static void setSjamongAde(int sjamongAde) {
         SjamongAde = sjamongAde;
      }
      public static int getSyogurt() {
         return Syogurt;
      }
      public static void setSyogurt(int syogurt) {
         Syogurt = syogurt;
      }
      public static int getStea() {
         return Stea;
      }
      public static void setStea(int stea) {
         Stea = stea;
      }
      public static int getSorangeJuice() {
         return SorangeJuice;
      }
      public static void setSorangeJuice(int sorangeJuice) {
         SorangeJuice = sorangeJuice;
      }
      public static int getSgogumaLatte() {
         return SgogumaLatte;
      }
      public static void setSgogumaLatte(int sgogumaLatte) {
         SgogumaLatte = sgogumaLatte;
      }
      public static int getScake() {
         return Scake;
      }
      public static void setScake(int scake) {
         Scake = scake;
      }
      public static int getSbagel() {
         return Sbagel;
      }
      public static void setSbagel(int sbagel) {
         Sbagel = sbagel;
      }
      public static int getSscone() {
         return Sscone;
      }
      public static void setSscone(int sscone) {
         Sscone = sscone;
      }
      public static int getSmacaron() {
         return Smacaron;
      }
      public static void setSmacaron(int smacaron) {
         Smacaron = smacaron;
      }
      public static int getScookie() {
         return Scookie;
      }
      public static void setScookie(int scookie) {
         Scookie = scookie;
      }

}
