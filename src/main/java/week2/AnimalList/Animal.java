package week2.AnimalList;

public class Animal {
    private String name;

    Animal(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return name;
    }

    //test
}