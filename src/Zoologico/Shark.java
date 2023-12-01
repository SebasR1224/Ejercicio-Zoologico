/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author User
 */
public class Shark extends CarnivorousAnimal {
   private int maxDeep;
   
    //Constructor
    public Shark(int code, String name, int age, String habitat, float weight, int aggressivenessLevel, int maxDeep) {
        super(code, name, age, habitat, weight, aggressivenessLevel);
        this.maxDeep = maxDeep;
    }
   
    //Getters and Setters
    public int getMaxDeep() {
        return maxDeep;
    }

    public void setMaxDeep(int maxDeep) {
        this.maxDeep = maxDeep;
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
            ", maxDeep=" + maxDeep +
            '}';
    }
}
