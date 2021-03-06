package com.harium.keel.core;

import com.harium.keel.core.source.ImageSource;

public interface Exporter<T> {
    T export(ImageSource source);
}
