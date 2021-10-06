package za.ac.nwu.ac.logic.service;

import za.ac.nwu.ac.domain.persistence.AccountType;

public interface ViewService {
    AccountType viewMiles(AccountType employee, Long memberId);
}