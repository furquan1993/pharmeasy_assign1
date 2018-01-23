/**
 * 
 */
package com.furquan.pharmeasy_assign1.service;

import com.furquan.pharmeasy_assign1.constants.AccessLevel;
import com.furquan.pharmeasy_assign1.model.Prescription;
import com.furquan.pharmeasy_assign1.model.PrescriptionAccessControl;
import com.furquan.pharmeasy_assign1.model.User;

/**
 * @author Furquan
 *
 */
public interface PrescriptionAccessControlService {

	public PrescriptionAccessControl createNew(Prescription prescription, User user, AccessLevel accessLevel);

}
