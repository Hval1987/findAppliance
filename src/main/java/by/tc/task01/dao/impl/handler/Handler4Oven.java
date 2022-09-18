package by.tc.task01.dao.impl.handler;

import by.tc.task01.dao.Parametr;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;


public class Handler4Oven extends DefaultHandler {
    ArrayList<Appliance> list = new ArrayList<by.tc.task01.entity.Appliance>();
    Oven ovn;
    StringBuilder text = new StringBuilder();

    @Override
    public void startDocument() throws SAXException {
        System.out.println("start document");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("uri->" + uri + "  localName->" + localName + "  qName->" + qName);
        if (qName.equals("Oven")) {
            ovn = new Oven();
            ovn.setId(Integer.parseInt(attributes.getValue("id")));

        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        text.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        String value = text.toString();

        switch (Parametr.valueOf(qName.replace("-",""))) {
            case POWERCONSUMPTION:
                ovn.setPowerConsumption(Integer.parseInt(value));
                break;
            case WEIGHT:
                ovn.setWeight(Integer.parseInt(value));
                break;
            case CAPACITY:
                ovn.setCapasity(Integer.parseInt(value));
                break;
            case DEPTH:
                ovn.setDept(Integer.parseInt(value));
                break;
            case WIDTH:
                ovn.setWidth(Integer.parseInt(value));
                break;
            case HEIGHT:
                ovn.setHeight(Integer.parseInt(value));

                break;
            case OVEN:
                list.add(ovn);
                ovn = null;
                break;
        }
    }
    public List<Appliance> getOvenList(){
        return list;
    }
}
