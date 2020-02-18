package org.wecancodeit.reviews;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancodeit.reviews.models.ReviewStorage;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class WebLayerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    ReviewStorage mockStorage;
//    @Test
//    public void reviewsShouldBeOKAndReturnTheReviewViewWithReviewsModelAttribute() throws Exception {
//        mockMvc.perform(get("/reviews"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(view().name("reviewView"))
//                .andExpect(model().attributeExists("reviews"));
//    }

    @Test
    public void categoriesShouldBeOKAndReturnTheCategoryViewWithCategoriesModelAttribute() throws Exception {
        mockMvc.perform(get("/categories"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("categories"))
                .andExpect(model().attributeExists("title"));
    }

    @Test
    public void reviewsShouldBeOKAndReturnTheReviewViewWithReviewsModelAttribute() throws Exception {
        mockMvc.perform(get("/hashtags"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("hashtags"))
                .andExpect(model().attributeExists("title"));
    }

}
