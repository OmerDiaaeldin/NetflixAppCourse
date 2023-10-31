/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.customers;

/**
 *
 * @author odaio
 */
public class Account {
    //implement methods
    //verify whether getters and setters should be used
    
    private String email;
    private String password;
    
    public Account(String email, String password){
        this.email = email;
        this.password = password;
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
    
    public void authenticate(String email, String password){
        if(getEmail().equals(email) && getPassword().equals(password)) {
            System.out.println("Access Granted!");
        }
        else {
            System.out.println("Access Denied!");
        }
    }
    
    public void changePassword(String password){
        setPassword(password);

    }
    
    public void resetPassword(String password){
        setPassword(password);
    }
    
    
}
