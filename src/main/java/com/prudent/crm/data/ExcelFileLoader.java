package com.prudent.crm.data;

import java.io.File;
import java.time.ZoneId;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prudent.crm.domain.Address;
import com.prudent.crm.domain.Customer;
import com.prudent.crm.domain.MaritalStatus;
import com.prudent.crm.persistent.mongo.repository.CustomerRepository;

@Component
public class ExcelFileLoader {
	
	@Autowired
	CustomerRepository customerRepository;
	
	private void processSheet(XSSFSheet sheet) throws Exception{
		Iterator<Row> rows = sheet.iterator();
		//skip the first row
		rows.next();
		while(rows.hasNext()){
			processRow(rows.next());
		}
	}
	
	private void processRow(Row row) {
		Customer customer = new Customer();
		Address address = new Address();
		address.setStreetAdr(row.getCell(6, Row.CREATE_NULL_AS_BLANK).getStringCellValue());
		address.setState(row.getCell(7, Row.CREATE_NULL_AS_BLANK).getStringCellValue());

		customer.setId(row.getCell(0, Row.CREATE_NULL_AS_BLANK).getStringCellValue());
		customer.setFirstName(row.getCell(1, Row.CREATE_NULL_AS_BLANK).getStringCellValue());
		customer.setLastName(row.getCell(2, Row.CREATE_NULL_AS_BLANK).getStringCellValue());
		customer.setSsn((int)row.getCell(3, Row.CREATE_NULL_AS_BLANK).getNumericCellValue());
		customer.setPhoneNumber(row.getCell(4, Row.CREATE_NULL_AS_BLANK).getStringCellValue());
		customer.setEmail(row.getCell(5, Row.CREATE_NULL_AS_BLANK).getStringCellValue());
		customer.setAddress(address);
		customer.setDateOfBirth(row.getCell(8, Row.CREATE_NULL_AS_BLANK).getDateCellValue().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		customer.setMaritalStatus(MaritalStatus.valueOf(row.getCell(9, Row.CREATE_NULL_AS_BLANK).getStringCellValue()));
		customer.setNumberOfChild((int)row.getCell(10, Row.CREATE_NULL_AS_BLANK).getNumericCellValue());
		customer.setOwnProperty(Boolean.valueOf(row.getCell(11, Row.CREATE_NULL_AS_BLANK).getStringCellValue()));
		customer.setOwnVehicle(Boolean.valueOf(row.getCell(12, Row.CREATE_NULL_AS_BLANK).getStringCellValue()));
		customer.setSelfEmployed(Boolean.valueOf(row.getCell(13, Row.CREATE_NULL_AS_BLANK).getStringCellValue()));
		customer.setAdjustedGrossIncome(row.getCell(14, Row.CREATE_NULL_AS_BLANK).getNumericCellValue());
		customer.setDialect(row.getCell(15, Row.CREATE_NULL_AS_BLANK).getStringCellValue());
		customer.setFederalRefundAmount(row.getCell(16, Row.CREATE_NULL_AS_BLANK).getNumericCellValue());
		customer.setStateRefundAmount(row.getCell(17, Row.CREATE_NULL_AS_BLANK).getNumericCellValue());
		customer.setAuditIRScomments(row.getCell(18, Row.CREATE_NULL_AS_BLANK).getStringCellValue());
		customer.setFeeCharged(row.getCell(19, Row.CREATE_NULL_AS_BLANK).getNumericCellValue());
		customerRepository.save(customer);
	}



	public void processFile(File file) throws Exception {
		XSSFWorkbook wb = null;
		wb = new XSSFWorkbook(file);

		try {
			processSheet(wb.getSheetAt(0));
		} finally {
			if (wb != null) {
				wb.close();
			}
		}
	}
}
