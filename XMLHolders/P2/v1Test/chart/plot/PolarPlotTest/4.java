@Test
    public void testSerialization() {
        PolarPlot p1 = new PolarPlot();
        p1.setAngleGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.BLUE));
        p1.setAngleLabelPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.BLUE));
        p1.setRadiusGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.BLUE));
        PolarPlot p2 = (PolarPlot) TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

    