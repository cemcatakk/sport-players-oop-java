public class ProBasketballPlayer extends BasketballPlayer {
    //BasketballPlayer sınıfından kalıtım alınıyor
    //Sınıf özellikleri
    private int yearsInLeague;
    private String role;
    //Parametreseiz yapıcı metot
    public ProBasketballPlayer() {
        super();
        this.role="bench";
        this.yearsInLeague=0;
    }
    //3 Değişkenli yapıcı metot
    public ProBasketballPlayer(String name, String position, String team) {
        super(name, position, team);
        this.yearsInLeague = 0;
        this.role = "bench";
    }
    //Tüm değişkenlerin parametre alındığı yapıcı metot, 3 yapıcı metotta da super çağırılarak BasketballPlayer sınıfı yapıcı metotları çağırılıyor
    public ProBasketballPlayer(String name, String position, String team, int height, int weight, int agility, int speed, int ballHandling, int yearsInLeague, String role) {
        super(name, position, team, height, weight, agility, speed, ballHandling);
        this.yearsInLeague = yearsInLeague;
        this.role = role;
    }
    //Tabloda belirtilen değerler kontrol edilerek Value değerine atanıyor ve bu değer geri döndürülüyor
    public int newContractValue(){
        int Value;
        if (getYearsInLeague()<3){//Eğer 3 yıldan az ise değer 0'dır
            Value=0;
        }
        else{
            //getRole metotunda toLowerCase kullanarak rolleri küçük harfe çevirip kontrol ediyoruz. Hatalı hesaplama riskini önlüyoruz
            //Rol starter ise
            if (getRole().toLowerCase().equals("starter")){
                if (getValue()>8&&getYearsInLeague()>=10) Value=12000000;
                else if(getValue()>7&&getYearsInLeague()>=8) Value=10000000;
                else if(getValue()>7&&getYearsInLeague()>=5) Value=8000000;
                else if(getValue()>5&&getYearsInLeague()>=10) Value=6000000;
                else if(getValue()>=5)Value=2000000;
                else Value=1000000;
            }
            //Rol bench ise
            else if(getRole().toLowerCase().equals("bench")){
                if (getValue()>8&&getYearsInLeague()>=10) Value=7500000;
                else if(getValue()>7&&getYearsInLeague()>=8) Value=5000000;
                else if(getValue()>5&&getYearsInLeague()>=10) Value=4500000;
                else if(getYearsInLeague()>=7) Value=2000000;
                else Value=500000;
            }
            //Hiçbiri değil ise değer 0 olur
            else{
                Value=0;
            }
        }
        return Value;
    }
    //get metotları
    public int getYearsInLeague() {
        return yearsInLeague;
    }

    public String getRole() {
        return role;
    }
    //toString metotu, super.toString() metotunu Pro'dan sonra çağırarak Pro+BasketballPlayer değeri elde ediliyor
    @Override
    public String toString() {
        return "Pro" + super.toString()+
                ", yearsInLeague=" + yearsInLeague +
                ", role=" + role;
    }
}
