package pl.tomaszKrawczyk.allertManager.model;

/**
 * Created by Tomek Krawczyk on 28.01.2018.
 */
public class alertForm {

    private String alert;
    private boolean isWarning;

    public String getAlert() {

        return alert;
    }

    public void setAlert(String alert) {

        this.alert = alert;
    }

    public boolean getIsWarning() {

        return isWarning;
    }

    public void setIsWarning(boolean isWarning) {

        this.isWarning = isWarning;
    }
}
