@Test
    public void testSerialization() {
        BoxAndWhiskerXYToolTipGenerator g1
                = new BoxAndWhiskerXYToolTipGenerator();
        BoxAndWhiskerXYToolTipGenerator g2 = (BoxAndWhiskerXYToolTipGenerator) TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}