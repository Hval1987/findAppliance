package by.tc.task01.dao;

import by.tc.task01.entity.Oven;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.List;

public interface OvenDAO {

	List<Oven> findAll() throws IOException, SAXException;
}
