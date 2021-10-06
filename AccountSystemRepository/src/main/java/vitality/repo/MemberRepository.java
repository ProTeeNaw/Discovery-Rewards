package vitality.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;

public interface MemberRepository extends JpaRepository<AccountTypeDto, Long>{

}
