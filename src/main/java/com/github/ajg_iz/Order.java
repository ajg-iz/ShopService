package com.github.ajg_iz;

import java.util.List;

public record Order(int ID, List<Product> products) {
}
