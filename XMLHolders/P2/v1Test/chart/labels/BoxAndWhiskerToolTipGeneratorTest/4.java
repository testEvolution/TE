@Test
    public void testSerialization() {
        BoxAndWhiskerToolTipGenerator g1 = new BoxAndWhiskerToolTipGenerator();
        BoxAndWhiskerToolTipGenerator g2 = (BoxAndWhiskerToolTipGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}