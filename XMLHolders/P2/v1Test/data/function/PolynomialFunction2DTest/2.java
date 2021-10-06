@Test
    public void testGetOrder() {
        PolynomialFunction2D f = new PolynomialFunction2D(new double[] {1.0,
                2.0});
        assertEquals(1, f.getOrder());
    }

    