package com.company;

/**
 * Created by Jason on 21/03/17.
 */
abstract public class Character {
    WeaponBehaviour weaponBehaviour;

    abstract public void fight();

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
