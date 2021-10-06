package za.ac.nwu.ac.logic.service;

import za.ac.nwu.ac.domain.persistence.AccountType;

public interface AddService {
    AccountType saveMiles(AccountType employee, Long miles);
}