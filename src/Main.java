import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
   Animal [] animals = {
           new Shark("Bull Shark"),
           new Shark("Tiger Shark"),
           new Shark("Blue Shark"),

           new Eagle("Golden Eagle"),
           new Eagle("Bald Eagle"),
           new Eagle("Harpy Eagle"),

           new Turtle("Painted Turtle"),
           new Turtle("Snapping turtle"),
           new Turtle("Greek turtle")
   };
        for (Animal animal : animals) {
            if(animal.getClass().equals(Shark.class))((Shark) animal).attack();
            else if(animal.getClass().equals(Turtle.class))((Turtle) animal).swim();
            else if (animal.getClass().equals(Eagle.class))((Eagle) animal).fly();
            System.out.println(animal);

        }
        Shark [] sharks = new Shark[3];
        Turtle [] turtles = new Turtle[3];
        Eagle [] eagles = new Eagle[3];
        int shark = 0;
        int turtle = 0;
        int eagle =0;
        for (Animal animal : animals) {
            if(animal instanceof Shark){
                sharks[shark]= (Shark) animal;
                shark++;
            } else if (animal instanceof Turtle) {
                turtles[turtle]= (Turtle) animal;
                turtle++;
            } else if (animal instanceof Eagle) {
                eagles[eagle]= (Eagle) animal;
                eagle++;
            }
        }
        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eagles));

    }
}