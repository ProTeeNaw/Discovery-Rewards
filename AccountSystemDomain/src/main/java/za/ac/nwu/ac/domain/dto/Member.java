package za.ac.nwu.ac.domain.dto;

import java.util.Date;

public class Member {

    private int id;
    private String firstName;
    private String lastName;
    private Long spendingBehavior;
    private Long healthAndFitness;
    private Long drivingBehavior;
    private Long miles;
    private Date startDate;

    public Member()
    {
        super();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getSpendingBehavior() {
        return spendingBehavior;
    }

    public Long getHealthAndFitness() {
        return healthAndFitness;
    }

    public Long getDrivingBehavior() {
        return drivingBehavior;
    }

    public Long getMiles() {
        return miles;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSpendingBehavior(Long spendingBehavior) {
        this.spendingBehavior = spendingBehavior;
    }

    public void setHealthAndFitness(Long healthAndFitness) {
        this.healthAndFitness = healthAndFitness;
    }

    public void setDrivingBehavior(Long drivingBehavior) {
        this.drivingBehavior = drivingBehavior;
    }

    public void setMiles(Long miles) {
        this.miles = miles;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", spendingBehavior=" + spendingBehavior +
                ", healthAndFitness=" + healthAndFitness +
                ", drivingBehavior=" + drivingBehavior +
                ", miles=" + miles +
                '}';
    }
}
