class SlimeDiffusion extends PotionBase {
    public void reactivity() {
        if(this.item == ITEMLIST[0]) {
            System.out.println("Nothing much seems to happen");
        }
        else if (this.item == ITEMLIST[1]) {
            System.out.println("The mixture swirls with hues of a distant nebula. An incredible energy radiates from within it.");
        }
        else {
            System.out.println("The slime mixture crystalizes upon contact, and shatters shortly after. Small cystals of dubious quality are left in its wake.");
        }
    }
}
