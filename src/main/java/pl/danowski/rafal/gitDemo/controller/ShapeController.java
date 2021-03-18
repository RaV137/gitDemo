package pl.danowski.rafal.gitDemo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.danowski.rafal.gitDemo.model.Shape;

import java.util.List;

@Slf4j
@RestController("/shape")
public class ShapeController {

    @GetMapping
    public List<Shape> getAllShapes() {
        return null;
    }
}
