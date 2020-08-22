package com.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hibernate.dao.AbteilungDaoImp;
import com.hibernate.dao.AbteilungDaoInt;
import com.hibernate.dao.ArtikelDaoInt;
import com.hibernate.entities.Abteilung;
import com.hibernate.entities.Artikel;
import com.hibernate.repo.dao.AbteilungRepo;
import com.hibernate.repo.dao.ArtikelRepo;

/****************block !ok get u !! vor erste !! My first change !!  and now the second change !! ok habe ich gesehen **********************/

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HibernateApplication.class, args);
		
		ApplicationContext cxt = SpringApplication.run(HibernateApplication.class, args);	
		
		
		/**************** Hibernate mit Spring Data **********************
		AbteilungRepo abtDao = cxt.getBean(AbteilungRepo.class);

		Abteilung elektroAbt = new Abteilung("Elektro Abteilung", 500);
		Abteilung moebelAbt = new Abteilung("Möbel Abteilung", 600);
		Abteilung heimTexAbt = new Abteilung("Heimtex Abteilung", 300);
		Abteilung autoAbt = new Abteilung("Auto Abteilung", 300);
				
		/*abtDao.save(elektroAbt);
		abtDao.save(moebelAbt);
		abtDao.save(heimTexAbt);
		abtDao.save(autoAbt);
		
		//abtDao.deleteAll();
		//abtDao.deleteById(7);
		
		//abtDao.updatekapazitaet(500,6);
		
		//System.out.println(abtDao.findAbtName("Heimt%").get(0).getName());
		//System.out.println(abtDao.findById(8).get().getName());
				
		----------------------------------------------------------------
		
		ArtikelRepo artDao = cxt.getBean(ArtikelRepo.class);
		
		Artikel hp = new Artikel("HP G62", 456978L, 450.99, elektroAbt);
		Artikel asus = new Artikel("Asus 456", 476578L, 600.99, elektroAbt);
		Artikel schrank = new Artikel("Schkank", 856978L, 300.99, moebelAbt);
		Artikel kissen = new Artikel("Kissen Fidern", 656278L, 10.99, heimTexAbt);
		Artikel zierkissen = new Artikel("Zier Kissen", 611178L, 17.99, heimTexAbt);
		
		Abteilung ab = abtDao.getOne(17);
		Artikel mac3 = new Artikel("Mac3", 1111685778L, 1550.99,ab);
		
		artDao.deleteAll();
		artDao.save(hp);
		artDao.save(asus);
		artDao.save(schrank);
		artDao.save(kissen);
		artDao.save(zierkissen);
		
		artDao.save(mac3);
		***********************************************************/
		
		
		/********************** Hibernate mit Spring ************************/
		AbteilungDaoInt abtDao = cxt.getBean(AbteilungDaoInt.class);

		Abteilung elektroAbt = new Abteilung("Elektro Abteilung", 500);
		Abteilung moebelAbt = new Abteilung("Möbel Abteilung", 600);
		Abteilung heimTexAbt = new Abteilung("Heimtex Abteilung", 300);
		Abteilung autoAbt = new Abteilung("Auto Abteilung", 300);
		
		ArtikelDaoInt artDao = cxt.getBean(ArtikelDaoInt.class);
		
		Artikel hp = new Artikel("HP G62", 456978L, 450.99, elektroAbt);
		Artikel asus = new Artikel("Asus 456", 476578L, 600.99, elektroAbt);
		Artikel schrank = new Artikel("Schkank", 856978L, 300.99, moebelAbt);
		Artikel kissen = new Artikel("Kissen Fidern", 656278L, 10.99, heimTexAbt);
		Artikel zierkissen = new Artikel("Zier Kissen", 611178L, 17.99, heimTexAbt);
		
		/*abtDao.save(elektroAbt);
		abtDao.save(moebelAbt);
		abtDao.save(heimTexAbt);
		abtDao.save(autoAbt);*/
		
		//System.out.println(abtDao.find(27).getName());
		//System.out.println(abtDao.getAll().get(0).getName());
		//Abteilung neuheimTx = abtDao.find(27);
		//neuheimTx.setKapazitaet(1000);
		//abtDao.update(neuheimTx);
		
		//abtDao.delete(29);

		/*artDao.save(hp);
		artDao.save(asus);
		artDao.save(schrank);
		artDao.save(kissen);
		artDao.save(zierkissen);*/
		
		
		
		/********************************************************************/
		
	}

}
