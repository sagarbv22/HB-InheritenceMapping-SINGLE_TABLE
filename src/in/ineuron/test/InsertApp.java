package in.ineuron.test;

import java.io.Serializable;
import java.time.LocalDate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.entity.CardPayment;
import in.ineuron.entity.Cheque;
import in.ineuron.util.HibernateUtil;

public class InsertApp {

	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		try {

			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();

			CardPayment cardPayment = new CardPayment();
			cardPayment.setAmount(15000.0f);
			cardPayment.setCardNo(11234565L);
			cardPayment.setCardType("debit");
			cardPayment.setPaymentGateWay("Visa");

			Cheque cheque = new Cheque();
			cheque.setAmount(4500.0f);
			cheque.setChequeNo(1234646L);
			cheque.setChequeType("self");
			cheque.setExpriyDate(LocalDate.of(2023, 06, 22));

			session.save(cardPayment);
			session.save(cheque);

			flag = true;

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Records inserted successfully");
			} else {
				transaction.rollback();
				System.out.println("Failed to insert");
			}

			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
