package api.dictionary.marlene.service;

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

import api.dictionary.marlene.model.Verb;
import api.dictionary.marlene.model.Word;


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
	
	public List<Word> readExcelVords(String file) {

		List<Word>words = new ArrayList<Word>();
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
				
						String cellWord = dataFormatter.formatCellValue(cellIterator.next());
						String cellGrammar = dataFormatter.formatCellValue(cellIterator.next());
						String cellDefinition = dataFormatter.formatCellValue(cellIterator.next());
						String cellNominative = dataFormatter.formatCellValue(cellIterator.next());
						String cellAcusative = dataFormatter.formatCellValue(cellIterator.next());
						String cellDative = dataFormatter.formatCellValue(cellIterator.next()); 
						String cellGenitiv = dataFormatter.formatCellValue(cellIterator.next()); 
						String cellTranslation = dataFormatter.formatCellValue(cellIterator.next()); 
						String cellLevel = dataFormatter.formatCellValue(cellIterator.next());
					    String cellExample = dataFormatter.formatCellValue(cellIterator.next()); 
						
					

						if(cellWord.equals("Word") 
								|| cellGrammar.equals("Grammar") 
								|| cellDefinition.equals("Definition") 
								|| cellNominative.equals("Nominative") 
								|| cellAcusative.equals("Acusative")
								|| cellDative.equals("Dative")
								|| cellGenitiv.equals("Genitive")
								|| cellTranslation.equals("Translation")
								|| cellLevel.equals("Level")
								|| cellExample.equals("Example")) {
						}else {
							
							Word word = new Word();
							word.setWord(cellWord);
							word.setGrammar(cellGrammar);
							word.setDefinition(cellDefinition);
							word.setNominative(cellNominative);
							word.setAccusative(cellAcusative);
							word.setDative(cellDative);
							word.setGenitive(cellGenitiv);
							word.setToEnglish(cellTranslation);
							word.setLevel(cellLevel);
							word.setEg(cellExample);
							word.setOverView(word.getWord() + word.getGrammar());
							words.add(word);
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
		
		return words;

	}

	


}
