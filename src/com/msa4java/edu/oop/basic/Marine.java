package com.msa4java.edu.oop.basic;

public class Marine {
    // 캡슐화 (private를 외부에서 함부로 변경못함)
    private int hp;     // 체력
    private int damage; // 손실
    private int armor;  // 방어력

    // 생성자 overloading
    public Marine() {
        this(40, 6, 0);     // this메소드는 생성자 내부에서만 사용
    }
    public Marine(int hp) {
        this(hp, 6, 0);
    }
    public Marine(int hp, int damage, int armor) {
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
    }

    // getter (외부에서 그 값을 읽기 위해)
    public int getHp() {
        return this.hp;
    }
    public int getDamage() {
        return this.damage;
    }
    public int getArmor() {
        return this.armor;
    }

    // setter (내가 제공한 setter로만 수정)
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setDamage(int hp) {
        this.damage = damage;
    }
    public void setArmor(int hp) {
        this.armor = armor;
    }
}