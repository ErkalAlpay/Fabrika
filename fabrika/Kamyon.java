public abstract class  Kamyon extends Arac {

    private int yukKapasitesi;
    private int tekerSayisi;
    private boolean klima;
    private boolean damper;


    public Kamyon(String modelAdi, int hiz, String üretimYili, double yakitTuketimi, String motorHacmi) {
        super(modelAdi, hiz, üretimYili, yakitTuketimi, motorHacmi, 120);
        

    }


    public void ozellikGosterKamyon(){
        System.out.println("Model adı = "+ getModelAdi() +"\n" + "Üretim Yılı = "+getUretimYili()+ "\n"+"Yakıt Tüketimi = " + getYakitTuketimi() +
        "\n"+ "Motor Hacmi = " + getMotorHacmi() + "\n"+  "Max Hız = "+ getMaxHiz() +"\n" + "Yük Kapasitesi = " + getYukKapasitesi() + "\n" + "Klima = " 
        + isKlima() + "\n" + "Kaç Tekerli = " + getTekerSayisi() + "\n" + "Damper var mı = " + isDamper());
        
    }

    

    public void calistir(){
        setAracAcikmi(true);
    }

    public void fren(){
        if( isAracAcikmi()== true){
            setHiz(getHiz()-5);
        }

    }

    public void gaz(){
        if(isAracAcikmi() == true){
            setHiz(getHiz()+5);
        }
    }


    public int getYukKapasitesi() {
        return yukKapasitesi;
    }


    public void setYukKapasitesi(int yukKapasitesi) {
        this.yukKapasitesi = yukKapasitesi;
    }


    public int getTekerSayisi() {
        return tekerSayisi;
    }


    public void setTekerSayisi(int tekerSayisi) {
        this.tekerSayisi = tekerSayisi;
    }


    public boolean isKlima() {
        return klima;
    }


    public void setKlima(boolean klima) {
        this.klima = klima;
    }


    public boolean isDamper() {
        return damper;
    }


    public void setDamper(boolean damper) {
        this.damper = damper;
    }


    
}
