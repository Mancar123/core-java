package com.xworkz.manojtask1.internal;

public class mutant {
    private String name="Manoj";
    private int age=21;
    private String ability="Regeneration";
    private boolean isEvolved=true;
    private double powerLevel=95.5;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setAbility(String ability) {
        this.ability = ability;
    }

    void setEvolved(boolean isEvolved) {
        this.isEvolved = isEvolved;
    }

    void setPowerLevel(double powerLevel) {
        this.powerLevel = powerLevel;
    }
   public void getName() {
        System.out.println(name);

    }

    public void getAge() {
        System.out.println(age);

    }

    public void getAbility() {
        System.out.println(ability);

    }

    public void getEvolved() {
        System.out.println(isEvolved);

    }

    public void getPowerLevel() {
        System.out.println(powerLevel);

    }
}

