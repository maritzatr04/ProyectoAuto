package com.nttdata.ct.web.step;

import com.nttdata.ct.web.page.StepPages;
import com.nttdata.ct.web.service.aspect.evidence.ScreenShot;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ScreenShot
@Component
public class GoogleSearchStep {

    @Autowired
    private StepPages page;

 /*   public void searchData(String user,String pass) {
        page.searchPage().writeuser(user);
        page.searchPage().writepass(pass);

    }

    public void clicklogin() {
        page.searchPage().login();

    }*/

    public void clickelement() {
        page.searchPage().element();

    }
}
