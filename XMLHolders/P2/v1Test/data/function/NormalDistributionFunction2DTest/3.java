@Test
    public void testHashCode() {
        NormalDistributionFunction2D f1 = new NormalDistributionFunction2D(1.0,
                2.0);
        NormalDistributionFunction2D f2 = new NormalDistributionFunction2D(1.0,
                2.0);
        assertEquals(f1.hashCode(), f2.hashCode());
    }

}