package by.vdavdov;

import by.vdavdov.domain.entity.City;
import by.vdavdov.domain.entity.Country;
import by.vdavdov.domain.entity.CountryLanguage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Country.class);
        cfg.addAnnotatedClass(City.class);
        cfg.addAnnotatedClass(CountryLanguage.class);
        cfg.configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session currentSession = sessionFactory.getCurrentSession();

        currentSession.beginTransaction();

        City city = new City();
        city.setCountry(currentSession.find(Country.class, 1L));
        city.setName("Vergin");
        city.setDistrict("Nikaragua");
        city.setPopulation(112134242);
        currentSession.persist(city);

        currentSession.getTransaction().commit();

    }
}