@Test
    public void testSerialization() {
        StandardPieToolTipGenerator g1 = new StandardPieToolTipGenerator();
        StandardPieToolTipGenerator g2 = (StandardPieToolTipGenerator)
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}