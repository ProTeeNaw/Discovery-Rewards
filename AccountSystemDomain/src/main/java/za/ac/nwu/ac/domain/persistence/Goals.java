package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "GOALS", schema = "TINO")
public class Goals implements Serializable {

    private Long goalId;
    private Long accountTypeId;
    private Long healthAndFitness;
    private Long spendingBehavior;
    private LocalDate drivingBehavior;
    //private AccountType accountType;

    public Goals(Long goalId, Long accountTypeId, Long healthAndFitness, Long spendingBehavior, LocalDate drivingBehavior, AccountType accountType) {
        this.goalId = goalId;
        this.accountTypeId = accountTypeId;
        this.healthAndFitness = healthAndFitness;
        this.spendingBehavior = spendingBehavior;
        this.drivingBehavior = drivingBehavior;
        //this.accountType = accountType;
    }

    public Goals() {

    }

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name ="GOAL_ID")
    public Long getGoalId() {
        return goalId;
    }

    public void setGoalId(Long goalId) {
        this.goalId = goalId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID", nullable = false)
    public AccountType getAccountTypeId() {
        AccountType accountType = null;
        return null;
    }

    public void setAccountTypeId(AccountType accountType) {
        //this.accountType = accountType;
    }

    @Column(name = "HEALTH_AND_FITNESS")
    public Long getHealthAndFitness() {
        return healthAndFitness;
    }

    public void setHealthAndFitness(Long healthAndFitness) {
        this.healthAndFitness = healthAndFitness;
    }

    @Column(name = "SPENDING_BEHAVIOR")
    public Long getSpendingBehavior() {
        return spendingBehavior;
    }

    public void setSpendingBehavior(Long spendingBehavior) {
        this.spendingBehavior = spendingBehavior;
    }

    @Column(name = "DRIVING_BEHAVIOR")
    public LocalDate getDrivingBehavior() {
        return drivingBehavior;
    }

    public void setDrivingBehavior(LocalDate drivingBehavior) {
        this.drivingBehavior = drivingBehavior;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goals goals = (Goals) o;
        return Objects.equals(goalId, goals.goalId) && Objects.equals(accountTypeId, goals.accountTypeId) && Objects.equals(healthAndFitness, goals.healthAndFitness) && Objects.equals(spendingBehavior, goals.spendingBehavior) && Objects.equals(drivingBehavior, goals.drivingBehavior);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goalId, accountTypeId, healthAndFitness, spendingBehavior, drivingBehavior);
    }

    @Override
    public String toString() {
        return "Goals{" +
                "goalId=" + goalId +
                ", accountTypeId=" + accountTypeId +
                ", healthAndFitness=" + healthAndFitness +
                ", spendingBehavior=" + spendingBehavior +
                ", drivingBehavior=" + drivingBehavior +
                '}';
    }
}
