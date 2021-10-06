@Test
    public void testSerialization() {
        MultiplePiePlot p1 = new MultiplePiePlot(null);
        p1.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.YELLOW,
                3.0f, 4.0f, Color.RED));
        MultiplePiePlot p2 = (MultiplePiePlot) TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

    