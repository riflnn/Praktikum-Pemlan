package BattleHero;
import java.util.Scanner;

public class HeroMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Permainan adu hero\n" + "Player 1 : Silahkan masukkan hero Anda!\n"+ "Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!\n" + "============================================");

        System.out.print("Nama Hero\t: ");
        String name1 = scanner.nextLine();
        System.out.print("Health Point\t: ");
        double hp1 = scanner.nextDouble();
        System.out.print("Attack\t\t: ");
        double attack1 = scanner.nextDouble();
        System.out.print("Defense\t\t: ");
        double defense1 = scanner.nextDouble();
        scanner.nextLine();
        Hero hero1 = new Hero(name1, hp1, attack1, defense1);

        System.out.println("\nPermainan adu hero\n" + "Player 2 : Silahkan masukkan hero Anda!\n"+ "Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!\n" + "============================================");
        Hero hero2 = new Hero();
        System.out.print("Nama Hero\t: ");
        String name2 = scanner.nextLine();
        System.out.print("Health Point\t: ");
        double hp2 = scanner.nextDouble();
        System.out.print("Attack\t\t: ");
        double attack2 = scanner.nextDouble();
        System.out.print("Defense\t\t: ");
        double defense2 = scanner.nextDouble();
        hero2.setName(name2);
        hero2.setHp(hp2);
        hero2.setAttack(attack2);
        hero2.setDefense(defense2);

        System.out.println("============================================\n" + "============================================");
        int ronde = 0;
        while (hero1.getHp() > 0 && hero2.getHp() > 0) {
            ronde++;
            System.out.println("Ronde " + ronde);
            hero2.seranganDua(hero2, hero1);
            if(hero1.getHp() > 0){
                hero1.seranganSatu(hero1, hero2);
            }
            if(ronde >= 5){
                break;
            }
        }

        if (hero1.getHp() == 0.0 && hero2.getHp() != 0.0) {
            System.out.println(hero1.getName() + " telah kalah!\n=========================================\n" + hero2.getName() + " adalah pemenangnya\n");
        } else if (hero2.getHp() == 0.0 && hero1.getHp() != 0.0) {
            System.out.println(hero2.getName() + " telah kalah!\n=========================================\n" + hero1.getName() + " adalah pemenangnya\n");
        } else {
            System.out.println("Pertandingan Seri! Kedua hero sama kuat!");
        }

        
    }
}
