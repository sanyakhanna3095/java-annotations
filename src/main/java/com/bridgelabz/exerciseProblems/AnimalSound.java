package com.bridgelabz.exerciseProblems;

public class AnimalSound {
    static class Animal{
        public void makeSound() {
            System.out.println("Animals make different sounds");
        }
    }
    static class Dog extends Animal {
        @Override
        public void makeSound(){
            System.out.println("Dog barks");
        }
    }


    public static void main(String[] args) {
        Animal d= new Dog();
        d.makeSound();
    }
}

