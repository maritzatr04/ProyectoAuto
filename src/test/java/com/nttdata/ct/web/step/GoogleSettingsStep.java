package com.nttdata.ct.web.step;

import com.nttdata.ct.web.page.StepPages;
import com.nttdata.ct.web.service.aspect.evidence.ScreenShot;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ScreenShot
public class GoogleSettingsStep {

    @Autowired
    private StepPages page;


    public void validateValueResult(String result) {
        Assert.assertEquals("El valor del resultado obtenido no corresponde con el valor esperado.",
                result, page.settinsPage().getValueResult());
    }
}