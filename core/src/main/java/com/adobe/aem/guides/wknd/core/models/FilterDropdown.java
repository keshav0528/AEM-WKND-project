package com.adobe.aem.guides.wknd.core.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FilterDropdown {

        public static class Product {
                private String name;
                private double price;
                private String category;

                public String getName() {
                        return name;
                }

                public void setName(String name) {
                        this.name = name;
                }

                public double getPrice() {
                        return price;
                }

                public void setPrice(double price) {
                        this.price = price;
                }

                public String getCategory() {
                        return category;
                }

                public void setCategory(String category) {
                        this.category = category;
                }

        }

        public List<Product> getFilteredAndSortedProducts(String sortBy) {

                List<Product> products = getProductListFromDataSource();

                switch (sortBy) {
                        case "name":
                                Collections.sort(products, Comparator.comparing(Product::getName));
                                break;
                        case "price":
                                Collections.sort(products, Comparator.comparing(Product::getPrice));
                                break;
                        case "category":
                                Collections.sort(products, Comparator.comparing(Product::getCategory));
                                break;

                }

                return products;
        }

        private List<Product> getProductListFromDataSource() {

                return new ArrayList<>();
        }
}
