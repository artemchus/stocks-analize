package model;

import java.io.Serializable;
import java.util.HashMap;

public class ListBags implements Serializable {

    private Long portfolioId;
    private String portfolioName;
    private Long date = System.currentTimeMillis();
    private HashMap<Long, Double> investment = new HashMap<>();

    public ListBags(Long portfolioId, String portfolioName) {
        this.portfolioId = portfolioId;
        this.portfolioName = portfolioName;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public HashMap<Long, Double> getInvestment() {
        return this.investment;
    }

    public void setInvestment(Long calculatorId, Double sum) {
        this.investment.put(calculatorId, sum);
    }
}
