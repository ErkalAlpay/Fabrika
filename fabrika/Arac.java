import java.util.Date;

public abstract class Arac {

    private String modelAdi;
    private int hiz = 0;
    private String uretimYili;
    private double yakitTuketimi;
    private String motorHacmi;
    private int maxHiz;
    static int toplamArac;
    private boolean aracAcikmi;

   

    public Arac(String modelAdi, int hiz, String uretimYili, double yakitTuketimi, String motorHacmi, int maxHiz) {
        this.modelAdi = modelAdi;
        this.hiz = hiz;
        this.uretimYili = uretimYili;
        this.yakitTuketimi = yakitTuketimi;
        this.motorHacmi = motorHacmi;
        this.maxHiz = maxHiz;
        toplamArac++;
    }

    static Date objDate = new Date();

    public void toplamArac(){
        System.out.println("Toplam Araç Sayısı = "+toplamArac);
    }

    public int getMaxHiz() {
        return maxHiz;
    }

    public String getModelAdi() {
        return modelAdi;
    }

    public void setModelAdi(String modelAdi) {
        this.modelAdi = modelAdi;
    }

    public int getHiz() {
        return hiz;
    }

    public int setHiz(int hiz) {
        this.hiz = hiz;
        return hiz;
    }

    public String getUretimYili() {
        return uretimYili;
    }

    public String setUretimYili(String uretimYili) {
        this.uretimYili = uretimYili;
        return uretimYili;
    }

    public double getYakitTuketimi() {
        return yakitTuketimi;
    }

    public void setYakitTuketimi(double yakitTuketimi) {
        this.yakitTuketimi = yakitTuketimi;
    }

    public String getMotorHacmi() {
        return motorHacmi;
    }

    public String setMotorHacmi(String motorHacmi) {
        this.motorHacmi = motorHacmi;
        return motorHacmi;
    }

    public int setMaxHiz(int maxHiz) {
        this.maxHiz = maxHiz;
        return maxHiz;
    }

    public static int getToplamArac() {
        return toplamArac;
    }

    public static int setToplamArac(int toplamArac) {
        Arac.toplamArac = toplamArac;
        return toplamArac;
    }

    public boolean isAracAcikmi() {
        return aracAcikmi;
    }

    public boolean setAracAcikmi(boolean aracAcikmi) {
        this.aracAcikmi = aracAcikmi;
        return aracAcikmi;
    }

    
     




   
    
}


