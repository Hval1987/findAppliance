package by.tc.task01.service;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class OvenServiceImplements implements ApplianceServise {
    @Override
    public List<Appliance> findApplianceByCriteria(Criteria criteria) {

        List<String> findedParametr;
        String applianceType;
        //достаем из дао лист приборов и лист текстового описания
        List<Appliance> applianceList = null;// временно , потом нужно достать из дао
        //если тип чему-то равен , то ищем именно по этому типу
        applianceType = criteria.getType();
        findedParametr = criteria.getParameters();
        List<Appliance> listFindedApplianced = null;
        return Util.findAllAppliance(applianceList,findedParametr.get(0));


    }
}
