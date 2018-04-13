package pl.tomaszKrawczyk.allertManager.model.services;

import org.springframework.stereotype.Service;
import pl.tomaszKrawczyk.allertManager.model.AlertForm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomek Krawczyk on 24.02.2018.
 */

@Service
public class AlertListService {

    private List<AlertForm> alertFormList;


    public AlertListService() {
        alertFormList=new ArrayList<>();
    }


    public List<AlertForm> getAlertFormList() {
        return alertFormList;
    }

    public void addAlertToList(AlertForm alert){

        alertFormList.add(alert);

    }
}
