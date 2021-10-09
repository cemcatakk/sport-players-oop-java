public class CollegeBasketballPlayer extends BasketballPlayer {
    //private olarak tanımlanmış sınıf özellikleri
    private int eligiblityRemaining;
    private String role;
    //Standart yapıcı metot
    public CollegeBasketballPlayer() {
        super();
        this.eligiblityRemaining = 4;
        this.role = "bench";
    }
    //3 Değişkenli yapıcı metot
    public CollegeBasketballPlayer(String name, String position, String team) {
        super(name, position, team);
        this.eligiblityRemaining = 4;
        this.role = "bench";
    }
    //Tüm değişkenlerin parametre alındığı yapıcı metot
    //3 Yapıcı metotta da super kullanarak, BasketballPlayer sınıfının yapıcı metotlarını da çağırıyoruz
    public CollegeBasketballPlayer(String name, String position, String team, int height, int weight, int agility, int speed, int ballHandling, int eligiblityRemaining, String role) {
        super(name, position, team, height, weight, agility, speed, ballHandling);
        this.eligiblityRemaining = eligiblityRemaining;
        this.role = role;
    }
    //draftable metotu, rol starter ve value>4 ise YA DA rol bench ise ve value>=8 ise TRUE döndürür, değilse otomatik FALSE döndürür
    public boolean draftable(){
        return ((getRole().toLowerCase().equals("starter")&&getValue()>4)||(getRole().toLowerCase().equals("bench")&&getValue()>=8));
    }
    //Get metotları
    public int getEligiblityRemaining() {
        return eligiblityRemaining;
    }

    public String getRole() {
        return role;
    }
    //toString metotu:
    @Override
    public String toString() {
        return "College" +super.toString()+
                ", eligiblityRemaining=" + eligiblityRemaining +
                ", role=" + role;
    }
}
