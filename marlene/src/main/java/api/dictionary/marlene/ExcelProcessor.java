package api.dictionary.marlene;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import api.dictionary.marlene.controler.Verb;


public class ExcelProcessor {


	public List<Verb> readExcelVerbs(String file) {

		List<Verb>verbs = new ArrayList<Verb>();
		try { 
			InputStream is = new FileInputStream(file);
			
			Workbook workbook = new XSSFWorkbook(is);
			DataFormatter dataFormatter = new DataFormatter();
			Iterator<Sheet> sheets = workbook.sheetIterator();
			while(sheets.hasNext()) {
				Sheet sh = sheets.next();
				/*
				 * System.out.println("Sheet name is "+sh.getSheetName());
				 * System.out.println("---------");
				 */
				Iterator<Row> iterator = sh.iterator();
				while(iterator.hasNext()) {
					Row row = iterator.next();

					Iterator<Cell> cellIterator = row.iterator();

					while (cellIterator.hasNext()) {
						Cell cellVerb = cellIterator.next();
						Cell cellPresent = cellIterator.next();
						Cell cellPastI = cellIterator.next();
						Cell cellPastII = cellIterator.next();
						Cell futureCell = cellIterator.next(); 
						Cell cellLevel = cellIterator.next();
						
					
						

						String verbCellValue = dataFormatter.formatCellValue(cellVerb);
						String presentCellValue = dataFormatter.formatCellValue(cellPresent);
						String pastICellValue = dataFormatter.formatCellValue(cellPastI);
						String pastIICellValue = dataFormatter.formatCellValue(cellPastII);
						String levelCellValue = dataFormatter.formatCellValue(cellLevel);
						String futureCellValue = dataFormatter.formatCellValue(futureCell); 

						if(verbCellValue.equals("Infinitiv") 
								|| presentCellValue.equals("Present") 
								|| pastICellValue.equals("Preteritum") 
								|| pastIICellValue.equals("Perfekt") 
								|| futureCellValue.equals("Future")
								|| pastICellValue.equals("Level")) {
						}else {
							
							Verb verb = new Verb();
							verb.setVerb(verbCellValue);
							verb.setPresent(presentCellValue);
							verb.setPast(pastICellValue);
							verb.setPerfect(pastIICellValue);
							verb.setFuture(futureCellValue);
							verb.setLevel(levelCellValue);
						
						
							verbs.add(verb);
						}
					}
					/* System.out.println(); */
				}
			}

			workbook.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return verbs;

	}

	


}
