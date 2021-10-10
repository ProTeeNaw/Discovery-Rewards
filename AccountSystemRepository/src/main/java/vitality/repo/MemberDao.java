package vitality.repo;

import za.ac.nwu.ac.domain.dto.Member;

import java.util.List;

public interface MemberDao {

    Member getNameById(int id);

    Member findByName(Member firstName);

    boolean saveMember(Member member);

    int updateMember(Member member);

    List<Member> findAll();

    void deleteMember(Integer id);
}
