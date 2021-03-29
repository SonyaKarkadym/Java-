package com.example.relations.dao;

import com.example.relations.models.Car;
import lombok.AllArgsConstructor;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@AllArgsConstructor
public class CarDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Car car){
        entityManager.persist(car);
    }

    public List<Car> findAll(){
        return entityManager.createQuery("select c from Car c where c.id=:xxx", Car.class).getResultList();
    }

}
