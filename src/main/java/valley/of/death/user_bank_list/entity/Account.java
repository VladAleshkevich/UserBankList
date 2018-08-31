package valley.of.death.user_bank_list.entity;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "accountid")
    private int accountid;
    @Column(name="account")
    private int account;
    @Column(name = "userid")
    private int userid;

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public int getUserid() {
        return userid;
    }
}