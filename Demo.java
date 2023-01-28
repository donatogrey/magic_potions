import java.util.Scanner;
class Demo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Welcome to Potion Maker! Enter a number to select your base.\nEnter 1 for a Diffused Slime base or 2 for a Snake Blood base - ");
        int x = s.nextInt();

        if (x == 1) {
            SlimeDiffusion slimePotion = new SlimeDiffusion();
            slimePotion.boil();
            slimePotion.mix();
            slimePotion.reactivity();
        } else if (x == 2) {
            SerpentSolution snakePotion = new SerpentSolution();
            snakePotion.boil();
            snakePotion.mix();
            snakePotion.reactivity();
        }
    }
}
