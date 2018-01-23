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

import com.furquan.pharmeasy_assign1.model.Prescription;
import com.furquan.pharmeasy_assign1.model.User;
import com.furquan.pharmeasy_assign1.service.PrescriptionService;

/**
 * @author Furquan
 *
 */
@Controller
@RequestMapping(path = "prescription")
public class PrescriptionController {

	@Autowired
	private PrescriptionService prescriptionService;

	@RequestMapping(path = "addNew")
	public ModelAndView addNew(@RequestParam("prescriptionFile") MultipartFile file) {
		try {
			Prescription prescription = prescriptionService.createNew(new User(), file); 
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		ModelAndView model = new ModelAndView();
		model.setViewName("dashboard");
		return model;
	}
}
