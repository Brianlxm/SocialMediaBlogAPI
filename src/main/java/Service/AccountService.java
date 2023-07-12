package Service;

import DAO.AccountDAO;
import Model.Account;

import java.util.List;

public class AccountService {
    public AccountDAO accountDAO;

    public AccountService(){
        accountDAO = new AccountDAO();
    }

    public AccountService(AccountDAO accountDAO){
        this.accountDAO = accountDAO;
    }
    
    // add new user
    public Account addAccount(Account account){
        if (accountDAO.getAccount(account.getUsername())==null && account.getPassword().length()>=4 && account.getUsername()!=""){
            return accountDAO.addAccount(account);
        }else{
            return null;
        }
    }

    // verify user
    public Account getAccount(Account account){
        if (accountDAO.getAccount(account.getUsername())!=null && accountDAO.getAccount(account.getUsername()).getPassword()==account.getPassword()){
            return accountDAO.getAccount(account.getUsername());
        }else{
            return null;
        }
    }

    // get user by account_id


    // retreive all messages by account_id

    
}
