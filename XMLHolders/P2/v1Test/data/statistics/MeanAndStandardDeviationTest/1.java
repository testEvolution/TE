@Test
    public void testCloning() {
        MeanAndStandardDeviation m1 = new MeanAndStandardDeviation(1.2, 3.4);
        assertFalse(m1 instanceof Cloneable);
    }

    