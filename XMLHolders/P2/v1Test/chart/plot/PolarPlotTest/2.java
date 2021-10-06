@Test
    public void testEquals() {
        PolarPlot plot1 = new PolarPlot();
        PolarPlot plot2 = new PolarPlot();
        assertTrue(plot1.equals(plot2));
        assertTrue(plot2.equals(plot1));

        plot1.setAngleGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertFalse(plot1.equals(plot2));
        plot2.setAngleGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertTrue(plot1.equals(plot2));

        Stroke s = new BasicStroke(1.23f);
        plot1.setAngleGridlineStroke(s);
        assertFalse(plot1.equals(plot2));
        plot2.setAngleGridlineStroke(s);
        assertTrue(plot1.equals(plot2));

        plot1.setAngleTickUnit(new NumberTickUnit(11.0));
        assertFalse(plot1.equals(plot2));
        plot2.setAngleTickUnit(new NumberTickUnit(11.0));
        assertTrue(plot1.equals(plot2));

        plot1.setAngleGridlinesVisible(false);
        assertFalse(plot1.equals(plot2));
        plot2.setAngleGridlinesVisible(false);
        assertTrue(plot1.equals(plot2));

        plot1.setAngleLabelFont(new Font("Serif", Font.PLAIN, 9));
        assertFalse(plot1.equals(plot2));
        plot2.setAngleLabelFont(new Font("Serif", Font.PLAIN, 9));
        assertTrue(plot1.equals(plot2));

        plot1.setAngleLabelPaint(new GradientPaint(9.0f, 8.0f, Color.BLUE,
                7.0f, 6.0f, Color.RED));
        assertFalse(plot1.equals(plot2));
        plot2.setAngleLabelPaint(new GradientPaint(9.0f, 8.0f, Color.BLUE,
                7.0f, 6.0f, Color.RED));
        assertTrue(plot1.equals(plot2));

        plot1.setAngleLabelsVisible(false);
        assertFalse(plot1.equals(plot2));
        plot2.setAngleLabelsVisible(false);
        assertTrue(plot1.equals(plot2));

        plot1.setAxis(new NumberAxis("Test"));
        assertFalse(plot1.equals(plot2));
        plot2.setAxis(new NumberAxis("Test"));
        assertTrue(plot1.equals(plot2));

        plot1.setRadiusGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.BLACK));
        assertFalse(plot1.equals(plot2));
        plot2.setRadiusGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.BLACK));
        assertTrue(plot1.equals(plot2));

        plot1.setRadiusGridlineStroke(s);
        assertFalse(plot1.equals(plot2));
        plot2.setRadiusGridlineStroke(s);
        assertTrue(plot1.equals(plot2));

        plot1.setRadiusGridlinesVisible(false);
        assertFalse(plot1.equals(plot2));
        plot2.setRadiusGridlinesVisible(false);
        assertTrue(plot1.equals(plot2));

        plot1.setRadiusMinorGridlinesVisible(false);
        assertFalse(plot1.equals(plot2));
        plot2.setRadiusMinorGridlinesVisible(false);
        assertTrue(plot1.equals(plot2));

        plot1.addCornerTextItem("XYZ");
        assertFalse(plot1.equals(plot2));
        plot2.addCornerTextItem("XYZ");
        assertTrue(plot1.equals(plot2));

        plot1.setMargin(6);
        assertFalse(plot1.equals(plot2));
        plot2.setMargin(6);
        assertTrue(plot1.equals(plot2));

        LegendItemCollection lic1 = new LegendItemCollection();
        lic1.add(new LegendItem("XYZ", Color.RED));
        plot1.setFixedLegendItems(lic1);
        assertFalse(plot1.equals(plot2));
        LegendItemCollection lic2 = new LegendItemCollection();
        lic2.add(new LegendItem("XYZ", Color.RED));
        plot2.setFixedLegendItems(lic2);
        assertTrue(plot1.equals(plot2));
    }

    