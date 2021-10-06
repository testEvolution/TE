@Test
    public void testSerialization() {
        PlotOrientation orientation1 = PlotOrientation.HORIZONTAL;
        PlotOrientation orientation2 = (PlotOrientation) 
                TestUtils.serialised(orientation1);
        assertEquals(orientation1, orientation2);
        boolean same = orientation1 == orientation2;
        assertEquals(true, same);
    }

}