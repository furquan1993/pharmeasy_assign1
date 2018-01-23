/**
 * 
 */
package com.furquan.pharmeasy_assign1.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furquan.pharmeasy_assign1.constants.AccessLevel;
import com.furquan.pharmeasy_assign1.model.Prescription;
import com.furquan.pharmeasy_assign1.model.PrescriptionAccessControl;
import com.furquan.pharmeasy_assign1.model.User;
import com.furquan.pharmeasy_assign1.repository.PrescriptionAccessControlRepository;
import com.furquan.pharmeasy_assign1.service.PrescriptionAccessControlService;

/**
 * @author Furquan
 *
 */
@Service
public class PrescriptionAccessControlServiceImpl implements PrescriptionAccessControlService {

	@Autowired
	private PrescriptionAccessControlRepository pacRepo;

	@Override
	public PrescriptionAccessControl createNew(Prescription prescription, User user, AccessLevel accessLevel) {
		PrescriptionAccessControl pac = new PrescriptionAccessControl();
		pac.setProvidedOn(new Date());
		pac.setPrescriptionId(prescription.getId());
		pac.setUserId(user.getId());
		pac.setAccessLevel(accessLevel.name());
		pac = pacRepo.save(pac);
		return pac;
	}

}
