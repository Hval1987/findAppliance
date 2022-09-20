package by.tc.task01.dao.impl.handler;

import by.tc.task01.dao.Parametr;
import by.tc.task01.entity.Laptop;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.List;

public class Handler4Laptop extends DefaultHandler {
    Laptop laptop;
    List<Laptop> list;
    StringBuilder text=new StringBuilder();
    public Handler4Laptop() {
        super();
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("start laptop document");
    }
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("uri->"+uri+"  localName->"+localName+"  qName->"+qName);
        if(qName.equals("Laptop")){
            laptop=new Laptop();
            laptop.setId(Integer.parseInt(attributes.getValue("id")));

        }
    }
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        text.append(ch,start,length);

    }
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        String param=qName.replace("-","");
        switch (Parametr.valueOf(param)){
            case BATERYCAPASITY:
                laptop.setBatteryCapacity(Integer.parseInt(text.toString()));
                break;
            case OS:
                laptop.setOs(text.toString());
                break;
            case MEMORYROM:
                laptop.setMemoryRom(Integer.parseInt(text.toString()));
                break;
            case SYSTEMMEMORY:
                laptop.setSystemMemory(Integer.parseInt(text.toString()));
            case CPU:
                laptop.setCpu(Double.parseDouble(text.toString()));
                break;
            case DISPLAYINCH:
                laptop.setDisplayInch(Double.parseDouble(text.toString()));
                break;
            case LAPTOP:
                list.add(laptop);
                laptop=null;
                break;

        }
    }
    public List<Laptop> getLaptopList(){
        
        return list;
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }






}
