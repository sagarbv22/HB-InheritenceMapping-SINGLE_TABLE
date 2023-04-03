package in.ineuron.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "card")
public class CardPayment extends Payment {

	private Long cardNo;
	private String cardType;
	private String paymentGateWay;

	public Long getCardNo() {
		return cardNo;
	}

	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getPaymentGateWay() {
		return paymentGateWay;
	}

	public void setPaymentGateWay(String paymentGateWay) {
		this.paymentGateWay = paymentGateWay;
	}

	@Override
	public String toString() {
		return "CardPayment [cardNo=" + cardNo + ", cardType=" + cardType + ", paymentGateWay=" + paymentGateWay + "]";
	}

}
