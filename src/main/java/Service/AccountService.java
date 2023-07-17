package Service;

import DAO.AccountDAO;
import Model.Account;


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
    public Account getAccount(String username, String password){
        if (accountDAO.getAccount(username)!=null && password.equals(accountDAO.getAccount(username).getPassword())){
            return accountDAO.getAccount(username);
        }else{
            return null;
        }
    }

    
}
