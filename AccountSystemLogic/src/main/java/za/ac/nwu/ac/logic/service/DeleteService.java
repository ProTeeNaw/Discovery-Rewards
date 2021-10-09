package za.ac.nwu.ac.logic.service;

import za.ac.nwu.ac.domain.persistence.AccountType;

public interface DeleteService {
    AccountType deleteMiles(AccountType employee, Long miles);
}