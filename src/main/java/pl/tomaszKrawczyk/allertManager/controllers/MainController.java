package pl.tomaszKrawczyk.allertManager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.tomaszKrawczyk.allertManager.model.alertForm;
import pl.tomaszKrawczyk.allertManager.model.services.AlertListService;

/**
 * Created by Tomek Krawczyk on 28.01.2018.
 */

@Controller
public class MainController {


    @Autowired
    AlertListService allertListService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("alerts",allertListService.getAlertFormList());

        return "index";
    }

    @GetMapping("/addAlert")
    public String addAlert(Model model) {

        alertForm alertForm =new alertForm();
        alertForm.setIsWarning(true);
        model.addAttribute("alertForm", alertForm);
        return "addAlert";

    }

    @PostMapping("/addAlert")
    public String addAlertPost(@ModelAttribute alertForm alert, Model model) {
        allertListService.addAlertToList(alert);

        System.out.println("Wielkość listy: "+allertListService.getAlertFormList().size());

        model.addAttribute("info","Poprawnie dodałeś nowe ostrzeżenie");

        return "addAlert";


    }


}
