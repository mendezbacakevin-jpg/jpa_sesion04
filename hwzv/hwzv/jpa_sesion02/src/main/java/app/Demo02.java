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
		// objeto a grabar
		Usuario u = new Usuario();
		// u.setCod_usua(codigo); // se puede omitir por ser AUTO_INCREMENT
		u.setNom_usua("william");
		u.setApe_usua("zavaleta");
		// proceso
		try {
		manager.getTransaction().begin();
		manager.persist(u);
		manager.getTransaction().commit();
		System.out.println("Registro Ok");
		} catch (Exception e) {
		System.err.println("Error: " + e.getCause().getMessage());
		System.out.println("No se pudo realizar el registro");
		}
		manager.close();
		}

}