package com.bulk.controller;

import com.bulk.annotation.ExcelBulkUpload;
import com.bulk.bean.CommonBean;

public class BulkUploadController {

	public void uploadExcelFiles() {

		processExcelFiles();

	}

	@ExcelBulkUpload(value = "")
	public boolean processExcelFiles() {

		return false;
	}

}
