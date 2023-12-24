package org.example.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/game")
public class GameController {
    @Autowired
    private ScoreRepository scoreRepository;

    @Autowired
    private UserRepository userRepository;

    // Oyun ile ilgili endpoint'leri buraya ekleyin

    @PostMapping("/saveScore")
    public void saveScore(@RequestBody ScoreRequest scoreRequest) {
        // Kullanıcıyı veritabanından çek
        User user = userRepository.findById(scoreRequest.getUserId())
                .orElseThrow(() -> new RuntimeException("Kullanıcı bulunamadı."));

        // Skoru veritabanına kaydet
        score score = new score();
        score.setUser(user);
        score.setPoints(scoreRequest.getPoints());
        scoreRepository.save(score);
    }
}
