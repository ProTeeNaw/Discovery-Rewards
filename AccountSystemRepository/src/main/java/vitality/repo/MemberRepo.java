package vitality.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.dto.Member;
import za.ac.nwu.ac.domain.dto.MemberRowMapper;

import java.util.List;

@Repository
public class MemberRepo implements MemberDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String test()
    {
        return "Happy Test";
    }
    public List<Member> getMembers()
    {
        return jdbcTemplate.query("SELECT * FROM MEMBERS", new MemberRowMapper());
    }

    public String setset()
    {
        jdbcTemplate.query("INSERT INTO MEMBERS (MEMBER_ID, FIRSTNAME) VALUES(2, 'BUSI')", new MemberRowMapper());
        return "Done";
    }
    @Override
    public Member getNameById(int id) {
        return null;
    }

    @Override
    public Member findByName(Member firstName) {
        return null;
    }

    @Override
    public boolean saveMember(Member member) {
        return false;
    }

    @Override
    public int updateMember(Member member) {
        return 0;
    }

    @Override
    public List<Member> findAll() {
        return null;
    }

    @Override
    public void deleteMember(Integer id) {

    }
}
