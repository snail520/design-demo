package com.design.demo.Strategy;

/**
 * Created by gaoxiang on 19/1/9.
 */
public class Context_SalesMan {
    private Strategy strategy;

    public Context_SalesMan(String festival){
        switch (festival){
            case "A":
                strategy = new StrategyA();
                break;
            case "B":
                strategy = new StrategyB();
                break;
            case "C":
                strategy = new StrategyC();
                break;
        }
    }

    public void SalesManShow(){
        strategy.Show();
    }
}
