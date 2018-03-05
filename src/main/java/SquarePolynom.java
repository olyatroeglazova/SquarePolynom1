public class SquarePolynom {
    private double[] coefficients;
    private double[] roots;

    SquarePolynom() {
        coefficients = new double[3];
    }

    public SquarePolynom(double[] coefficients) {
        this.coefficients = coefficients;
    }

    private double discriminant() {
        double d = coefficients[1] * coefficients[1] - 4 * coefficients[0] * coefficients[2];
        if (d < 0)
            throw new IllegalArgumentException("Дискриминант меньше нуля. Корней нет!");
        return d;
    }

    public double[] solutions() {
        if (this.discriminant() == 0) {
            roots = new double[1];
            roots[0] = -coefficients[1] / (coefficients[0] * 2);
        } else {
            roots = new double[2];
            roots[0] = (-coefficients[1] + Math.sqrt(this.discriminant())) / (coefficients[0] * 2);
            roots[1] = (-coefficients[1] - Math.sqrt(this.discriminant())) / (coefficients[0] * 2);
        }
        return roots;
    }

    public void setCoefficients(double[] coefficients) {
        this.coefficients = coefficients;
        if (coefficients[0] == 0) {
            throw new IllegalArgumentException("Это не квадратное уравнение!");
        }
    }

    public double getRoot(int i) {
        return roots[i];
    }
}