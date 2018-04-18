package pl.tomaszKrawczyk.allertManager.model;

import javax.validation.constraints.Size;

/**
 * Created by Tomek Krawczyk on 28.01.2018.
 */
public class AlertForm {

    @Size(min = 4, max = 50, message = "Alert must have 4-50 signs")
    private String alert;
    private boolean isWarning;


    public AlertForm(){

        isWarning=true;
    }




    public String getAlert() {

        return alert;
    }

    public void setAlert(String alert) {

        this.alert = alert;
    }

    public Boolean getIsWarning() {

        return isWarning;
    }

    public void setIsWarning(Boolean warning) {

        isWarning = warning;
    }
}
