/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author User
 */
public class Elephant extends HerbivorousAnimal {
    private double fangsPrice;
    
    //Constructor
    public Elephant(int code, String name, int age, String habitat, float weight, String feedingType, double fangsPrice) {
        super(code, name, age, habitat, weight, feedingType);
        this.fangsPrice = fangsPrice;
    }
    
    //Getters and Setters
    public double getFangsPrice() {
        return fangsPrice;
    }

    public void setFangsPrice(double fangsPrice) {
        this.fangsPrice = fangsPrice;
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
            "feedingType=" + getFeedingType() +
            "fangsPrice=" + fangsPrice +
            '}';
    }
}
