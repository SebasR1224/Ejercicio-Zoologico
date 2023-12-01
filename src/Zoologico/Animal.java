/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author User
 */
public abstract class Animal {
    private int code;
    private String name;
    private int age;
    private String habitat;
    private float weight;

    //Constructor
    public Animal(int code, String name, int age, String habitat, float weight) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        this.weight = weight;
    }
    
    //Getters and Setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    //Class Methods
    public abstract String showData();      
}


