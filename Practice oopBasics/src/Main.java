import org.dc.anijava.oopbasic.Animal;
import org.dc.anijava.oopbasic.raven;
import org.dc.anijava.oopbasic.rabbit;
import org.dc.anijava.oopbasic.fox;
import org.dc.anijava.oopbasic.gecko;


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