package admin.administrative.runEntityManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntitiesManager {

    private static EntityManager manager;
    private static EntityManagerFactory managerFactory;

    public EntitiesManager() {
        //creamos el gestor de persistencia (em)
        try {
            managerFactory = Persistence.createEntityManagerFactory("myPersistence");
            manager = managerFactory.createEntityManager();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static EntityManager getManager() {
        return manager;
    }

    public static void setManager(EntityManager manager) {
        EntitiesManager.manager = manager;
    }

    public static EntityManagerFactory getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(EntityManagerFactory managerFactory) {
        EntitiesManager.managerFactory = managerFactory;
    }

}
