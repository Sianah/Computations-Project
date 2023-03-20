import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);


        // TODO: F to C conversion
        //  Ask user for temp in F. Read it in. Convert to C. Display output.
        System.out.println("Let's convert temperature!");
        System.out.print("What's the temperature in Fahrenheit? ");
        String buffer = reader.nextLine();
        double tempF = Double.parseDouble(buffer);
        double tempC = (tempF - 32.0) * (5.0/9);
        System.out.println("Temperature is " + tempC + " Celcius");
        // TODO: compute height of building
        //  Assume 20ft away. Ask how tall. Ask for angle of elevation.
        //  Compute height of building using Math.tan(). Display output.
        System.out.println("Let's roughly compute the height of a building.");
        System.out.println("Assume you are standing 20ft away.");
        System.out.print("How tall are you (ft)? ");
        String build = reader.nextLine();
        double heightP = Double.parseDouble(build);
        System.out.print("What is the angle of elevation you'd like to use? ");
        String angleE = reader.nextLine();
        double angle = Double.parseDouble(angleE);
        double radians = Math.toRadians(angle);
        double heightB = (20.0) * (Math.tan(radians));
        double heightJ = heightB + heightP;
        System.out.println("The height of the building is " + heightJ + " Ft");


        // TODO: compute probability of coveted loot.
        //  Ask for drop rate as percentage. Convert to fraction (divide by 100).
        //  Ask how many runs. Compute probability w/ formula provided.
        System.out.println("Let's compute probability of dropped loot.");
        System.out.print("What is the drop rate (%) of the loot you want? ");
        Integer percentage = reader.nextInt();
        double fraction = percentage/100.0;
        System.out.print("How many runs do you plan to play? ");
        Integer run = reader.nextInt();
        double probability = 1 - (Math.pow((1-fraction),run));
        System.out.println("The probability of receiving the coveted loot is " + probability);





    }
}
