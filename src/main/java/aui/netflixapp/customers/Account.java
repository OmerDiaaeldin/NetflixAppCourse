/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.customers;

/**
 *
 * @author odaio
 */
public class Account implements Comparable<Account> {
    //implement methods
    //verify whether getters and setters should be used
    
    private String email;
    private String password;
    
    public Account(String email, String password) throws PasswordTooShortException{
        this.email = email;
        if(password.length()<10){
            throw new PasswordTooShortException("Needs to be longer than 10 characters");
        }else{
            this.password = password;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean authenticate(String email, String password){
        if( (this.email).equals(email) && (this.password).equals(password) ) {
            System.out.println("Access Granted!");
            return true;
        }
        else {
            System.out.println("Access Denied!");
            return false;
        }
    }
    
    public void changePassword(String password){
        setPassword(password);
    }
    
    public void resetPassword(String password){
        setPassword(password);
    }
    
    @Override
    public boolean equals(Object obj) {
        return (obj != null
                && obj instanceof Account
                && ((Account) obj).getEmail().equals(this.getEmail()));
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }
    
    @Override
    public int compareTo(Account account) {
        return (this.email.compareTo(account.email));
    }
    
    @Override 
    public String toString(){
        return "Your account Email is "+email+" has password "+password;
    }
    
}
