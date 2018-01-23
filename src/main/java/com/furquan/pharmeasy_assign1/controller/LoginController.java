package com.furquan.pharmeasy_assign1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.furquan.pharmeasy_assign1.helper.ValidationHelper;
import com.furquan.pharmeasy_assign1.model.User;
import com.furquan.pharmeasy_assign1.repository.UserRepository;

/**
 * 
 */

/**
 * @author Furquan
 *
 */
@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepo;

    @RequestMapping(method = RequestMethod.GET, path = "/login")
    private ModelAndView login() {
        ModelAndView model = new ModelAndView();
        model.setViewName("login");
        return model;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/login")
    private ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("username : " + username + " :: password: " + password);
        ModelAndView model = new ModelAndView();
        model.setViewName("dashboard");
        return model;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/registration")
    private ModelAndView register() {
        ModelAndView model = new ModelAndView();
        model.addObject("user", new User());
        model.setViewName("registration");
        return model;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/registration")
    private ModelAndView register(@Valid @ModelAttribute("user") User user, BindingResult results) {
        ModelAndView model = new ModelAndView();
        if (!results.hasErrors()) {
            User savedUser = userRepo.save(user);
            model.addObject("user", savedUser);
        } else {
            model.addObject("error", ValidationHelper.  getErrors(results));
        }
        model.setViewName("registration");
        return model;
    }

}
