@Test
    public void testSerialization() {
        StandardXYToolTipGenerator g1 = new StandardXYToolTipGenerator();
        StandardXYToolTipGenerator g2 = (StandardXYToolTipGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}