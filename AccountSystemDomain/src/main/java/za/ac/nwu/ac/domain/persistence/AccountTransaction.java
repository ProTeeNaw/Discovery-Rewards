package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "DEMO_ACCOUNT_TYPE", schema = "VITRSA_SANDBOX")

public class AccountTransaction implements Serializable{

    private Long transactionId;
    private Long accountTypeId;
    private Long memberId;
    private Long amount;
    private LocalDate transactionDate;
    private AccountType accountType;

    private static final long serialVersionID = 514548148148487871L;

    public AccountTransaction(AccountType accountType, Long transactionId, Long accountTypeId, Long memberId, Long amount, LocalDate transactionDate) {
        this.transactionId = transactionId;
        this.accountTypeId = accountTypeId;
        this.memberId = memberId;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.accountType = accountType;
    }
    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name ="TX_ID")
    public Long getTransactionId() {
        return transactionId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    public AccountType getAccountType() {
        return accountType;
    }

    @Column(name ="MEMBER_ID")
    public Long getMemberId() {
        return memberId;
    }

    @Column(name ="AMOUNT")
    public Long getAmount() {
        return amount;
    }

    @Column(name ="TRANSACTION_DATE")
    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public void setAccountTypeId(Long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setAccountType(AccountType accountType)
    {
        this.accountType = accountType;
    }
    public AccountTransaction() {

    }
}