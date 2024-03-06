package com.tredence.assignment.dto.outbound;

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

}
