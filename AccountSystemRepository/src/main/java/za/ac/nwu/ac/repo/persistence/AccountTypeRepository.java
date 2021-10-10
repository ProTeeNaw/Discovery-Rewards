package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.util.List;

@Repository
public interface AccountTypeRepository extends CrudRepository<AccountType, Long> {

    String sqlAdd = "INSERT INTO MEMBERS (MEMBER_ID, FIRSTNAME) VALUES (3, 'Bonga')";
    @Query(sqlAdd)
    List<AccountType> addMiles(Long member_id, Long miles);

    String sqlSubtract = "SELECT Miles FROM MILES WHERE MEMBER ID = 2";
    @Query(sqlSubtract)
    List<AccountType> subtractMiles(Long member_id, Long miles);

    String sqlView = "SELECT Miles FROM MILES WHERE MEMBER ID = 2";
    @Query(sqlView)
    List<AccountType> viewMiles(Long member_id, Long miles, String currency);
}
