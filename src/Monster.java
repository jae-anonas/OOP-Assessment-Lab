/**
 * Created by drewmahrt on 4/27/16.
 */
public abstract class Monster {
    //TODO: Give the Monster health and damage properties, and create a constructor
    //Health and damage should be private member variables, so remember to add the correct methods required to access private variables

    private int mHealth;
    private int mDamage;

    public Monster(){
        mHealth = 100;
        mDamage = 5;
    }

    public Monster(int health, int mDamage){
        mHealth = health;
        mDamage = mDamage;
    }

    public abstract String aboutMe();

    public int getHealth() {
        return mHealth;
    }

    public void setHealth(int mHealth) {
        this.mHealth = mHealth;
    }

    public int getDamage() {
        return mDamage;
    }

    public void setDamage(int mDamage) {
        this.mDamage = mDamage;
    }
}
