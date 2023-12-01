/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author User
 */
public class Puma extends CarnivorousAnimal {
    public float maxSpeed;
    
    //Constructor
    public Puma(int code, String name, int age, String habitat, float weight, int aggressivenessLevel, float maxSpeed) {
        super(code, name, age, habitat, weight, aggressivenessLevel);
        this.maxSpeed = maxSpeed;
    }
    
    //Getters and Setters
    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    //Class Methods
    @Override
    public String showData() {
    return "Animal{" +
            "code=" + getCode() +
            ", name=" + getName() +
            ", age=" + getAge() +
            ", habitat=" + getHabitat() +
            ", weight=" + getWeight() +
            ", aggressivenessLevel=" + getAggressivenessLevel() +
            ", maxSpeed=" + maxSpeed +
            '}';
    }
}
