package Ravikumar.Sujatha.InitializationLab2;

/**
 * Created by sujatharavikumar on 9/10/16.
 */

public class InitializationLab2 {

    public static void main(String args[]){
        ThingContainer container1 = new ThingContainer(3);
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing2 = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing colorfulThing3 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing colorfulThing4 = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing colorfulThing5 = new ColorfulThing(ColorfulThing.Color.BLUE);


        container1.add(colorfulThing1);
        container1.add(colorfulThing2);
        container1.add(colorfulThing3);
        //container1.add(colorfulThing4);
        container1.printThings();

        System.out.println("Popping the last element.....");
        ColorfulThing poppedColor = container1.pop();
        System.out.println("Color popped: " +poppedColor);

        System.out.println("---------------------------------------------------------");
        container1.printThings();
        System.out.println("---------------------------------------------------------");

        ColorfulThing removeThing = container1.remove(colorfulThing5);
        System.out.println("Color removed : " +removeThing);
        System.out.println("---------------------------------------------------------");
        container1.printThings();
        System.out.println("---------------------------------------------------------");

        ColorfulThing removeThing1 = container1.remove(colorfulThing2);
        System.out.println("Color removed : " +removeThing1);
        System.out.println("---------------------------------------------------------");
        container1.printThings();
        System.out.println("---------------------------------------------------------");

        //ColorfulThing colorfulThing4 = new ColorfulThing(ColorfulThing.Color.GREEN);
        System.out.println("Adding RED....");
        container1.add(colorfulThing4);
        container1.printThings();
        System.out.println("---------------------------------------------------------");

        ColorfulThing colorfulThing6 = new ColorfulThing(ColorfulThing.Color.RED);
        System.out.println("Adding another RED.....");
        container1.add(colorfulThing6);
        container1.printThings();
        System.out.println("---------------------------------------------------------");

        ColorfulThing.Color removedColor= container1.remove(ColorfulThing.Color.RED);
        System.out.println("Color removed:" +removedColor);

        /*ColorfulThing removeThing = container1.remove(colorfulThing5);
        System.out.println("Color removed : " +removeThing);*/

        container1.printThings();
        System.out.println("---------------------------------------------------------");
        System.out.println("Adding GREEN....");
        container1.add(colorfulThing3);
        container1.printThings();



    }

}
