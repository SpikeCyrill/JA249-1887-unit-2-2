package ru.batllefield.units;

public abstract class AbstractHuman extends AbstractArmyUnit{

    private short health;
    private short armor;

    protected AbstractHuman(short health, short armor) {
        this.armor = armor;
        this.health = health;
    }

    public short getHealth() {
        return health;
    }

    public void setHealth(short health) {
        this.health = health;
    }

    public short getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return "AbstractHuman{" +
                "health=" + health +
                ", armor=" + armor +
                '}';
    }
}
