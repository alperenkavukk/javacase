package org.example.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    public BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public void registerUser(@RequestBody User user) {

        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            throw new RuntimeException("Bu kullanıcı adı zaten kullanılıyor.");
        }


        user.setPassword(passwordEncoder.encode(user.getPassword()));

        userRepository.save(user);
    }

    // Kullanıcı girişi endpoint'i buraya eklenebilir
}
