package pl.danowski.rafal.gitDemo.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Shape {
    protected final Color color;

    public abstract String draw();
}
