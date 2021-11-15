public class Main {
    public static void main(String a[]) {
        UneClasse uc;

        //Créer une instance de uc
        uc = new UneClasse(10);

        System.out.println("x de UneClass = " + uc.getX());

        uc.inc(10);

        System.out.println("x de UneClass = " + uc.getX());

        System.out.println("x de UneClass = " + uc.incAndget(20));
    }
}