import java.util.Scanner;
abstract class PotionBase {

   Scanner s = new Scanner(System.in);

   final String[] ITEMLIST = new String[]{ "None", "Mana Bloom", "Fool's Quiet Mushroom" };

   public String item = ITEMLIST[0];

   public abstract void reactivity();
   
   public void boil() {
       System.out.println("\nThe potent mixture comes to a boil!\n");
   }

   public void mix() {
       System.out.println("\nChoose an ingredient to begin the potion:\n");
       for(int i = 0; i <= ITEMLIST.length; i++) {
           System.out.println(i + " - " + ITEMLIST[i]);
       }
       int x = s.nextInt();
       if (x == 1) item = ITEMLIST[1];
       else if (x == 2) item = ITEMLIST[2];
   }

}
