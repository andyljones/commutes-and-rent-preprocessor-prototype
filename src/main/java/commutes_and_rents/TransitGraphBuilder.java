package commutes_and_rents;

import java.util.HashMap;
import java.util.List;

import uk.org.transxchange.AbstractVehicleJourneyStructure;
import uk.org.transxchange.TransXChange;

public class TransitGraphBuilder 
{    
    private static HashMap<TransitLink, List<String>> getLinkTraversalTimes(TransXChange timetableRoot)
    {
        HashMap<TransitLink, List<String>> traversalTimes = new HashMap<TransitLink, List<String>>();
        
        List<AbstractVehicleJourneyStructure> journies = 
                timetableRoot.getVehicleJourneys().getVehicleJourneyAndFlexibleVehicleJourney();
        
        //TODO: Finish implementing this.
        return null;
    }
}
