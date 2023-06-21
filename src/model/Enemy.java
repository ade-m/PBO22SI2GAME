package model;

public abstract class Enemy { //superclass
    private String nama;
    private int hp;
    private int attackPoin;

    public Enemy() {
    }

    public Enemy(String nama, int hp, int attackPoin) {
        this.nama = nama;
        this.hp = hp;
        this.attackPoin = attackPoin;
    }
    public abstract void serang();
    public void attack(){
        System.out.println("Serang!!!");
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPoin() {
        return this.attackPoin;
    }

    public void setAttackPoin(int attackPoin) {
        this.attackPoin = attackPoin;
    }

}
