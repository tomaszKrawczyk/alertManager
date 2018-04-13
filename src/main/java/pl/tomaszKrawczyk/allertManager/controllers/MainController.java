package pl.tomaszKrawczyk.allertManager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.tomaszKrawczyk.allertManager.model.AlertForm;
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
        model.addAttribute("list",allertListService.getAlertFormList());

        return "index";
    }

    @GetMapping("/addAlert")
    public String addAlert(Model model) {

        model.addAttribute("AlertForm",new AlertForm());
        return "addAlert";

    }

    @PostMapping("/addAlert")
    public String addAlertPost(@ModelAttribute AlertForm alert, Model model) {
        allertListService.addAlertToList(alert);

        System.out.println("Size list: "+allertListService.getAlertFormList().size());

        model.addAttribute("info","New warning was successfully added");

        return "addAlert";


    }


}
