package com.mdw.pojo;


import java.util.HashMap;
import java.util.Map;

public class FormatResult {
	public final static int SUCCESS = 0;
	public final static int NO_DATA = 1;
	public final static int CUSTOM_ERROR = 2;
	public final static int UNKNOW_ERROR = 3;

	private int resultCode=UNKNOW_ERROR;
	private int stepNo=0;
	private String errorCode="";
	private String errorMessage="";
	private String errorColor="";
	private Object resultValue;
	private String reservedField="";

	public FormatResult() {
		setResultCode(SUCCESS);
	}

	public Map<String, Object> getResult() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ResultCode", getResultCode());
		map.put("StepNo", getStepNo());
		map.put("ErrorCode", getErrorCode());
		map.put("ErrorMessage", getErrorMessage());
		map.put("ErrorColor", getErrorColor());
		map.put("ResultValue", getResultValue());
		return map;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public int getStepNo() {
		return stepNo;
	}

	public void setStepNo(int stepNo) {
		this.stepNo = stepNo;
	}

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

	public Object getResultValue() {
		return resultValue;
	}

	public String getReservedField() {
		return reservedField;
	}

	public void setReservedField(String reservedField) {
		this.reservedField = reservedField;
	}

	public String getErrorColor() {
		return errorColor;
	}

	public void setErrorColor(String errorColor) {
		this.errorColor = errorColor;
	}

	public void setResultValue(Object resultValue) {
		this.resultValue = resultValue;
	}

}
