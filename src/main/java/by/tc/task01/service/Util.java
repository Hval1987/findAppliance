package by.tc.task01.service;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class Util {
    public static List<Appliance> findAllAppliance(List<Appliance> applianceList, String criteria) {
        List<Appliance> listFindedApplianced = null;
        for (Appliance appliance : applianceList) {

            String tmp[] = appliance.toString().split(",");
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = tmp[i].trim();
                if (tmp[i].equals(criteria)) {
                    listFindedApplianced.add(appliance);

                }
            }
        }

        return listFindedApplianced;
    }

    public static List<Appliance> findApplianceByType(List<Appliance> listAppliance, String criteria, String type) {
        List<Appliance> listFindedApplianced = null;

        for (Appliance appliance : listAppliance) {
            if (appliance.getClass().getName().contains(type)) {
                String tmp[] = appliance.toString().split(",");
                for (int i = 0; i < tmp.length; i++) {
                    tmp[i] = tmp[i].trim();
                    if (tmp[i].equals(criteria)) {
                        listFindedApplianced.add(appliance);
                    }
                }
            }
        }
        return listFindedApplianced;
    }
}






