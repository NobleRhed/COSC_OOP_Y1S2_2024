import org.dc.anijava.Animal;
import org.dc.anijava.raven;
import org.dc.anijava.rabbit;
import org.dc.anijava.fox;
import org.dc.anijava.gecko;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Sending "numberOfLegs" values to classes
        //This would use default values if no value inserted
        Animal ravenDefaulting = new raven();
        //This sends the value to  "*WithLegs"
        Animal ravenWithLegs = new raven(2);
        Animal rabbitWithLegs = new rabbit(4);
        Animal foxWithLegs = new fox(4);
        Animal geckoWithLegs = new gecko(4);

        //implements the "canRun" method
        ravenWithLegs.canRun();
        rabbitWithLegs.canRun();
        foxWithLegs.canRun();
        geckoWithLegs.canRun();
    }
}