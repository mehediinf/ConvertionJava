public class ConvertionJava {
    public static void main(String[] args) {
        System.out.println("\n");


   /*      
        int intValue1 = 45;

        double doubleValue = intValue1;

        System.out.println(doubleValue);

        double double1 = 45.45;

        int intValue = (int) double1;
        System.out.println(intValue);

        String stringCon = String.valueOf(intValue);
        System.out.println(stringCon);

        String string = Double.toString(double1);
        System.out.println(string);

        String string2 = String.format("%d", intValue);
        System.out.println(string2);


        String str = "22210";

        double doubleS = Double.parseDouble(str);
        System.out.println(doubleS);

        int intS = Integer.parseInt(str);

        System.out.println(intS);

        String binary = "1010";

        int binaryToDecimal = Integer.parseInt(binary,2);
        System.out.println(binaryToDecimal);

        int decimal =  4546;

        String decimalToBinary = Integer.toBinaryString(decimal);
        System.out.println(decimalToBinary);

        int BTdecimal = Integer.parseInt(decimalToBinary,2);
        System.out.println(BTdecimal);

*/




//Upcasting Code
//Animal animal = new Dog();

//animal.makeSound();

//Downcasting code

Animal animal = new Dog();

Dog dog = (Dog) animal;

dog.bark();
dog.makeSound();

System.out.println("\n");
    }
}


//Object Type Conversion
//Upcasting And Downcasting

class Animal{
    public void makeSound(){
        System.out.println("Animal makes a Sound");
    }
}
class Dog extends Animal {
    public void bark(){    
        System.out.println("Dog Bark ...... ");
    }
}



