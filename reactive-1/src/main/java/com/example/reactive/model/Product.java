package com.example.reactive.model;

import org.springframework.data.annotation.Id;

public record Product(@Id int id, String name) {
}
