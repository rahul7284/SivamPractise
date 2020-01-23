package com.prestige.test.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prestige.test.model.Cart;

public class HiberMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibercfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();
		Cart cart = new Cart();
		cart.setCartName("diwali");
		session.save(cart);
		txn.commit();
	}

}
