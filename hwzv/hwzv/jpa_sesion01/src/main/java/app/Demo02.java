package app;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo02 {
	
	public static void main(String[] args) throws SQLException {
		// conexión
		EntityManagerFactory fabrica =
		Persistence.createEntityManagerFactory("mysqlconex");
		// manejador de entidades
		EntityManager manager = fabrica.createEntityManager();
		
		
		// proceso
		try {
		manager.getTransaction().begin();
		//eliminar remove
		manager.remove(manager);
		//consultar find
		manager.find(null, manager, null)
		//actualizar
		manager.merge(u);
		
		manager.getTransaction().commit();
		System.out.println("Registro Ok");
		} catch (Exception e) {
		System.err.println("Error: " + e.getCause().getMessage());
		System.out.println("No se pudo realizar el registro");
		}
		manager.close();
		}

}