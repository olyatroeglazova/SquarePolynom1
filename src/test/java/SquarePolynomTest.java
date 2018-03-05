import org.junit.Test;

import static org.junit.Assert.*;

public class SquarePolynomTest {
    private SquarePolynom squarePolynom = new SquarePolynom();

    @Test
    public void solutionsOfSquarePolynomWhitOneRoot() throws Exception {
        double[] roots = {1.};
        double[] coef = {1., -2., 1.};
        squarePolynom.setCoefficients(coef);
        assertArrayEquals(roots, squarePolynom.solutions(), 0);
    }
    @Test
    public void solutionsOfSquarePolynomWhitTwoRoots() throws Exception {
        double[] roots = {0.5, -2.};
        double[] coef = {2., 3., -2.};
        squarePolynom.setCoefficients(coef);
        assertArrayEquals(roots, squarePolynom.solutions(), 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void solutionsOfSquarePolynomWhitoutRoots() {
        double[] coef = {1., 1., 8.};
        squarePolynom.setCoefficients(coef);
        squarePolynom.solutions();
    }
    @Test(expected = IllegalArgumentException.class)
    public void thisPolynomIsNotSquarePolynom() {
        double[] coef = {0., 1., 8.};
        squarePolynom.setCoefficients(coef);
        squarePolynom.solutions();
    }

}
