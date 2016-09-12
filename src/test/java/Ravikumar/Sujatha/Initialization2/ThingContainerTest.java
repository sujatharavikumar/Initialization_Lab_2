package Ravikumar.Sujatha.Initialization2;

import Ravikumar.Sujatha.InitializationLab2.ColorfulThing;
import Ravikumar.Sujatha.InitializationLab2.ThingContainer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sujatharavikumar on 9/11/16.
 */
public class ThingContainerTest {

    @Test
    public void addTest(){

        ThingContainer container = new ThingContainer(1);
        ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.Color.BLUE);
        container.add(colorfulThing);

        ColorfulThing expectedOutput = colorfulThing;
        ColorfulThing actualOutput = container.getColorfulThings()[0];

        Assert.assertEquals("Both the values should be BLUE", expectedOutput, actualOutput);

    }


    @Test
    public void popTest(){

        ThingContainer container = new ThingContainer(1);
        ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.Color.BLUE);
        container.add(colorfulThing);

        ColorfulThing expectedOutput = colorfulThing;
        ColorfulThing actualOutput = container.pop();

        Assert.assertEquals("BLUE should have been popped out", expectedOutput, actualOutput);
    }


    @Test
    public void removeColorTest(){

        ThingContainer container = new ThingContainer(2);
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing2 = new ColorfulThing(ColorfulThing.Color.GREEN);

        container.add(colorfulThing1);
        container.add(colorfulThing2);

        ColorfulThing.Color expectedOutput = ColorfulThing.Color.BLUE;
        ColorfulThing.Color actualOutput = container.remove(ColorfulThing.Color.BLUE);

        Assert.assertEquals("BLUE should have been removed", expectedOutput, actualOutput);

    }

    @Test
    public void removeColorfulThingTest(){

        ThingContainer container = new ThingContainer(2);
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing2 = new ColorfulThing(ColorfulThing.Color.GREEN);

        container.add(colorfulThing1);
        container.add(colorfulThing2);

        ColorfulThing expectedOutput = colorfulThing2;
        ColorfulThing actualOutput = container.remove(colorfulThing2);
        Assert.assertEquals("GREEN should have been removed", expectedOutput, actualOutput);

    }


    @Test
    public void fullArrayTest(){

        ThingContainer container = new ThingContainer(2);
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing2 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing colorfulThing3 = new ColorfulThing(ColorfulThing.Color.RED);

        container.add(colorfulThing1);
        container.add(colorfulThing2);
        container.add(colorfulThing3);

        Assert.assertTrue(container.getColorfulThings().length == 2);

    }

}
