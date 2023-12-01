/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        
        animals[0] = new Giraffe(101, "Nasha", 10, "Sabana", 800f, "Hierbas", 220f);
        animals[1] = new Elephant(102, "Kuzco", 5, "Selva", 3000f, "Hierbas", 2000);
        animals[2] = new Puma(103, "Anthonyi", 15, "Desierto", 53f, 8, 80f);
        animals[3] = new Shark(104, "Carcharhinus longimanus", 27, "Océano", 1100f, 10, 900);

        for (Animal animal : animals) {
            System.out.println(animal.showData()); 
        }
    }
}
