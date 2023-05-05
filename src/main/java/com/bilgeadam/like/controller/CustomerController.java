package com.bilgeadam.like.controller;

import com.bilgeadam.like.dto.UserDto;
import com.bilgeadam.like.service.LinkService;
import com.bilgeadam.like.service.PointService;
import com.bilgeadam.like.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.security.Principal;
import java.util.UUID;

@Controller
//@RequestMapping("/customer")
public class CustomerController {
    private final UserService userService;
    private final LinkService linkService;
    private final PointService pointService;

@Autowired
    public CustomerController(UserService userService,
                              LinkService linkService,
                              PointService pointService) {
        this.userService = userService;
        this.linkService = linkService;
        this.pointService = pointService;
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping(value = "/profile", method = {RequestMethod.GET, RequestMethod.POST})
    public String showProfilePage(Principal principal, Model model) {

        UserDto user = userService.findByUsername(principal.getName());
        model.addAttribute("user", user);

        return "customer/Profile";
    }

    @RequestMapping(value = "/profile-modify", method = {RequestMethod.GET, RequestMethod.POST})
    public String showProfileModifyPage(Principal principal, Model model) {

        UserDto user = userService.findByUsername(principal.getName());
        user.setPassword("");
        model.addAttribute("user", user);

        return "customer/ProfileModify";
    }

    @RequestMapping("/profile-modify-action")
    public String profileModifyAction(@Valid @ModelAttribute("user") UserDto updatedUser,
                                      BindingResult bindingResult,
                                      Principal principal) {

        if (bindingResult.hasFieldErrors("email") || bindingResult.hasFieldErrors("password")
                || bindingResult.hasFieldErrors("phoneNumber")) {
            return "redirect:/profile-modify?error";
        }

        UserDto userDto = userService.findByUsername(principal.getName());
        userDto.setEmail(updatedUser.getEmail());
        userDto.setPassword(updatedUser.getPassword());
        userDto.setPhoneNumber(updatedUser.getPhoneNumber());
        userService.saveUser(userDto);

        return "redirect:/profile?updated";
    }

    @GetMapping("/getUserById/{id}")
    UserDto getUserById(@PathVariable UUID id) {

        return userService.findById(id);
    }



}