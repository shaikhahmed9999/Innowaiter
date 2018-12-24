package Ideabook.Application.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

@Autowired
private CategoryRepository categoryRepository;

@RequestMapping(value = "/Add", method = RequestMethod.POST)
public Category addcategory(@RequestBody Category category)
{
return categoryRepository.save(category);	
}

}
