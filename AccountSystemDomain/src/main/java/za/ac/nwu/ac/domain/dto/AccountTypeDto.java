package za.ac.nwu.ac.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "Members")
public class AccountTypeDto {
    @Id
    @NotNull
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberID;

    @Column(name = "memberName")
    @NotNull
    private String memberName;

    @Column(name = "memberSurname")
    @NotNull
    private String memberSurname;

    @Column(name = "startDate")
    @JsonIgnore
    private final LocalDateTime startDate = LocalDateTime.now();

    @Column(name = "miles")
    @JsonIgnore
    private final Long miles = 0L;

    @Column(name = "drivingBehaviour")
    @NotNull
    private Long drivingBehaviour;

    @Column(name = "spendingBehaviour")
    @NotNull
    private Long spendingBehaviour;

    @Column(name = "health_Fitness")
    @NotNull
    private Long health_Fitness;

    public AccountTypeDto(String miles, String miles_account_type, LocalDate parse) {
    }

    public AccountTypeDto() {

    }

    public void performQuery(long l) {
    }
}