package commutes_and_rents;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import uk.org.transxchange.TransXChange;

public class TimetableUnmarshaller 
{
    /**
     * Unmarshalls a TransXChange transit timetable.
     * 
     * @param file XML TransXChange timetable to be processed
     * @return Root element of the timetable.
     */
    public static TransXChange unmarshall(File file)
    {
        Unmarshaller unmarshaller = createTransXChangeXMLUnmarshaller();
        TransXChange root = getRootElement(unmarshaller, file);
        
        return root;
    }
    
    private static TransXChange getRootElement(Unmarshaller unmarshaller, File file)
    {
        TransXChange root;
        try
        {
            root = (TransXChange) unmarshaller.unmarshal(file);
        }
        catch (JAXBException jaxbe)
        {
            jaxbe.printStackTrace();
            throw new Error("Unmarshalling the file failed!");
        }
        
        return root;
    }
    
    private static Unmarshaller createTransXChangeXMLUnmarshaller()
    {
        ClassLoader classLoader = uk.org.transxchange.ObjectFactory.class.getClassLoader();

        Unmarshaller unmarshaller;
        try
        {
            JAXBContext context = JAXBContext.newInstance("uk.org.transxchange", classLoader);
            unmarshaller = context.createUnmarshaller();
        }
        catch (JAXBException jaxbe)
        {
            jaxbe.printStackTrace();
            throw new Error("Creating the unmarshaller failed!");
        }
        
        return unmarshaller;
    }
}