package be.ehb.project.Controller;

import be.ehb.project.Repositroy.CategoryRepository;
import be.ehb.project.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {

    private CategoryRepository categoryService;

    @Autowired
    public CategoryController(CategoryRepository categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public Iterable<Category> getAllCategories() {
        return categoryService.findAll();
    }

    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categoryService.findById(id).get();
    }
/*
    @GetMapping("/categories/{name}")
    public Iterable<Category> getCategoryByName(@PathVariable Category category) {
        return categoryService.findCategoryByName(category);

    }
*/
    /*
    @PostMapping("/categories")
    public Category addCategory(Category category) {
        return categoryService.save(category);
    }

    @PostMapping("/categories/{id}")
    public Category updateCategory(@PathVariable int id, Category category) {
        return categoryService.save(category);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable int id) {
        categoryService.deleteById(id);
    }

    @DeleteMapping("/categories/{name}")
    public void deleteCategory(@PathVariable Category name) {
        categoryService.deleteByName(name);
    }

*/
}
