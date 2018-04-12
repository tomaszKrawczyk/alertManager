package pl.tomaszKrawczyk.allertManager.model.services;

import org.springframework.stereotype.Service;
import pl.tomaszKrawczyk.allertManager.model.alertForm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomek Krawczyk on 24.02.2018.
 */

@Service
public class AlertListService {

    private List<alertForm> alertFormList;


    public AlertListService() {
        alertFormList=new ArrayList<>();
    }


    public List<alertForm> getAlertFormList() {
        return alertFormList;
    }

    public void addAlertToList(alertForm alert){

        alertFormList.add(alert);

    }
}
