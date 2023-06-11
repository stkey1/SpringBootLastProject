package com.bilgeadam.like.controller;
/**
 * @author stkey
 * @since 29.03.2023
 */
import com.bilgeadam.like.dto.LinkDto;
import com.bilgeadam.like.service.LinkService;
import com.bilgeadam.like.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LinkController {

    private final LinkService linkService;
    private final UserService userService;
    private final List<String> links = new ArrayList<>();
    private final List<String> links1 = new ArrayList<>();
    private final List<String> links2 = new ArrayList<>();
    private final List<String> links3 = new ArrayList<>();

    public LinkController(LinkService linkService, UserService userService) {
        this.linkService = linkService;
        this.userService = userService;
    }

    @GetMapping("/get-all-links")
    ResponseEntity<List<LinkDto>> allLinks() {
        return new ResponseEntity<>(linkService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/addLink")
    public String addLink(@RequestParam("newLink") String newLink) {
        if (!newLink.isEmpty()) {
            links.add(newLink);
        }

        return "redirect:/welcome";
    }

    @GetMapping("/showLinks")
    public String showLinkContent(@RequestParam("link") String link, Model model) {
        model.addAttribute("link", link);
        return "showLinks";
    }

    @GetMapping("/get-by-category")
    ResponseEntity<List<LinkDto>> getByCategory(@RequestParam("categoryName") String categoryName) {
        return new ResponseEntity<>(linkService.findByCategory(categoryName), HttpStatus.OK);
    }

    @GetMapping("/search-links-by-name")
    ResponseEntity<LinkDto> getByName(@RequestParam("name") String name) {
        return new ResponseEntity<>(linkService.findByName(name), HttpStatus.OK);
    }

    @PostMapping("/add-link")
    ResponseEntity<LinkDto> addLink(@RequestBody LinkDto linkDto) {
        return new ResponseEntity<>(linkService.saveLink(linkDto), HttpStatus.CREATED);
    }
    @GetMapping("/showAdd")
    public String showAddPage(Model model) {

        return "showAdd";
    }

    @GetMapping("/payment-action")
    void paymentAction(HttpSession session) {
        int spent = Integer.parseInt(session.getAttribute("price").toString());
        userService.makePayment(spent);
        session.removeAttribute("price");
    }

    @GetMapping("/welcome")
    public String showWelcomePage(Model model) {
        // Statik linkleri links listesine ekleyebilirsiniz
        links.add("www.booking.com");
        links.add("www.tripadvisor.com");
        links.add("www.airbnb.com");

        model.addAttribute("links", links);
        model.addAttribute("newLink", ""); // Yeni link ekleme alanının başlangıç değeri boş

        return "welcome";
    }

    @GetMapping("/culture")
    public String showCulturePage(Model model) {
        // Statik linkleri links listesine ekleyebilirsiniz
        links1.add("www.nationalgeographic.com");
        links1.add("www.smithsonianmag.com");
        links1.add("www.bbc.com/culture");

        model.addAttribute("links", links1);
        model.addAttribute("newLink", ""); // Yeni link ekleme alanının başlangıç değeri boş

        return "culture";
    }

    @GetMapping("/art")
    public String showArtPage(Model model) {
        // Statik linkleri links listesine ekleyebilirsiniz
        links2.add("www.artsy.net");
        links2.add("www.artnet.com");
        links2.add("www.artstation.com");

        model.addAttribute("links", links2);
        model.addAttribute("newLink", ""); // Yeni link ekleme alanının başlangıç değeri boş

        return "art";
    }

    @GetMapping("/history")
    public String showHistoryPage(Model model) {
        // Statik linkleri links listesine ekleyebilirsiniz
        links3.add("www.history.com");
        links3.add("www.nationalgeographic.com/history");
        links3.add("www.historychannel.com");

        model.addAttribute("links", links3);
        model.addAttribute("newLink", ""); // Yeni link ekleme alanının başlangıç değeri boş

        return "history";
    }

}
