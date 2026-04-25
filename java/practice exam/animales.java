class animales {

     void  makeSound() {
         System.out.println("Animal makes a sound");
     }
}

class Dog extends animales {// Dog class inherits from animales class{
        void makeSound() {
            System.out.println("Dog barks");// Override the makeSound method 
        }
    }