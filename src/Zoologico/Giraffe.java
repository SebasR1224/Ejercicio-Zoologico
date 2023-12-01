/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author User
 */
public class Giraffe extends HerbivorousAnimal {
    private float neckLength;
    
    //Constructor
    public Giraffe(int code, String name, int age, String habitat, float weight, String feedingType, float neckLength) {
        super(code, name, age, habitat, weight, feedingType);
        this.neckLength = neckLength;
    }
    
    //Getters and Setters
    public double getNeckLength() {
        return neckLength;
    }

    public void setNeckLength(float neckLength) {
        this.neckLength = neckLength;
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
            ", feedingType=" + getFeedingType() +
            ", neckLength=" + neckLength +
            '}';
    }
}
