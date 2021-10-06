@Test
    public void testSerialization() {
        PolynomialFunction2D f1 = new PolynomialFunction2D(new double[] {1.0,
                2.0});
        PolynomialFunction2D f2 = (PolynomialFunction2D) 
                TestUtils.serialised(f1);
        assertEquals(f1, f2);
    }

    