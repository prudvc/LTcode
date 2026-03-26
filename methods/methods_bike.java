public class methods_bike {
    public static void main(String[] args)
    {
        Bike ktm=new Bike();
        ktm.bikeName="Ktm 390";
        ktm.cc=373;
        ktm.power=44;
        ktm.topSpeed=180;

        System.out.println("ktm  "+ktm.bikeName+" \n engine capacity was :"+ktm.cc+" \n power was : "+ktm.power +" \n top speed was : "+ktm.topSpeed);
        // ktm.pricing(3);
        ktm.pricing(4);

        Bike yamaha=new Bike();
        yamaha.bikeName="Yahama r15v4M";
        yamaha.cc=155;
        yamaha.power=14;
        yamaha.topSpeed=140;

        System.out.println("ktm  "+yamaha.bikeName+"\n engine capacity was :"+yamaha.cc+" \n power was : "+yamaha.power +" \n top speed was : "+yamaha.topSpeed);
        yamaha.pricing(2);

    }
}


class Bike
{
    String bikeName;
    int cc;
    int power;
    int topSpeed;
    int price;

     void pricing(int bikePrice)
    {
        price=bikePrice;
        System.out.println( bikeName+" price was : "+bikePrice+" Lakhs..");
    }

    // public void power(int power)
    // {
    //     System.out.println("power -->"+bike.power);
    // }
}
