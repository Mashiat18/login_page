package controller;

import data.model.LoginPage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "login_pageController")
@SessionScoped
public class Login_pageController {
    LoginPage loginPage = new LoginPage();

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(LoginPage login) {
        this.loginPage = login;
    }

    public String isNextPage(){
        return "success";
    }

}
