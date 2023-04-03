package in.ineuron.entity;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "cheque")
public class Cheque extends Payment {

	private Long chequeNo;
	private String chequeType;
	private LocalDate expriyDate;

	public Long getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(Long chequeNo) {
		this.chequeNo = chequeNo;
	}

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}

	public LocalDate getExpriyDate() {
		return expriyDate;
	}

	public void setExpriyDate(LocalDate expriyDate) {
		this.expriyDate = expriyDate;
	}

	@Override
	public String toString() {
		return "Cheque [chequeNo=" + chequeNo + ", chequeType=" + chequeType + ", expriyDate=" + expriyDate + "]";
	}

}
