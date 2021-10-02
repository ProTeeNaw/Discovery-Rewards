package za.ac.nwu.ac.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
public class AccountTypeDto {
    @Id
    @NotNull
    private Long memberID;

    @NotNull
    private String memberName;

    @NotNull
    private String memberSurname;

    @JsonIgnore
    private final LocalDateTime startDate = LocalDateTime.now();

    @JsonIgnore
    private final Long miles = 0L;

    @NotNull
    private Long drivingBehaviour;

    @NotNull
    private Long spendingBehaviour;

    @NotNull
    private Long health_Fitness;
}