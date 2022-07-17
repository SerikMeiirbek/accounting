package com.cydeo.controller;

import com.cydeo.dto.ClientVendorDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.service.ClientVendorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clientvendor")
public class ClientVendorController {

    private final ClientVendorService clientVendorService;

    public ClientVendorController(ClientVendorService clientVendorService) {
        this.clientVendorService = clientVendorService;
    }

    @GetMapping("/list")
    public String listAllClientVendors(Model model) {

        model.addAttribute("clientvendors", clientVendorService.listAllClientVendors());

        return "clientvendor/client-vendor-list";
    }

    @GetMapping("/add")
    public String addClientVendor(Model model) {

        model.addAttribute("clientvendor", new ClientVendorDTO());

        return "/clientvendor/client-vendor-add";
    }


    @PostMapping("/add")
    public String insertClientVendor(@ModelAttribute("clientVendor") ClientVendorDTO clientVendorDTO, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {

            //model.addAttribute("clientvendors", clientVendorService.listAllClientVendors());

            return "/clientvendor/client-vendor-add";

        }

        clientVendorService.save(clientVendorDTO);
        return "redirect:/clientvendor/list";

    }

    @GetMapping("/edit/{id}")
    public String editClientVendor(@PathVariable("id") Long id, Model model) {

        model.addAttribute("clientVendor", clientVendorService.findById(id));

        return "/clientvendor/client-vendor-edit";

    }

    @PostMapping("/edit")
    public String updateClientVendor(@ModelAttribute("clientVendorDTO") ClientVendorDTO clientVendorDTO, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {

            //model.addAttribute("clientvendors", clientVendorService.listAllClientVendors());

            return "/clientvendor/client-vendor-edit";

        }

        clientVendorService.update(clientVendorDTO);


        return "redirect:/clientvendor/list";

    }

}
