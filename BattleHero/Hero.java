package BattleHero;
import java.util.Scanner;

public class Hero {
    private  String name;
    private double hp;
    private double attack;
    private double defense;

    public Hero(String name, double hp, double attack, double defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public Hero() {

    }

    public String getName() {
        return name;
    }
    public double getHp() {
        return hp;
    }
    public double getAttack() {
        return attack;
    }
    public double getDefense() {
        return defense;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHp(double hp) {
        this.hp = hp;
    }
    public void setAttack(double attack) {
        this.attack = attack;
    }
    public void setDefense(double defense) {
        this.defense = defense;
    }

    public void seranganSatu(Hero hero1, Hero hero2){
        hero2.setHp(hero2.getHp() - hero1.getAttack() + hero2.getDefense());

        if (hero2.getHp() < 0) {
            hero2.setHp(0);
        }

        System.out.println(hero1.getName() + " menyerang " + hero2.getName()+ "\n");
        System.out.println(hero1.getName() + " menyerang sebesar " + hero1.getAttack());
        System.out.println(hero2.getName() + " memiliki pertahanan sebesar " + hero2.getDefense());
        System.out.println("Health " + hero2.getName() + " saat ini " + hero2.getHp() + "\n============================================\n"+"============================================");
    }
    
    public void seranganDua(Hero hero2, Hero hero1){
        hero1.setHp(hero1.getHp() - hero2.getAttack() + hero1.getDefense() );

        if (hero1.getHp() < 0) {
            hero1.setHp(0);
        }

        System.out.println(hero2.getName() + " menyerang " + hero1.getName()+ "\n");
        System.out.println(hero2.getName() + " menyerang sebesar " + hero2.getAttack());
        System.out.println(hero1.getName() + " memiliki pertahanan sebesar " + hero1.getDefense());
        System.out.println("Health " + hero1.getName() + " saat ini " + hero1.getHp() + "\n");
    
    }
}
    