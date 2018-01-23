/**
 * 
 */
package com.furquan.pharmeasy_assign1.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.furquan.pharmeasy_assign1.model.Prescription;
import com.furquan.pharmeasy_assign1.model.User;

/**
 * @author Furquan
 *
 */
public interface PrescriptionService {

	public Prescription createNew(User user, MultipartFile file) throws IOException;
	
}
