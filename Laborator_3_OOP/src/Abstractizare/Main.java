package Abstractizare;

public class Main {
    public static void main(String[] args) {
        Angajat angajat1 = new AngajatStandard(50000);
        Angajat angajat2 = new AngajatCuBonus(50000, 6000);
        Angajat angajat3 = new AngajatConcediuPlat(50000);

        System.out.println("Angajat 1 a lucrat o luna.");
        System.out.println("Salariu primit: " + angajat1.calculeazaSalariu() + " $\n");

        System.out.println("Angajat 2 a lucrat o luna si a primit un bonus.");
        System.out.println("Salariu primit: " + angajat2.calculeazaSalariu() + " $\n");

        System.out.println("Angajat 3 are concediu platit.");
        System.out.println("Salariu primit: " + angajat3.calculeazaSalariu() + " $\n");
    }
}