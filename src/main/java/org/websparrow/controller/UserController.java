package org.websparrow.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.websparrow.entity.Menu;
import org.websparrow.entity.User;
import org.websparrow.repository.MenuRepository;
import org.websparrow.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    MenuRepository menuRepository;

    // insert new country into database
    @PostMapping("/add")
    public User addUser(@RequestBody User user) {

        return userRepository.save(user);
    }

    // fetch all country list from database
    @GetMapping("/all")
    public Iterable<User> allUser() {

        return userRepository.findAll();
    }

    // fetch specific country by their ID
    @GetMapping("/{userId}")
    public Optional<User> userById(@PathVariable("userId") int userId) {

        return userRepository.findById(userId);
    }

    // update existing country
    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {

        return userRepository.save(user);
    }

    // delete country from database
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") int userId) {

        userRepository.deleteById(userId);
    }

    @GetMapping("/usermenu/{userId}")
    public ResponseEntity<?> userMenuById(@PathVariable("userId") int userId) {

        List<Menu> menuList = new ArrayList<>();
        User user = userRepository.findById(userId).get();
        Menu menuChoose = new Menu();

        if (user != null) {
            int x = user.getUserTipe().length();
            for (int i = 0; i < x; i++) {
                int n = Character.getNumericValue(user.getUserTipe().charAt(i));
                menuChoose = menuRepository.findById(n).get();
                if(menuChoose != null){
                    menuList.add(menuChoose);
                }
            }
        }

        return new ResponseEntity<Object>(menuList, HttpStatus.OK);
    }

}
