package pl.tomaszKrawczyk.allertManager.model.services;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import pl.tomaszKrawczyk.allertManager.model.AlertForm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomek Krawczyk on 24.02.2018.
 */

@Service()
@Scope(value = "session",proxyMode = ScopedProxyMode.TARGET_CLASS)
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
