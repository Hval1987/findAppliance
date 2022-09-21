package by.tc.task01.dao.impl;

import by.tc.task01.dao.impl.handler.SAXParser;
import by.tc.task01.entity.Appliance;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class LaptopDAOImpl extends Appliance {
    private static final String source = "D:\\Java course\\findAppliance\\findAppliance\\src\\main\\resources\\applianced.xml";
    File file=new File(source);



    SAXParserFactory factory = SAXParserFactory.newInstance();
    javax.xml.parsers.SAXParser parser = factory.newSAXParser();
    XMLReader reader = parser.getXMLReader();
    SAXParser handler = new SAXParser();


    public LaptopDAOImpl() throws ParserConfigurationException, SAXException {
    }


    public List<Appliance> findAll() throws IOException, SAXException {
reader.setContentHandler(handler);
        reader.parse(new InputSource(source));
        List<Appliance> list = handler.getOvenList();

        System.out.println(list);
        return list;

    }
}
