/**
 * 
 */
package com.furquan.pharmeasy_assign1.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.furquan.pharmeasy_assign1.constants.AccessLevel;
import com.furquan.pharmeasy_assign1.model.Prescription;
import com.furquan.pharmeasy_assign1.model.User;
import com.furquan.pharmeasy_assign1.service.PrescriptionAccessControlService;
import com.furquan.pharmeasy_assign1.service.PrescriptionService;
import com.furquan.pharmeasy_assign1.service.UserService;

/**
 * @author Furquan
 *
 */
@Controller
@RequestMapping(path = "prescription")
public class PrescriptionController {

	@Autowired
	private PrescriptionService prescriptionService;

	@Autowired
	private PrescriptionAccessControlService pacService;

	@Autowired
	private UserService userService;

	@RequestMapping(path = "addNew")
	public ModelAndView addNew(@RequestParam("prescriptionFile") MultipartFile file) {
		ModelAndView model = new ModelAndView();
		model.setViewName("dashboard");
		try {
			Prescription prescription = prescriptionService.createNew(new User(), file);
			model.addObject(prescription);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return model;
	}

	@RequestMapping(path = "share")
	public ModelAndView share(@RequestParam("prescriptionId") long prescriptionId,
			@RequestParam("username") String username) {
		ModelAndView model = new ModelAndView("dashboard");
		Prescription prescription = prescriptionService.findById(prescriptionId);
		if (prescription == null) {
			model.addObject("error", "No such prescription exists");
			return model;
		}
		User user = userService.findByUsername(username);
		if (user == null) {
			model.addObject("error", "No user exists with username : " + username);
			return model;
		}
		pacService.createNew(prescription, user, AccessLevel.READ);
		return model;
	}

}
