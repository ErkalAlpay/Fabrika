public abstract class Otomobil extends Arac {
    
    

    private String vitesTuru;
    private boolean klima;
    private boolean ustuAcik;

   

    public Otomobil(String modelAdi, int hiz, String üretimYili, double yakitTuketimi, String motorHacmi) {
        super(modelAdi, hiz, üretimYili, yakitTuketimi, motorHacmi, 180);
    
    }

    public void calistir(){
        setAracAcikmi(true);
    }

    public void fren(){
        if( isAracAcikmi()== true){
            setHiz(getHiz()-20);
        }

    }

    public void gaz(){
        if(isAracAcikmi() == true){
            setHiz(getHiz()+20);
        }
    }

    public void ozellikGosterOtomobil(){
        System.out.println("Model adı = "+ getModelAdi() +"\n" + "Üretim Yılı = "+getUretimYili()+ "\n"+"Yakıt Tüketimi = " +getYakitTuketimi() +
        "\n"+ "Motor Hacmi = " + getMotorHacmi() + "\n"+  "Max Hız = "+ getMaxHiz() +"\n" + "Vites Türü = " + vitesTuru + "\n" + "Klima = " 
        + klima + "\n" + "Üstü Açık mı = " + ustuAcik  );
        
    }

    @Override
    public String toString() {
        return super.getModelAdi() + " " + super.getUretimYili() + " " + super.getMotorHacmi();
    }

    public String getVitesTuru() {
        return vitesTuru;
    }

    public String setVitesTuru(String vitesTuru) {
        this.vitesTuru = vitesTuru;
        return vitesTuru;
    }

    public boolean isKlima() {
        return klima;
    }

    public boolean setKlima(boolean klima) {
        this.klima = klima;
        return klima;
    }

    public boolean isUstuAcik() {
        return ustuAcik;
    }

    public boolean setUstuAcik(boolean ustuAcik) {
        this.ustuAcik = ustuAcik;
        return ustuAcik;
    }
}

