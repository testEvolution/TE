@Test
    public void testSerialization() {
        StandardXYZToolTipGenerator g1 = new StandardXYZToolTipGenerator();
        StandardXYZToolTipGenerator g2 = (StandardXYZToolTipGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}