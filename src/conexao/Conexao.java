package conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
    
    
    private static EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("crud");
    
    public EntityManager getConnection () {
        return emf.createEntityManager();
    }
    
}
