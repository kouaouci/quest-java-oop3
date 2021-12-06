public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle  Karima = new Eagle("Karima");
        // TODO : uncomment the following code in order to test it
      
        Karima.takeOff();
        Karima.glide();
        Karima.descend(17);
        Karima.land();
     
    }
}
