public class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int input) {
        int n = input;
        int sum = (n*(n+1))/2;
        return sum*sum;
    }

    public int computeSumOfSquaresTo(int input) {
        int sum = (input*(input+1)*(2*input+1))/6;
        return sum;
    }

    public int computeDifferenceOfSquares(int input) {
        int sqSum = computeSquareOfSumTo(input);
        int sumSquare = computeSumOfSquaresTo(input);
        return sqSum - sumSquare;
    }

}
