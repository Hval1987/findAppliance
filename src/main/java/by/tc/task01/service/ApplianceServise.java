package by.tc.task01.service;

import by.tc.task01.entity.Appliance;

import java.util.List;

public interface ApplianceServise {
    List<Appliance> findApplianceByCriteria(Criteria criteria);
}
