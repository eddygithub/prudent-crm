package com.prudent.crm;

import java.io.File;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.prudent.crm.data.ExcelFileLoader;

@SpringBootApplication
public class PrudentCRMApplication implements CommandLineRunner{
	@Autowired
	ExcelFileLoader excelFileDataLoader;
	
	@Autowired
	ApplicationContext appContext;
	
    public static void main(String[] args) {
        SpringApplication.run(PrudentCRMApplication.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
    	File file = Paths.get(appContext.getResource("classpath:HEADING.xlsx").getURI()).toFile();
    	excelFileDataLoader.processFile(file);
    }
}
