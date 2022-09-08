package by.tc.task01.dao.impl;

import by.tc.task01.dao.OvenDAO;
import by.tc.task01.dao.impl.handler.Handler4Oven;
import by.tc.task01.entity.Oven;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

public class OvenDAOImpl implements OvenDAO {
	public static final String source="";
	SAXParserFactory factory=SAXParserFactory.newInstance();
	SAXParser parser=factory.newSAXParser();
	XMLReader reader=parser.getXMLReader();

	Handler4Oven handler=new Handler4Oven();


	public OvenDAOImpl() throws ParserConfigurationException, SAXException {
	}

	@Override
	public List<Oven> findAll() throws IOException, SAXException {
		reader.setContentHandler(handler);
		reader.parse(source);
		List<Oven> list=handler.getOvenList();

		return list;
	}


}


