package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
	Appliance find(Criteria criteria);
	void delete(Criteria criteria);
	List<Appliance> findAllByCriteria(Criteria criteria);
}
