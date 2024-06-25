package by.vdavdov.dao;

import by.vdavdov.domain.entity.City;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CityDAO {
    private SessionFactory sessionFactory;

    public CityDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<City> getItems(int offset, int limit) {
        Query<City> fromCity = sessionFactory.getCurrentSession().createQuery("from City", City.class);
        fromCity.setFirstResult(offset);
        fromCity.setMaxResults(limit);
        return fromCity.list();
    }

    public int getTotalCount() {
        Query<Long> query = sessionFactory.getCurrentSession().createQuery("select count(c) from City c", Long.class);
        return query.getSingleResult().intValue();
    }
}
