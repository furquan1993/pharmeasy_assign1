/**
 * 
 */
package com.furquan.pharmeasy_assign1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.furquan.pharmeasy_assign1.model.PrescriptionAccessControl;
import com.furquan.pharmeasy_assign1.repository.PrescriptionAccessControlRepository;

/**
 * @author furquan.ahmed
 *
 */
@Controller
public class DashboardController {

    @Autowired
    private PrescriptionAccessControlRepository pacRepo;

    @RequestMapping(path = "/dashboard", method = RequestMethod.GET)
    public ModelAndView dashboard() {
        ModelAndView model = new ModelAndView();
        List<PrescriptionAccessControl> pacList = pacRepo.findByUserId(1l);
        model.addObject("pacList", pacList);
        return model;
    }

}
