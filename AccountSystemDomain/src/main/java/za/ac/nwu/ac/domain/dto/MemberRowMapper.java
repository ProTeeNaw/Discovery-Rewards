package za.ac.nwu.ac.domain.dto;

import org.springframework.jdbc.core.RowMapper;
import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberRowMapper implements RowMapper{

    public Object mapRow(ResultSet rs, int rowNum) throws SQLException{
        Member member = new Member();

        member.setId(rs.getInt("MEMBER_ID"));
        /*member.setFirstName(rs.getString("firstName"));
        member.setLastName(rs.getString("lastName"));
        member.setDrivingBehavior(rs.getLong("drivingBehavior"));
        member.setHealthAndFitness(rs.getLong("healthAndFitness"));
        member.setSpendingBehavior(rs.getLong("spendingBehaviour"));
        member.setMiles(rs.getLong("miles"));
        member.setStartDate(rs.getDate("startDate"));*/

        return member;
    }
}
