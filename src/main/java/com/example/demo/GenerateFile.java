package com.example.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Calendar;
import java.util.List;

import com.example.demo.constants.ConstApi;
import com.opencsv.CSVWriter;



public class GenerateFile {

	public String createCSV(List<ProductRediDto> listProductRedi, String brand, int sequence, String path)
			throws IOException {

		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);

		String nameFile = brand + " " + day + " " + (month + 1) + " " + year + " - " + sequence + ".csv";

		try(FileOutputStream os = new FileOutputStream(path + nameFile)){
			os.write(0xef);
			os.write(0xbb);
			os.write(0xbf);
			
			CSVWriter fileCSV = new CSVWriter(new OutputStreamWriter(os));
			fileCSV.writeNext(ConstApi.getHeaderFileCsv());

			for (ProductRediDto pr : listProductRedi) {
				if (pr.getStock() != null && pr.getStock() > 0 && pr.getPriceByStore() != null
						&& pr.getPriceByStore() > 0) {
					this.writeLine(pr, fileCSV);
				}
			}

			fileCSV.close();

			return nameFile;
		}
	}

	public void writeLine(ProductRediDto pr, CSVWriter fileCSV) {
		String[] nextLine = { pr.getAllyReference(), pr.getSku(), pr.getName(), pr.getDescripption().replace("\n", ""),
				pr.getBrand(), String.valueOf(pr.getStock()), pr.getStore(),
				pr.getPriceByStore() == null ? "" : Utility.formatValueFile(pr.getPriceByStore()),
				pr.getPriceWithDiscount() == null ? ""
						: Utility.formatValueFile(pr.getPriceWithDiscount()),
				pr.getDiscount() == null ? "" : Utility.formatValueFile(pr.getDiscount()),
//				pr.getStartDateDiscount() == null ? "" : Utility.formatDateFile(pr.getStartDateDiscount()),
//				pr.getEndDateDiscount() == null ? "" : Utility.formatDateFile(pr.getEndDateDiscount()), pr.getProductCategory1(),
				pr.getProductCategory2(), pr.getProductCategory3(), pr.getProductCategory4(), pr.getImgProduct(),
				pr.getCategoryCombiantion(), pr.getNameCombiantion() };

		fileCSV.writeNext(nextLine);
	}

}
