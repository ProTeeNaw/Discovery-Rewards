package za.ac.nwu.ac.logic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.repo.persistence.AccountTypeRepository;

import java.util.List;

@Service
public class AddMiles implements AddService{

    //@Autowired
    private AccountTypeRepository repository;

    @Override
    public List<AccountType> addMiles(Long member_id, Long miles) {
        var member = (List<AccountType>) repository.addMiles(2L, 12L);

        return member;
    }
}