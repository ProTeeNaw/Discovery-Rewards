package za.ac.nwu.ac.domain.persistence;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "MEMBERS")

public class AccountType implements Serializable{

    private static final long serialVersionID = 514548148148487871L;

    @Id
    @Column(name = "MEMBER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountTypeId;

    @Column(name = "FIRSTNAME")
    private String accountTypeName;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    public AccountType()
    {

    }

    public AccountType(Long accountTypeId, String accountTypeName, LocalDate startDate) {
        this.accountTypeId = accountTypeId;
        this.accountTypeName = accountTypeName;
        this.startDate = startDate;
    }

    public Long getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(accountTypeId, that.accountTypeId) && Objects.equals(accountTypeName, that.accountTypeName) && Objects.equals(startDate, that.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountTypeId, accountTypeName, startDate);
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "accountTypeId=" + accountTypeId +
                ", accountTypeName='" + accountTypeName + '\'' +
                ", startDate=" + startDate +
                '}';
    }


}