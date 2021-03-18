package pl.danowski.rafal.gitDemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.danowski.rafal.gitDemo.model.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController("/shape")
public class ShapeController {

    @GetMapping
    public List<Shape> getAllShapes() {
        final var shapes = new ArrayList<Shape>();
        shapes.add(new Square(new RedColor()));
        shapes.add(new Rectangle(new BlueColor()));

        shapes.forEach(s -> log.info(s.draw()));

        return shapes;
    }
}
