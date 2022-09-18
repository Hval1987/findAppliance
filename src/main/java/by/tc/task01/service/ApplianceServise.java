package by.tc.task01.service;

import by.tc.task01.entity.Appliance;

public interface ApplianceServise {
    Appliance findApplianceByCriteria(Criteria criteria);
}
