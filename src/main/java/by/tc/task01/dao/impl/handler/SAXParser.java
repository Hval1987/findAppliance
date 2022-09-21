package by.tc.task01.dao.impl.handler;

import by.tc.task01.dao.Parametr;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SAXParser extends DefaultHandler {
    ArrayList<Appliance> list;
    Map<String, List<Appliance>> appliance = new HashMap<>();
    Oven ovn;
    Laptop lpt;
    StringBuilder text;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("start document");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        text = new StringBuilder();

        System.out.println("uri->" + uri + "  localName->" + localName + "  qName->" + qName);
        if (qName.equals("app:oven")) {
            list = new ArrayList<>();
            ovn = new Oven();
            ovn.setId(Integer.parseInt(attributes.getValue("id")));
            System.out.println("id- " + Integer.parseInt(attributes.getValue("id")));

        }
        if (qName.equals("app:laptop")) {
            list = new ArrayList<>();
            lpt = new Laptop();
            lpt.setId(Integer.parseInt(attributes.getValue("id")));
            System.out.println("id- " + Integer.parseInt(attributes.getValue("id")));
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        text.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) {


        String value = text.toString().trim();

        if (qName.contains("app:")) {
            qName = qName.replace("app:", "");
        }
        System.out.println(qName.replace("-", "").toUpperCase());
        switch (Parametr.valueOf(qName.replace("-", "").toUpperCase())) {

            case POWERCONSUMPTION:
                ovn.setPowerConsumption(Integer.parseInt(value));
                break;
            case WEIGHT:
                ovn.setWeight(Integer.parseInt(value));
                break;
            case CAPACITY:
                ovn.setCapasity(Integer.parseInt(value));
                break;
            case DEPT:
                ovn.setDept(Integer.parseInt(value));
                break;
            case WIDTH:
                ovn.setWidth(Double.parseDouble(value));
                break;
            case HEIGHT:
                ovn.setHeight(Double.parseDouble(value));
                break;
            case OVEN:
                list.add(ovn);

                ovn = null;
                break;
            case OVENS:
                appliance.put("Oven", list);
                System.out.println(appliance);
                list = null;
                break;
            //парсим лаптопы
            case BATTERYCAPACITY:

                lpt.setBatteryCapacity(Double.parseDouble(value));
                break;
            case OS:

                lpt.setOs(value);
                break;
            case MEMORYROM:

                lpt.setMemoryRom(Integer.parseInt(value));
                break;
            case SYSTEMMEMORY:

                lpt.setSystemMemory(Integer.parseInt(value));
                break;
            case CPU:

                lpt.setCpu(Double.parseDouble(value));
                break;
            case DISPLAYINCH:

                lpt.setDisplayInch(Double.parseDouble(value));
                break;
            case LAPTOP:
                list.add(lpt);

                lpt = null;
                break;
            case LAPTOPS:
                appliance.put("Laptop", list);
                System.out.println(appliance);


        }


    }

    public List<Appliance> getOvenList() {
        return list;
    }
}
