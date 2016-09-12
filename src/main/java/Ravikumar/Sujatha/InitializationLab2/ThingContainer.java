package Ravikumar.Sujatha.InitializationLab2;

import java.util.Arrays;

/**
 * Created by sujatharavikumar on 9/10/16.
 */
public class ThingContainer {

    ColorfulThing [] colorfulThings;

    int numberOfEntries;


    public ThingContainer(int size){
        colorfulThings = new ColorfulThing[size];
        numberOfEntries = 0;
    }

    @Override
    public String toString() {
        return "ThingContainer{" +
                "colorfulThings=" + Arrays.toString(colorfulThings) +
                '}';
    }

    public ColorfulThing[] getColorfulThings() {
        return colorfulThings;
    }

    public void add(ColorfulThing coloredThing) {
        int arrayIndex = 0;
        while(arrayIndex < colorfulThings.length) {
            if (colorfulThings[arrayIndex] == null) {
                colorfulThings[arrayIndex] = coloredThing;
                break;
            }
            arrayIndex++;
            numberOfEntries++;
        }
        if (arrayIndex == colorfulThings.length){
            System.out.println("Sorry, The array is FULL");
        }

    }


    public ColorfulThing pop(){
        ColorfulThing poppedElement = null;
        for (int index = colorfulThings.length-1; index>=0; index--){
            if (colorfulThings[index] != null){
                poppedElement = colorfulThings[index];
                colorfulThings[index] = null;
                break;
            }
        }
        return poppedElement;
    }


    public void adjustArray(){
        for (int i=0; i< colorfulThings.length-1; i++){
            if (colorfulThings[i] == null){
                colorfulThings[i] = colorfulThings[i+1];
                colorfulThings[i+1] = null;
            }
        }
    }



    public ColorfulThing.Color remove(ColorfulThing.Color colorToRemove){

        ColorfulThing.Color poppedColor = null;
        for (int arrayIndex=0; arrayIndex<colorfulThings.length; arrayIndex++){
            if (colorToRemove.equals(colorfulThings[arrayIndex].getColor())){
                poppedColor = colorToRemove;
                colorfulThings[arrayIndex] = null;
                adjustArray();
                return poppedColor;
            }

        }
        return null;
    }



    public ColorfulThing remove(ColorfulThing thing) {
        ColorfulThing removeColor = null;
        for (int i = 0; i < colorfulThings.length; i++) {
            if (colorfulThings[i].toString().equals(thing.toString())){
                removeColor = thing;
                colorfulThings[i] = null;
                break;
            }
        }
        adjustArray();
        return removeColor;
    }



    public void printThings(){
        for (int i=0; i<colorfulThings.length; i++) {
            if (colorfulThings[i] != null) {
                System.out.println(colorfulThings[i].toString());
            }
        }

    }
}
