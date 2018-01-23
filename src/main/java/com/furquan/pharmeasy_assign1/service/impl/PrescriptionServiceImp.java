package com.furquan.pharmeasy_assign1.service.impl;

import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.furquan.pharmeasy_assign1.model.Prescription;
import com.furquan.pharmeasy_assign1.model.User;
import com.furquan.pharmeasy_assign1.repository.PrescriptionRepository;
import com.furquan.pharmeasy_assign1.service.PrescriptionService;

@Service
public class PrescriptionServiceImp implements PrescriptionService {

	@Autowired
	private PrescriptionRepository prescriptionRepository;

	@Override
	public Prescription createNew(User user, MultipartFile file) throws IOException {
		Prescription prescription = new Prescription();
		prescription.setCreatedOn(new Date());
		prescription.setDataFile(file.getBytes());
		prescription.setFileName(file.getName());
		prescription.setOwnerId(user.getId());
		prescription = prescriptionRepository.save(prescription);
		return prescription;
	}

}
