//Inheritance
// Creating a class Animal and making a derived class dog out of it
class Animal{
    int number_of_legs;
    int types;

    public void setNumber_of_legs(int number_of_legs) {
        this.number_of_legs = number_of_legs;
    }

    public int getNumber_of_legs() {
        return number_of_legs;
    }

    public void setTypes(int types) {
        this.types = types;
    }

    public int getTypes() {
        return types;
    }
}

//Here dog is an derived class and animal is a super class.
// We can't access the properties or arguments of dogs if we make an object of animal
class dog extends Animal{
    String Breed_name;
    String color;

    public void setBreed_name(String breed_name) {
        Breed_name = breed_name;
    }

    public String getBreed_name() {
        return Breed_name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    void display(){
        System.out.println("Number of legs of dog is "+number_of_legs+" and bread name is "+Breed_name+" ,color is "+color+" and there are "+types+" types of this bread availaible");
    }
}

public class Java_17 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.number_of_legs = 2;
        a1.types= 10;
        dog d1 = new dog();
        d1.number_of_legs  = 4;
        d1.Breed_name = "Pug";
        d1.color = "Black";
        d1.types =  3;
        d1.display();

    }
}