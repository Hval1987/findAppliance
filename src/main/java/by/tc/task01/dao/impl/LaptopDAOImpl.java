package by.tc.task01.dao.impl;

import by.tc.task01.dao.LaptopDAO;
import by.tc.task01.dao.impl.handler.Handler4Laptop;
import by.tc.task01.entity.Laptop;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

public class LaptopDAOImpl implements LaptopDAO {
    private static final String source = "  ";

    SAXParserFactory factory = SAXParserFactory.newInstance();
    SAXParser parser = factory.newSAXParser();
    XMLReader reader = parser.getXMLReader();
    Handler4Laptop handler = new Handler4Laptop();

    public LaptopDAOImpl() throws ParserConfigurationException, SAXException {
    }

    @Override
    public List<Laptop> findAll() throws IOException, SAXException {
        reader.parse(source);
        List<Laptop> list = handler.getLaptopList();

        return list;
    }
}
