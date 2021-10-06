@Test
    public void testGetCoefficients() {
        PolynomialFunction2D f = new PolynomialFunction2D(new double[] {1.0,
                2.0});
        double[] c = f.getCoefficients();
        assertTrue(Arrays.equals(new double[] {1.0, 2.0}, c));

        // make sure that modifying the returned array doesn't change the
        // function
        c[0] = 99.9;
        assertTrue(Arrays.equals(new double[] {1.0, 2.0}, f.getCoefficients()));
    }

    