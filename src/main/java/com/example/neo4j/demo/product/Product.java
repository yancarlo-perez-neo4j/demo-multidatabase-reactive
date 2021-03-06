package com.example.neo4j.demo.product;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Product {
    /**
     * Neo4j internally generated id.
     */
    @Id
    @GeneratedValue
    private Long id;

    private final String description;

    Product(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                '}';
    }
}
