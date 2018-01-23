/**
 * 
 */
package com.furquan.pharmeasy_assign1.dto;

import java.util.List;

/**
 * @author Furquan
 *
 */
public class ResponseStatus {
	private boolean success;
	private List<Error> errors;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "ResponseStatus [success=" + success + ", errors=" + errors + "]";
	}

}

class Error {
	private String errorCode;
	private String errorMessage;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "Error [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}

}