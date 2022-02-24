package api.dictionary.marlene.controler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import api.dictionary.marlene.model.Verb;
import api.dictionary.marlene.model.Word;
import api.dictionary.marlene.service.ApiService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class ApiController {

	private final ApiService apiService;

	@Autowired
	public ApiController(ApiService apiService) {
		this.apiService = apiService;
	}
	@GetMapping("verbs")
	public List<Verb>loadVerbs(HttpServletRequest request )
		
	{
		return apiService.loadNormalVerbs(request);
	
	}
	@GetMapping("words")
	public List<Word>loadWords(HttpServletRequest request )
		
	{
		return apiService.loadWords(request);
	
	}

}
