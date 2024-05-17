package com.alurachallenge.conversordemoneda.models;

import java.util.HashMap;

public record Currency(String result,
                       String base_code,
                       HashMap<String,Float> conversion_rates) {
}

