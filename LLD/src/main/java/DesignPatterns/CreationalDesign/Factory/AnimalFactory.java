package DesignPatterns.CreationalDesign.Factory;

public class AnimalFactory {

    Animal animal ;

    AnimalFactory(Animal animal){

        this.animal= animal ;
    }

    public void getAnimal(){

        this.animal.eat();
    }
//    public static Animal getAnimal(AnimalType type){
//
//        if(type == AnimalType.CAT){
//             return new Cat();
//        }else if(type==AnimalType.DOG){
//            return new Dog();
//        }else if(type==AnimalType.TIGER){
//            return new Tiger();
//        }else if(type==AnimalType.LION){
//            return new Lion();
//        }
//        return null ;
//    }
}
