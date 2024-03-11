package com.tredence.assignment.data.dto.outbound;

import java.util.Objects;

public class ShopperCategoryWithMaxScoreDTO {

    private String shopperId;
    private String category;
    private Double relevancyScore;

    public ShopperCategoryWithMaxScoreDTO(String shopperId, String category, Double relevancyScore) {
        this.shopperId = shopperId;
        this.category = category;
        this.relevancyScore = relevancyScore;
    }

    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getRelevancyScore() {
        return relevancyScore;
    }

    public void setRelevancyScore(Double relevancyScore) {
        this.relevancyScore = relevancyScore;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopperId, category, relevancyScore);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ShopperCategoryWithMaxScoreDTO))
            return false;
        ShopperCategoryWithMaxScoreDTO other = (ShopperCategoryWithMaxScoreDTO) obj;
        return Objects.equals(shopperId, other.shopperId) && Objects.equals(category, other.category)
                && Objects.equals(relevancyScore, other.relevancyScore);
    }
}
