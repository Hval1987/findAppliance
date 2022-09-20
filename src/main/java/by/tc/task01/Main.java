package by.tc.task01;

import by.tc.task01.dao.impl.LaptopDAOImpl;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        LaptopDAOImpl laptop=new LaptopDAOImpl();
        laptop.findAll();
    }
}
