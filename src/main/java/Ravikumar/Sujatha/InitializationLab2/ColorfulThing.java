package Ravikumar.Sujatha.InitializationLab2;

/**
 * Created by sujatharavikumar on 9/10/16.
 */
public class ColorfulThing {
    public enum Color{RED, BLUE, GREEN}

    Color color;


    public ColorfulThing(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }



    @Override
    public String toString() {
        return "ColorfulThing{" +
                "color=" + color +
                '}';
    }
}



