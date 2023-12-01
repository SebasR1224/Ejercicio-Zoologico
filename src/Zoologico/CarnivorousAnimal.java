/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author User
 */
public abstract class CarnivorousAnimal extends Animal {
    private int aggressivenessLevel;
   
    //Constructor
    public CarnivorousAnimal(int code, String name, int age, String habitat, float weight, int aggressivenessLevel) {
        super(code, name, age, habitat, weight);
        this.aggressivenessLevel = aggressivenessLevel;
    }
    
    //Getters and Setters
    public int getAggressivenessLevel() {
        return aggressivenessLevel;
    }

    public void setAggressivenessLevel(int aggressivenessLevel) {
        this.aggressivenessLevel = aggressivenessLevel;
    }
   
    //Class Methods
    @Override
    public abstract String showData();  
}
