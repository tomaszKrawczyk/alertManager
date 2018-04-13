package pl.tomaszKrawczyk.allertManager.model;

/**
 * Created by Tomek Krawczyk on 28.01.2018.
 */
public class AlertForm {

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
