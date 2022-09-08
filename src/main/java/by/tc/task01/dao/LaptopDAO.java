package by.tc.task01.dao;

import by.tc.task01.entity.Laptop;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.List;

public interface LaptopDAO {
    List<Laptop> findAll() throws IOException, SAXException;
}
