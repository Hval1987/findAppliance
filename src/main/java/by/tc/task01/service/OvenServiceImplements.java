package by.tc.task01.service;

import by.tc.task01.entity.Appliance;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OvenServiceImplements implements ApplianceServise {
    @Override
    public Appliance findApplianceByCriteria(Criteria criteria) {

        List<String> findedParametr;
        String applianceType;
        //достаем из дао лист приборов и лист текстового описания
        List<Appliance> applianceList = null;// временно , потом нужно достать из дао
        //если тип чему-то равен , то ищем именно по этому типу
        applianceType=criteria.getType();
        findedParametr=criteria.getParameters();
        
        for(Appliance appliance:applianceList){
            String tmp[]=appliance.toString().split(",");
            for(int i=0;i<tmp.length;i++){
                tmp[i]=tmp[i].trim();
                if(tmp[i].equals(findedParametr.get(0))){

                }
            }
        }








        return null;
    }
}
