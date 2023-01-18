package com.nttdata.ct.web.page;

import com.nttdata.ct.web.base.WebBase;
import com.nttdata.ct.web.service.util.UtilWeb;
import org.openqa.selenium.WebElement;

public class GoogleSettinsPage extends WebBase {


    protected String result = "settings-ui;settings-main;settings-basic-page;#basicPage settings-section[page-title=Autocompletar];#header h2";


    public String getValueResult() {
        return js().getTextFromWebElement(result);
    }
}