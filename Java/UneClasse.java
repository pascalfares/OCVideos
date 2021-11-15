public class UneClasse {
    //Une classe définie une encapsulation 
    //de données et de traitements

    //De données

    //Type primitifs (des valeurs)
    int x;

    //Ou de références (d'autres objets)
    AutreClasse ac;

    //Des traitements (les méthodes) en voici quelques un à titre d'exemples
    public void inc(int i) {
        this.x += i;  //this.x = this.x + i - x = x+i
    }

    public int getX() {
        return this.x;
    }
    
    public int incAndget(int i) {
        inc(i);
        return getX();
    }

    //--- Mais un objet il faut l'initialiser parfois => constructeur
    public UneClasse(int x) {
        this.x = x;
    }

    // La question qui se pose ? comment utiliser cette classe?

    //1 - Créer une instance d'objet => opérateur new
    //2 - Puis appeler et utiliser les méthodes public
    //=> J'ai fais ceci dans la classe Main
}
