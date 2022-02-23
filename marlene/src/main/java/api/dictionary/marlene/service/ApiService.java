package api.dictionary.marlene.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import api.dictionary.marlene.ExcelProcessor;
import api.dictionary.marlene.controler.Verb;

@Service
public class ApiService {
	private static final String excel_normal_File = "normal_A1A2_verbs.xlsx";
	public List<Verb> loadNormalVerbs(HttpServletRequest request) {
		List<Verb>verbs = new ArrayList<Verb>();
		try {
			File resource = new ClassPathResource(excel_normal_File).getFile();
			String fileName =  resource.getAbsolutePath();
			ExcelProcessor excelprocessor = new ExcelProcessor();
			verbs = excelprocessor.readExcelVerbs(fileName);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return verbs;
	}

}
