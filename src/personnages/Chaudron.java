package personnages;

public class Chaudron {
private int quantitePotion;
private int forcePotion;

public void remplirChaudron(int quantite, int forcePotion){
    this.quantitePotion = quantite;
    this.forcePotion = forcePotion;
}

public boolean resterPotion(){
    if (this.quantitePotion > 0 ) {
        return true
    } else {
        return false
    }
}

public int prendreLouche(){

}

}
