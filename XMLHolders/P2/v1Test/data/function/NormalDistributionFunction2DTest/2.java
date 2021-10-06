@Test
    public void testSerialization() {
        NormalDistributionFunction2D f1 = new NormalDistributionFunction2D(1.0,
                2.0);
        NormalDistributionFunction2D f2 = (NormalDistributionFunction2D) 
                TestUtils.serialised(f1);
        assertEquals(f1, f2);
    }

    