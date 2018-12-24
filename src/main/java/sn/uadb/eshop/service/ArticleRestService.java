package sn.uadb.eshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sn.uadb.eshop.dao.ArticleRepository;
import sn.uadb.eshop.entities.Article;

@RestController
@CrossOrigin("*")
public class ArticleRestService {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	@RequestMapping(value="/api/articles", method=RequestMethod.GET)
	public List<Article> getAllArticle(){
		return articleRepository.findAll();
	}
	
	@RequestMapping(value="/api/articles/{id}", method=RequestMethod.GET)
	public Optional<Article> getArticle(@PathVariable Long id){
		return articleRepository.findById(id);
	}  
	
	
	@RequestMapping(value="/api/savearticles", method=RequestMethod.POST)
	public Article savearticle(@RequestBody Article a) {
		return articleRepository.save(a);
	}
	
	@RequestMapping (value ="/api/deletearticles/{id}", method=RequestMethod.DELETE)
	public void deletearticle(@PathVariable Long id) {
		 articleRepository.deleteById(id);
	}
	
	@RequestMapping(value="/api/editarticle/{id}", method=RequestMethod.PUT)
	public Article editarticle(@PathVariable Long id,@RequestBody Article a) {
		a.setId(id);
		return articleRepository.save(a);
	}
	
	
	@RequestMapping(value="/api/findarticle", method=RequestMethod.GET)
	public Page<Article> findArticles(
			@RequestParam (name="mc", defaultValue="") String mc,
			@RequestParam (name="page", defaultValue="0") int page,
			@RequestParam (name="size", defaultValue="10") int size
			){
		return articleRepository.findarticles("%"+mc+"%", new PageRequest(page, size));
		
	}
	
	
	
	

}
