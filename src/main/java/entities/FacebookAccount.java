package entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 * Created by Andrii on 10/14/2015.
 */
@Entity
@Table(name = "FacebookAccount")
public class FacebookAccount {
    @Id @GeneratedValue
    @Column(name = "id_facebook")
    private int IdFacebook;
    @NotNull
    @Column(name = "facebook_account")
    private String facebookAccount;

    public FacebookAccount(String facebookAccount) {
        this.facebookAccount = facebookAccount;
    }

    public int getIdFacebook() {
        return IdFacebook;
    }

    public void setIdFacebook(int idFacebook) {
        IdFacebook = idFacebook;
    }

    public String getFacebookAccount() {
        return facebookAccount;
    }

    public void setFacebookAccount(String facebookAccount) {
        this.facebookAccount = facebookAccount;
    }
}
