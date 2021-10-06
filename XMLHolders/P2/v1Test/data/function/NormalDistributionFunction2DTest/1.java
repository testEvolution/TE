@Test
    public void testEquals() {
        NormalDistributionFunction2D f1 = new NormalDistributionFunction2D(1.0,
                2.0);
        NormalDistributionFunction2D f2 = new NormalDistributionFunction2D(1.0,
                2.0);
        assertEquals(f1, f2);
        f1 = new NormalDistributionFunction2D(2.0, 3.0);
        assertNotEquals(f1, f2);
        f2 = new NormalDistributionFunction2D(2.0, 3.0);
        assertEquals(f1, f2);
    }

    