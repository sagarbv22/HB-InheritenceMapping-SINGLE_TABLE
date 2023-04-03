package in.ineuron.test;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.entity.Payment;
import in.ineuron.util.HibernateUtil;

public class SelectApp {

	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		Integer id = 1;
		try {

			session = HibernateUtil.getSession();

			Payment payment = session.get(Payment.class, 2);
			
			System.out.println(payment);

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
