package tech.zerofiltre.testing.calcul.domain.model;

public class Calculation {

    private String calculationType;

    private Integer leftArgument;

    private Integer rightArgument;

    public String getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(String calculationType){
        this.calculationType = calculationType;
    }

    public Integer getLeftArgument() {
        return leftArgument;
    }

    public void setLeftArgument(Integer leftArgument) {
        this.leftArgument = leftArgument;
    }

    public Integer getRightArgument() {
        return rightArgument;
    }

    public void setRightArgument(Integer rightArgument) {
        this.rightArgument = rightArgument;
    }
}
