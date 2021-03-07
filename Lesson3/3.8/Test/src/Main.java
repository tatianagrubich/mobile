import com.skillbox.airport.Airport;
import com.skillbox.airport.Terminal;
import com.skillbox.airport.Aircraft;

import javax.lang.model.type.NullType;
import java.util.ArrayList;

public class Main
{
    public  static void main(String[] args)
    {
        ArrayList<Airport> airports = new ArrayList<Airport>();
            airports.add(Airport.getInstance());
            airports.add(Airport.getInstance());
            airports.add(Airport.getInstance());
            airports.add(Airport.getInstance());
            System.out.println("Количество аэропортов =  " + airports.size());


    }
}
