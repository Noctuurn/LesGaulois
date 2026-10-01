package personnages;

public class Chaudron {
    private int quantitePotion;
    private int forcePotion;

    public void remplirChaudron(int quantite, int forcePotion){
        this.quantitePotion = quantite;
        this.forcePotion = forcePotion;
    }

    public Boolean restePotion(){
        return this.quantitePotion > 0;
    }

    public int prendreLouche(){
        quantitePotion -= this.quantitePotion;
        return this.forcePotion;
    }

}
