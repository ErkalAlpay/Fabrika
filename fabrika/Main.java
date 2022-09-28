public class Main {
    public static void main(String[] args) {


        Otomobil otomobil1 = new O1();

        otomobil1.ozellikGosterOtomobil();
        
        System.out.println("------------------------");
        Kamyon kamyon1 = new K1();

        kamyon1.ozellikGosterKamyon();


        Kamyon kamyon2 = new K2();

        System.out.println("-----------");

        kamyon2.ozellikGosterKamyon();


        System.out.println("-----------");

        kamyon1.ozellikGosterKamyon();
        

        
        
    }
}
