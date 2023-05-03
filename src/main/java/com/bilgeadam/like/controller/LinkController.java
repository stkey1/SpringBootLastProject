package com.bilgeadam.like.controller;

import com.bilgeadam.like.dto.LinkDto;
import com.bilgeadam.like.service.LinkService;
import com.bilgeadam.like.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class LinkController {

    private final LinkService linkService;
    private final UserService userService;

    public LinkController(LinkService  linkService, UserService userService) {

        this.linkService = linkService;
        this.userService = userService;
    }

    @GetMapping("/get-all-links")
    ResponseEntity<List<LinkDto>> allLinks() {

        return new ResponseEntity<>(linkService.findAll(), HttpStatus.OK);
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

    @GetMapping("/payment-action")
    void paymentAction(HttpSession session) {

        int spent = Integer.parseInt(session.getAttribute("price").toString());
        userService.makePayment(spent);
        session.removeAttribute("price");
    }
}