/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author User
 */
public abstract class HerbivorousAnimal extends Animal {
    private String feedingType;

    //Constructor
    public HerbivorousAnimal(int code, String name, int age, String habitat, float weight, String feedingType) {
        super(code, name, age, habitat, weight);
        this.feedingType = feedingType;
    }
    
    //Getters and Setters
    public String getFeedingType() {
        return feedingType;
    }

    public void setFeedingType(String feedingType) {
        this.feedingType = feedingType;
    }
    
    //Class Methods
    @Override
    public abstract String showData();   
}
