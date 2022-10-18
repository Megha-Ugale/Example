class Animal{
    void eat(){
        System.out.println("I am omnivorous!");
    }
}
class Mammal extends Animal{
    void nature(){
        System.out.println("I am Mammal");
    }
}
class Dog extends Mammal{
    void sound(){
        System.out.println("I Bark!");
    }
}
public class Inheritance {
    public static void main(String args[]){
        Dog d = new Dog();
        d.eat();
        d.nature();
        d.sound();
    }
}
