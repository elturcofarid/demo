package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.constants.ConstApi;
import com.example.demo.constants.Messages;



@Component
public class FileService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final GenerateFile geneateFile = new GenerateFile();



	@Scheduled(fixedRateString = "#{@getCronValue}")
	public void createFileJob() {
		try {
			logger.info("START job CreateFileJob");
			// 0 Consultar la marca, generar una lista de marcas
			logger.info("consult brand");
			Brand brand = new Brand();
				this.runTask(brand);
			
			logger.info("END job CreateFileJob");
		} catch (Exception e) {
			logger.error(Messages.GENERIC_ERROR + " in createFileJob");
			logger.error(e.getMessage());
			e.printStackTrace();
		}

	}

	@Bean
	public String getCronValue() {
		
		return "2";

	}

	@Async void runTask(Brand brand) throws IOException {

		
		ArrayList<ProductRediDto> listProductRedi = new ArrayList<ProductRediDto>();
				
				String fileName = geneateFile.createCSV(listProductRedi, brand.getName(), 1, ConstApi.URL_FILE_RAPPI_CONT);
				File file = new File(ConstApi.URL_FILE_RAPPI_CONT + fileName);
				
				

				// 3 Llamar metodo que hace la conexion con el FTP
				logger.info("connect SFTP {}", brand.getName());
				


	}

	

}
