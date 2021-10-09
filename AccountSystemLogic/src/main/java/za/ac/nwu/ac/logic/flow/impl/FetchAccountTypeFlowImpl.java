package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.logic.flow.FetchAccountTypeFlow;

import javax.transaction.Transactional;

@Transactional
@Component
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {
    @Override
    public Object getAllAccountTypes() {
        return null;
    }

    /*private final AccountTypeTranslator accountTypeTranslator;

    @Autowired
    public FetchAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator)
    {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public List<AccountTypeDto> getAllAccountTypes()
    {

    }*/
}
