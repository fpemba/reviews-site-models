package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.models.CategoryStorage;

@Controller
@RequestMapping("categories")
public class CategoriesController {

    CategoryStorage storage;

    @RequestMapping(value = "")
    public String displayCategories(Model model) {
        model.addAttribute("categories", storage.getAll());
        return "categories";
    }


}

