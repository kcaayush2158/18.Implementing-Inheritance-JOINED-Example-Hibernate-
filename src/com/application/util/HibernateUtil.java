package com.application.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    public static SessionFactory sessionFactory;
    public static StandardServiceRegistry standardServiceRegistry;

    static {
        try {
            standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
            MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
            Metadata metadata = metadataSources.getMetadataBuilder().build();
            sessionFactory = metadata.getSessionFactoryBuilder().build();
        }catch (HibernateException ex){
            ex.printStackTrace();
                if (standardServiceRegistry != null){
                    StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
            }
        }
    }
    public SessionFactory sessionFactory(){
        return  sessionFactory;
    }
}
