package com.application.main;

import com.application.entity.FourWheeler;
import com.application.entity.TwoWheeler;
import com.application.entity.Vehicle;
import com.application.util.HibernateUtil;
import org.hibernate.Session;

public class Main {
 public static void main(String[] args){

     try(Session session = HibernateUtil.sessionFactory.openSession()){
         session.beginTransaction();

         Vehicle vehicle = new Vehicle();
         vehicle.setVehicleName("car");

         TwoWheeler twoWheeler = new TwoWheeler();
         twoWheeler.setVehicleName("bike");
         twoWheeler.setSteeringHandler("bike steering Handler");

         FourWheeler fourWheeler = new FourWheeler();
         fourWheeler.setVehicleName("Ferrari");
         fourWheeler.setSteeringWheel("Car steering Wheel");

        session.save(vehicle);
        session.save(twoWheeler);
        session.save(fourWheeler);
        session.getTransaction().commit();
        session.close();
        }catch (Exception ex){
         ex.printStackTrace();
     }
  }
}
