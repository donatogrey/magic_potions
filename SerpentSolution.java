class SerpentSolution extends PotionBase {
    public void reactivity() {
        if (this.item == ITEMLIST[0]) {
            System.out.println("Nothing much seems to happen.");
        }
        else if (this.item == ITEMLIST[1]) {
            System.out.println("A hissing steam rises from the fixture, as the gasses combust into a flash of flame!");
        }
        else {
            System.out.println("A viscous, agitated liquid rises to the top of the mixture. You feel sleepy from its scent.");
        }
    }
}
