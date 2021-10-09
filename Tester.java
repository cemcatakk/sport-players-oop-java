public class Tester {
    public Tester(){
        /*
         * NOTE: data for objects is assumed to be in the following order
         * "name", "position", "team", height (in inches), weight, agility, speed, ballhandling
         * not all players will have the four int values
         * CollegeBasketballPlayers will also have yearsOfEligibility, role and
         * ProBasketballPlayers will have yearsInLeague, role
         *NOTE: data for objects is assumed to be in the following order
         * "name", "position", "team", height (in inches), weight, agility, speed, ballhandling
         * not all players will have the four int values
         * CollegeBasketballPlayers will also have yearsOfEligibility, role and
         * ProBasketballPlayers will have yearsInLeague, role
         */
        //Tester sınıfı yapıcı metotunda test nesneleri oluşturuluyor ve metotları çağırılıp ekrana yazdırılıyor
        BasketballPlayer bp1;
        CollegeBasketballPlayer bp2;
        ProBasketballPlayer bp3;
        bp1=new BasketballPlayer("Tim Duncan", "Center", "Spurs", 83, 220, 4, 5, 8);
        bp2=new CollegeBasketballPlayer("Jaylen Reynolds", "Forward", "Xavier", 82, 215, 7, 7,
                3, 1, "starter");
        bp3=new ProBasketballPlayer("D'Angelo Russell", "Guard", "Lakers", 77, 190, 7, 9, 7, 1,
                "starter");
        System.out.println(bp1);
//Alttaki hatalı satırda, bp1 sınıfının newContractValue() metotu çağırılmaya çalışılmıştır ancak BasketballPlayer sınıfında böyle bir metot yoktur, ProBasketballPlayer sınıfında vardır.
//System.out.println(bp1.newContractValue());
        System.out.println(bp2);
        System.out.println(bp2.draftable());
        System.out.println(bp3);
        System.out.println(bp3.newContractValue());
        bp1=new CollegeBasketballPlayer("Troy Caupain", "Guard", "UC");
        System.out.println(bp1);
//Alttaki hatalı satırda, bp1 sınıfının draftable() metotu çağırılmaya çalışmıştır ancak BasketballPlayer sınıfında böyle bir metot yoktur, CollegeBasketballPlayer sınıfında vardır.
//System.out.println(bp1.draftable());
        bp2=new CollegeBasketballPlayer("Troy Caupain", "Guard", "UC", 75, 180, 9, 6, 8, 1,
                "starter");
        System.out.println(bp2);
        System.out.println(bp2.draftable());
        bp1=new BasketballPlayer("J P Macura", "Guard", "Xavier", 77, 190, 8, 4, 5);
        System.out.println(bp1.getValue());
        System.out.println(bp3.getValue());
        bp3=new ProBasketballPlayer("Lebron James", "Forward", "Cavs", 81, 250, 9, 10, 5, 10,
                "starter");
        System.out.println(bp3);
        System.out.println(bp3.newContractValue());
//Alttaki hatalı satırda, ProBasketballPlayer yerine BasketballPlayer sınıfı tanımlanmıştır, bu sebeple hata verir.
//bp3 = new BasketballPlayer("Matt Stainbrook", "Center", "Merlins", 82, 270, 6, 5, 6);
        System.out.println(bp3);
        bp3 = new ProBasketballPlayer("David West", "Forward", "Spurs", 80, 215, 7, 6, 8, 10,
                "bench");
        System.out.println(bp3);
//Alttaki hatalı satırda, bp3 sınıfının draftable() metotu çağırılmaya çalışmıştır ancak ProBasketballPlayer sınıfında böyle bir metot yoktur, CollegeBasketballPlayer sınıfında vardır.
//System.out.println(bp3.draftable());
        System.out.println(bp3.newContractValue());
    }

    public static void main(String[] args) {
        Tester tester=new Tester();
    }
}
