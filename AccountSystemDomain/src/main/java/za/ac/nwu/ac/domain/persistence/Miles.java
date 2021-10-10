package za.ac.nwu.ac.domain.persistence;


import javax.persistence.*;
import java.util.Objects;

public class Miles {

    private Long miles_id;
    private Long miles;
    private AccountType accountType;

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name ="MILES_ID")
    public Long getMiles_id() {
        return miles_id;
    }

    public void setMiles_id(Long miles_id) {
        this.miles_id = miles_id;
    }

    @Column(name = "MILES")
    public Long getMiles() {
        return miles;
    }

    public void setMiles(Long miles) {
        this.miles = miles;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Miles miles1 = (Miles) o;
        return Objects.equals(miles_id, miles1.miles_id) && Objects.equals(miles, miles1.miles) && Objects.equals(accountType, miles1.accountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(miles_id, miles, accountType);
    }

    @Override
    public String toString() {
        return "Miles{" +
                "miles_id=" + miles_id +
                ", miles=" + miles +
                ", accountType=" + accountType +
                '}';
    }
}
