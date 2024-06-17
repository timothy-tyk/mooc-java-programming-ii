package FlightControl;

import FlightControl.service.FlightControl;
import FlightControl.ui.TextUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl fc = new FlightControl();
        TextUI ui = new TextUI(fc, new Scanner(System.in));
        ui.start();
         
    }
}
