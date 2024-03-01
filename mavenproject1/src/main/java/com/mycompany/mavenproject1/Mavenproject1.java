
package com.mycompany.mavenproject1;


public class Mavenproject1 {

    public static void main(String[] args) {
        Character Homero = new Character("Homero", "Inspector de seguridad", 33 , "douuuuuuuu");
        Homero.greeting();
        System.out.println(Homero.age);
        
        Character bart = new Character("bartolomeo", "vago", 10, "Ay caramba");
        bart.greeting();
    }
    
    static class Character {
        String name;
        String occupation;
        int age;
        String phrase;
        
        Character(String name, String job, int age, String phrase){
            this.name = name;
            this.occupation = occupation;
            this.age = age;
            this.phrase = phrase;
           
            
        }
        void greeting(){
            System.out.println(this.phrase);
        }
    }
}
