package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("categories")
public class CategoriesController {

    @RequestMapping(value = "")
    public String displayCategories(Model model) {
        model.addAttribute("title", "categories");
        return "categories";
    }


}
