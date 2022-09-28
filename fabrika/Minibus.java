public abstract class Minibus extends Arac{

    

    private int koltukSayisi = 12;
    private boolean otomatikKApi;
    private boolean klima;

   

    public Minibus(String modelAdi, int hiz, String uretimYili, double yakitTuketimi, String motorHacmi) {
        super(modelAdi, hiz, uretimYili, yakitTuketimi, motorHacmi, 160);
        
    }
    
    public void ozellikGosterMinibus(){
        System.out.println("Model adı = "+ getModelAdi() +"\n" + "Üretim Yılı = "+getUretimYili()+ "\n"+"Yakıt Tüketimi = " +getYakitTuketimi() +
        "\n"+ "Motor Hacmi = " + getMotorHacmi() + "\n"+  "Max Hız = "+ getMaxHiz() +"\n" + "Koltuk Sayısı = " + getKoltukSayisi() + "\n" + "Klima = " 
        + isKlima() + "\n" + "Otomatik Kapılı mı  = " + isOtomatikKApi() );
        
    }


    public void calistir(){
        setAracAcikmi(true);
    }

    public void fren(){
        if( isAracAcikmi()== true){
            setHiz(getHiz()-10);
        }

    }

    public void gaz(){
        if(isAracAcikmi() == true){
            setHiz(getHiz()+10);
        }

    }

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    public int setKoltukSayisi(int koltukSayisi) {
        this.koltukSayisi = koltukSayisi;
        return koltukSayisi;
    }

    public boolean isOtomatikKApi() {
        return otomatikKApi;
    }

    public boolean setOtomatikKApi(boolean otomatikKApi) {
        this.otomatikKApi = otomatikKApi;
        return otomatikKApi;
    }

    public boolean isKlima() {
        return klima;
    }

    public boolean setKlima(boolean klima) {
        this.klima = klima;
        return klima;
    }
}
