@Test
    public void testConstructor() {
        NormalDistributionFunction2D f = new NormalDistributionFunction2D(1.0,
                2.0);
        assertEquals(1.0, f.getMean(), EPSILON);
        assertEquals(2.0, f.getStandardDeviation(), EPSILON);
    }

    