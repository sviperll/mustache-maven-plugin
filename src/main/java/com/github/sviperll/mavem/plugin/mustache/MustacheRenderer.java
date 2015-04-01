/*
 * Copyright 2015 Victor Nazarov <asviraspossible@gmail.com>.
 */
package com.github.sviperll.mavem.plugin.mustache;

import com.github.mustachejava.Mustache;
import java.io.Writer;

/**
 *
 * @author Victor Nazarov <asviraspossible@gmail.com>
 */
public class MustacheRenderer {
    private final Writer writer;
    MustacheRenderer(Writer writer) {
        this.writer = writer;
    }

    void render(Mustache mustache, Object context) {
        mustache.execute(writer, context);
    }

}
