package foo;

import java.io.File;
import java.net.URL;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import uk.org.naptan.NaPTAN;

public class App 
{    
    public static void parse() 
            throws Exception
    {
        JAXBContext jc = JAXBContext.newInstance("uk.org.naptan");
        
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        File file = new File("src/main/resources/underground-naptan.xml");
        
        NaPTAN naptan = (NaPTAN)unmarshaller.unmarshal(file);
        
        System.out.println(naptan.getFileName());
    }
}
