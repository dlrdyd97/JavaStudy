package ch59;

public class CoffeeTest {

    public static void main(String[] args){

        Coffee ethiopiaCoffee=new EthiopiaAmericano();
        ethiopiaCoffee.brewing();

        System.out.println();

        Coffee ethiopiaLatte=new Latte(ethiopiaCoffee);
        ethiopiaLatte.brewing();

        System.out.println();

        Coffee mochaEthiopia=new Mocha(new Latte(new EthiopiaAmericano()));
        mochaEthiopia.brewing();

        System.out.println();

        Coffee kenyaCoffee=new WhippingCream(new Latte(new Mocha(new KenyaAmericano())));
        kenyaCoffee.brewing();


    }

}
