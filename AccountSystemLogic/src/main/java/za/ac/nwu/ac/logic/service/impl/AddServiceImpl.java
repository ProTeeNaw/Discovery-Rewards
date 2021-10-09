package za.ac.nwu.ac.logic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.logic.service.AddService;

import java.util.List;

public class AddServiceImpl implements AddService {

    @Override
    public List<AccountType> addMiles(Long member_id, Long miles) {
        return null;
    }
}