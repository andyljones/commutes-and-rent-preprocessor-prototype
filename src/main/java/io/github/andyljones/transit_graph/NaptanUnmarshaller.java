package io.github.andyljones.transit_graph;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import uk.org.naptan.NaPTAN;

public class NaptanUnmarshaller {

    public static NaPTAN unmarshall(File file)
    {
        Unmarshaller unmarshaller = createNaptanXMLUnmarshaller();
        NaPTAN root = getRootElement(unmarshaller, file);
        
        return root;
    }
    
    private static NaPTAN getRootElement(Unmarshaller unmarshaller, File file)
    {
        NaPTAN root;
        try
        {
            root = (NaPTAN) unmarshaller.unmarshal(file);
        }
        catch (JAXBException jaxbe)
        {
            jaxbe.printStackTrace();
            throw new Error("Unmarshalling the file failed!");
        }
        
        return root;
    }
    
    private static Unmarshaller createNaptanXMLUnmarshaller()
    {
        ClassLoader classLoader = uk.org.naptan.ObjectFactory.class.getClassLoader();

        Unmarshaller unmarshaller;
        try
        {
            JAXBContext context = JAXBContext.newInstance("uk.org.naptan", classLoader);
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
