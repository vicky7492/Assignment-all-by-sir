import java.util.*;
abstract class Compartment {
    public abstract String details();

}
class FirstClass extends Compartment {
    public String details() {
        return "First Tier.";
    }


}
class General extends Compartment{
    public String details() {
        return "General Tier.";
    }

}
class Ladies extends Compartment{
    public String details() {
        return "ladies Compartment.";

    }

}
class Luggage extends Compartment{
    public String details() {
        return "Luggage Only";
    }

}

class Test_Compartment {
    public static void main(String args[]) {
        Compartment[] obj = new Compartment[10];
        Random obj1 = new Random();

            int objNum = obj1.nextInt(4);

            if (objNum == 0){
                obj[1] = new Luggage();
                System.out.println(obj[1].details());}
            else if(objNum == 1){
                obj[2] = new General();
                System.out.println(obj[2].details());}
            else if(objNum == 2){
                obj[3] = new Ladies();
                System.out.println(obj[3].details());}
            else{
                obj[4] = new FirstClass();
                System.out.println(obj[4].details());}
    }
}
