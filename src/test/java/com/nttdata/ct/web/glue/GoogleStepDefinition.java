package com.nttdata.ct.web.glue;

import com.nttdata.ct.web.WebAutomationApplication;
import com.nttdata.ct.web.lib.WebDriverManager;
import com.nttdata.ct.web.step.GoogleSearchStep;
import com.nttdata.ct.web.step.GoogleSettingsStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;


@CucumberContextConfiguration
@SpringBootTest(classes = WebAutomationApplication.class)
public class GoogleStepDefinition {

    @Value("${url.google}")
    private String urlGoogle;

    @Autowired
    private WebDriverManager manager;
    @Autowired
    private GoogleSearchStep searchStep;
    @Autowired
    private GoogleSettingsStep settingsStep; //demo shadowRoot



    @Given("que abro la pagina demoqa")
    public void queAbroLaPaginaDemo() {

        manager.navigateTo(urlGoogle);
    }
    @When("selecciono Yes en Radio button de elements")
    public void radiobuttonYes() {
    searchStep.clickelement();   }

    @Then("valido que se selecciono {string}")
    public void validoQueSeaYes(String result) {
        settingsStep.validateValueResult(result);
    }

}