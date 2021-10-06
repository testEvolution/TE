@Test
    public void testEquals() {
        PolynomialFunction2D f1 = new PolynomialFunction2D(new double[] {1.0,
                2.0});
        PolynomialFunction2D f2 = new PolynomialFunction2D(new double[] {1.0,
                2.0});
        assertTrue(f1.equals(f2));
        f1 = new PolynomialFunction2D(new double[] {2.0, 3.0});
        assertFalse(f1.equals(f2));
        f2 = new PolynomialFunction2D(new double[] {2.0, 3.0});
        assertTrue(f1.equals(f2));
    }

    