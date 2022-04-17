package com.company;

public abstract class Hero {
    private int HeroHealth;
    private int HeroDamage;
    private String Magic;

    public int getHeroHealth() {
        return HeroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        HeroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        HeroDamage = heroDamage;
    }

    public String getMagic() {
        return Magic;
    }

    public void setMagic(String magic) {
        Magic = magic;
    }

    public abstract void MAKEtea();

}
