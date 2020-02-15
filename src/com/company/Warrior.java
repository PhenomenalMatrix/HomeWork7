package com.company;

public class Warrior extends Player implements SpecialAttack {

    @Override
    public String specialAttack() {
        return "used Special Attack";
    }
}
