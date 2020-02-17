package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.models.Review;
import org.wecancodeit.reviews.models.ReviewStorage;


@Controller
@RequestMapping("shoes/reviews")
public class ReviewController {

    private ReviewStorage reviews;

    public ReviewController(ReviewStorage reviews) {
        this.reviews = reviews;
    }

    @RequestMapping(value = "") //root path
    public String index(Model model) {

        model.addAttribute("reviews", reviews.getAll());
        model.addAttribute("title", "Shoe's Reviews");
        return "index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addReviewForm(Model model) {
        model.addAttribute("title", "Add Review");
        return "add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddReviewForm(@RequestParam("reviewName") String reviewName, @RequestParam("reviewDescription") String reviewDescription, Model model) {
        reviews.add(new Review(reviewName, reviewDescription));
        model.addAttribute("");
        return "redirect:";
    }
}





