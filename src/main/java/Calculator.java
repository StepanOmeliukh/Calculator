
class Calculator {

    public Double sum(Double first, Double second) {
        Double sum = first + second;
        System.out.printf("Result: %2.2f\n", sum);
        return sum;
    }

    public Double sub(Double first, Double second) {
        Double sub = first - second;
        System.out.printf("Result: %2.2f\n", sub);
        return sub;
    }

    public Double div(Double first, Double second) {
        if (second == 0)
            throw new IllegalArgumentException("You can't divide on zero");
        Double div = first / second;
        System.out.printf("Result: %2.2f\n", div);
        return div;
    }

    public Double mul(Double first, Double second) {
        Double mul = first * second;
        System.out.printf("Result: %2.2f\n", mul);
        return mul;
    }
}