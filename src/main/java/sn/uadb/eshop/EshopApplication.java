package sn.uadb.eshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.uadb.eshop.dao.ArticleRepository;
import sn.uadb.eshop.dao.CategorieRepository;
import sn.uadb.eshop.entities.Article;
import sn.uadb.eshop.entities.Categorie;

@SpringBootApplication
public class EshopApplication implements CommandLineRunner {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	@Autowired
	private CategorieRepository categorieRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(EshopApplication.class, args);
		
	}

  
	@Override
	public void run(String... args) throws Exception {
	/*	
		articleRepository.save(new Article("Airpod Ecouteur sans fil", "Produit Apple Corporation", 120000, "", ));
		articleRepository.save(new Article("Iphone X max", "Produit Apple Corporation", 910000, ""));
		articleRepository.save(new Article("Iphone X-R", "Produit Apple Corporation", 1100000, ""));
		articleRepository.save(new Article("Iphone 8", "Produit Apple Corporation", 520000, ""));
		articleRepository.save(new Article("Iphone 7", "Produit Apple Corporation", 350000, ""));
		articleRepository.save(new Article("Iphone 6 Simple", "Produit Apple Corporation", 120000, ""));
		articleRepository.save(new Article("Iphone 6 Plus", "Produit Apple Corporation", 150000, ""));
		articleRepository.save(new Article("Infinix Max", "Telephonie mobile", 97000, ""));
		articleRepository.save(new Article("Samsung Galaxy S9", "Samsung Inc", 597000, ""));
		articleRepository.save(new Article("Samsung Galaxy S9 Plus", "Samsung Inc", 800000, ""));
		articleRepository.save(new Article("Samsung Galaxy S9 Plus", "Samsung Inc", 1000000, ""));
		articleRepository.save(new Article("Samsung Galaxy S8 Plus", "Samsung Inc", 790000, ""));
		articleRepository.save(new Article("Apple Watch", "Apple Corporation Inc", 250000, ""));
		articleRepository.save(new Article("Apple Emac", "Apple Corporation Inc", 1200000, ""));
		articleRepository.save(new Article("Touch Bar", "Apple Corporation Inc", 1300000, ""));*/
		// Adding default categorie
/*		categorieRepository.save(new Categorie("Ordinateur portable", "catégorie des ordinateurs portables"));
		categorieRepository.save(new Categorie("Telephones", "catégorie des telephones portables"));
		categorieRepository.save(new Categorie("Electromenager", "catégorie de produits electromenagers"));
		categorieRepository.save(new Categorie("Equipement divers", "catégorie de produits divers"));*/
		
		
		
		/*articleRepository.findAll().forEach(a->{
		System.out.println(a.getTitre()+" |"+a.getPrix());
		});*/
		
	}
}
