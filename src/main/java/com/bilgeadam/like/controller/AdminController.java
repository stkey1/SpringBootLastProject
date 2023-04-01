package com.bilgeadam.like.controller;

import com.bilgeadam.like.dto.LinkDto;
import com.bilgeadam.like.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

    @RequestMapping(value = "/dashboard", method = {RequestMethod.GET, RequestMethod.POST})
    public String showDashboardPage() {

        return "admin/Dashboard";
    }

    @RequestMapping(value = "/manage-roles", method = {RequestMethod.GET, RequestMethod.POST})
    public String showManageRolesPage() {

        return "admin/ManageRoles";
    }

    @RequestMapping(value = "/manage-user", method = {RequestMethod.GET, RequestMethod.POST})
    public String showManageUserPage() {

        return "admin/ManageUser";
    }

    @RequestMapping(value = "/add-user", method = {RequestMethod.GET, RequestMethod.POST})
    public String showAddUserPage(@ModelAttribute(value = "user") UserDto userDto) {

        return "admin/AddUser";
    }

    @RequestMapping(value = "/manage-link", method = {RequestMethod.GET, RequestMethod.POST})
    public String showManageLinkPage() {

        return "admin/ManageLink";
    }

    @RequestMapping(value = "/add-link", method = {RequestMethod.GET, RequestMethod.POST})
    //LinkDto
    public String showAddLinkPage(@ModelAttribute("link") LinkDto linkDto) {

        return "admin/AddLink";
    }
}