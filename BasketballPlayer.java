public class BasketballPlayer {
    //Sınıf özellikleri
    private String name;
    private String position;
    private String team;
    private int height;
    private int weight;
    private int agility;
    private int speed;
    private int ballHandling;
    //Parametresiz yapıcı metot, tüm değerler null ve 0 yapılıyor
    public BasketballPlayer() {
        this.name = null;
        this.position = null;
        this.team = null;
        this.height = 0;
        this.weight = 0;
        this.agility = 0;
        this.speed = 0;
        this.ballHandling = 0;
    }
    //3 Parametreli yapıcı metot, parametreler hariç değerler 0 yapılıyor
    public BasketballPlayer(String name, String position, String team) {
        this.name = name;
        this.position = position;
        this.team = team;
        this.height = 0;
        this.weight = 0;
        this.agility = 0;
        this.speed = 0;
        this.ballHandling = 0;
    }
    //Tüm parametrelerin geldiği yapıcı metot, tüm değerler özelliklere aktarılıyor
    public BasketballPlayer(String name, String position, String team, int height, int weight, int agility, int speed, int ballHandling) {
        this.name = name;
        this.position = position;
        this.team = team;
        this.height = height;
        this.weight = weight;
        this.agility = agility;
        this.speed = speed;
        this.ballHandling = ballHandling;
    }
    //toString metotu
    @Override
    public String toString() {
        return "BasketballPlayer " +
                "name=" + name +
                ", position=" + position +
                ", team=" + team +
                ", value=" + getValue();
    }
    //getValue metotu
    public int getValue(){
        //Value değeri koşullara göre hesaplanıp geri döndürülecek
        int Value;
        //toLowerCase kullanarak tüm harfleri küçük yapıyoruz ve bu şekilde kontrol sağlıyoruz
        //Eğer pozisyon 'center' ise tabloya göre diğer koşullar kontrol ediliyor
        if (getPosition().toLowerCase().equals("center")){
            if (getHeight()>=82&&(getWeight()>220 && getWeight()<250)&&getBallHandling()>5) Value=10;
            else if(getHeight()>=80&&(getWeight()>210 && getWeight()<260)&&getBallHandling()>5) Value=8;
            else if(getHeight()>=80&&getBallHandling()>4) Value=6;
            else if(getHeight()>=78&&getAgility()>7) Value=5;
            else if(getHeight()>=78) Value=4;
            else if(getHeight()>=76&&getAgility()>5) Value=2;
            else Value=0;
        }
        //Eğer pozisyon 'forward' ise tabloya göre diğer koşullar kontrol ediliyor
        else if(getPosition().toLowerCase().equals("forward")){
            if (getHeight()>=80&&(getAgility()>8 ||getSpeed()>7)) Value=10;
            else if(getHeight()>=78&&getAgility()>6&&getSpeed()>5) Value=8;
            else if(getHeight()>=77&&getAgility()>5) Value=6;
            else if(getHeight()>=76&&getSpeed()>4) Value=5;
            else if(getHeight()>=75&& (getAgility()>3 ||getSpeed()>3)) Value=3;
            else if(getHeight()>=74) Value=1;
            else Value=0;
        }

        //Eğer pozisyon 'guard' ise tabloya göre diğer koşullar kontrol ediliyor
        else if(getPosition().toLowerCase().equals("guard")){
            if (getHeight()>=78&&getBallHandling()>7&&(getAgility()>7||getSpeed()>7)) Value=10;
            else if(getHeight()>76 && getBallHandling()>7&&(getAgility()>6||getSpeed()>6)) Value=8;
            else if(getHeight()>=74&&getBallHandling()>5&&getAgility()>5&&getSpeed()>6) Value=6;
            else if(getBallHandling()>6&&getAgility()>6&&getSpeed()>5) Value=4;
            else if(getBallHandling()>4&&getAgility()>4) Value=2;
            else Value=0;
        }
        else Value=0;
        return Value;
    }
    //get Metotları
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAgility() {
        return agility;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBallHandling() {
        return ballHandling;
    }

    static String multiply(String num1, String num2)
    {
        int len1 = num1.length();
        int len2 = num2.length();
        if (len1 == 0 || len2 == 0)
            return "0";
        int result[] = new int[len1 + len2];
        int i_n1 = 0;
        int i_n2 = 0;
        for (int i = len1 - 1; i >= 0; i--)
        {
            int carry = 0;
            int n1 = num1.charAt(i) - '0';
            i_n2 = 0;
            for (int j = len2 - 1; j >= 0; j--)
            {
                int n2 = num2.charAt(j) - '0';
                int sum = n1 * n2 + result[i_n1 + i_n2] + carry;
                carry = sum / 10;
                result[i_n1 + i_n2] = sum % 10;
                i_n2++;
            }
            if (carry > 0)
                result[i_n1 + i_n2] += carry;
            i_n1++;
        }
        int i = result.length - 1;
        while (i >= 0 && result[i] == 0)
            i--;
        if (i == -1)
            return "0";
        String s = "";

        while (i >= 0)
            s += (result[i--]);

        return s;
    }
}
