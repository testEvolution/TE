@Test
    public void testSerialization2() {
        ThermometerPlot p1 = new ThermometerPlot();
        p1.setSubrangePaint(1, new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.BLUE));
        ThermometerPlot p2 = (ThermometerPlot) TestUtils.serialised(p1);
        assertTrue(p1.equals(p2));
    }

}