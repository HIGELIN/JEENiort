package fr.eni.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import fr.eni.jpa.bean.Acteur;

public class DAOUtil {

	
	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	static {
		emf = Persistence.createEntityManagerFactory("Mysql_UP");
		em = emf.createEntityManager();
	}
	
	
	public static EntityManager getEntityManager(){
		return em;
	}
	
	public static void close(){
		emf.close();
	}
	

}
