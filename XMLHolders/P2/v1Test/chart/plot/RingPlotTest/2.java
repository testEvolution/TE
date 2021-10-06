@Test
    public void testSerialization() {
        RingPlot p1 = new RingPlot(null);
        GradientPaint gp = new GradientPaint(1.0f, 2.0f, Color.YELLOW,
                3.0f, 4.0f, Color.RED);
        p1.setSeparatorPaint(gp);
        RingPlot p2 = (RingPlot) TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

}