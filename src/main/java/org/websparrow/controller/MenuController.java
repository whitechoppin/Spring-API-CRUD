package org.websparrow.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.websparrow.entity.Menu;
import org.websparrow.repository.MenuRepository;
import org.websparrow.repository.UserRepository;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuRepository menuRepository;
    UserRepository userRepository;

    @PostMapping("/add")
    public Menu addMenu(@RequestBody Menu menu) {

        return menuRepository.save(menu);
    }

    @GetMapping("/all")
    public Iterable<Menu> allMenu() {

        return menuRepository.findAll();
    }

    @GetMapping("/{menuId}")
    public Optional<Menu> userById(@PathVariable("menuId") int menuId) {

        return menuRepository.findById(menuId);
    }

    @PutMapping("/update")
    public Menu updateMenu(@RequestBody Menu menu) {

        return menuRepository.save(menu);
    }

    @DeleteMapping("/{menuId}")
    public void deleteMenu(@PathVariable("menuId") int menuId) {

        menuRepository.deleteById(menuId);
    }


}
