package by.tc.task01.dao.impl;

import by.tc.task01.dao.impl.handler.Handler4Laptop;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class LaptopDAOImpl extends Appliance {
    private static final String source = "D:\\Java course\\findAppliance\\findAppliance\\src\\main\\resources\\applianced.xml";
    File file=new File(source);



    SAXParserFactory factory = SAXParserFactory.newInstance();
    SAXParser parser = factory.newSAXParser();
    XMLReader reader = parser.getXMLReader();
    Handler4Laptop handler = new Handler4Laptop();

    public LaptopDAOImpl() throws ParserConfigurationException, SAXException {
    }


    public List<Laptop> findAll() throws IOException, SAXException {

        reader.parse(source);
        List<Laptop> list = handler.getLaptopList();

        System.out.println(list);
        return list;

    }
}
