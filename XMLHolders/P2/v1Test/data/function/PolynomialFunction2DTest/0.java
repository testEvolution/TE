@Test
    public void testConstructor() {
        PolynomialFunction2D f = new PolynomialFunction2D(new double[] {1.0,
                2.0});
        assertTrue(Arrays.equals(new double[] {1.0, 2.0}, f.getCoefficients()));

        boolean pass = false;
        try {
            f = new PolynomialFunction2D(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    