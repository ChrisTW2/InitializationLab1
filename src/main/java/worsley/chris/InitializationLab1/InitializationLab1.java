package worsley.chris.InitializationLab1;

import javax.print.attribute.standard.MediaSize;
import java.awt.*;
import java.nio.channels.Pipe;

/**
 * Created by christopherworsley on 9/11/16.
 */
public class InitializationLab1 {
    public static void main(String[] args) {
        BoringThing reading = new BoringThing();
        BoringThing ChargingYourPhone = new BoringThing();
        BoringThing TyingYourShoes = new BoringThing();
        BoringThing Cleaning = new BoringThing();
        BoringThing Studing = new BoringThing();

        ColorfulThing Blue = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing BabyBlue = new ColorfulThing(ColorfulThing.Color.BLACK);
        ColorfulThing NavyBlue = new ColorfulThing(ColorfulThing.Color.GREY);
        ColorfulThing RoyalBlue = new ColorfulThing(ColorfulThing.Color.WHITE);
        ColorfulThing PureWhite = new ColorfulThing(ColorfulThing.Color.SILVER);

        Blue.PrintColor();
        BabyBlue.PrintColor();
        NavyBlue.PrintColor();
        RoyalBlue.PrintColor();
        PureWhite.PrintColor();
    }
}
