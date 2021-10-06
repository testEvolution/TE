@Test
    public void testEquals() {
        ThermometerPlot p1 = new ThermometerPlot();
        ThermometerPlot p2 = new ThermometerPlot();
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));

        // padding
        p1.setPadding(new RectangleInsets(1.0, 2.0, 3.0, 4.0));
        assertFalse(p1.equals(p2));
        p2.setPadding(new RectangleInsets(1.0, 2.0, 3.0, 4.0));
        assertTrue(p2.equals(p1));

        // thermometerStroke
        BasicStroke s = new BasicStroke(1.23f);
        p1.setThermometerStroke(s);
        assertFalse(p1.equals(p2));
        p2.setThermometerStroke(s);
        assertTrue(p2.equals(p1));

        // thermometerPaint
        p1.setThermometerPaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.RED));
        assertFalse(p1.equals(p2));
        p2.setThermometerPaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.RED));
        assertTrue(p2.equals(p1));

        // units
        p1.setUnits(ThermometerPlot.UNITS_KELVIN);
        assertFalse(p1.equals(p2));
        p2.setUnits(ThermometerPlot.UNITS_KELVIN);
        assertTrue(p2.equals(p1));

        // valueLocation
        p1.setValueLocation(ThermometerPlot.LEFT);
        assertFalse(p1.equals(p2));
        p2.setValueLocation(ThermometerPlot.LEFT);
        assertTrue(p2.equals(p1));

        // axisLocation
        p1.setAxisLocation(ThermometerPlot.RIGHT);
        assertFalse(p1.equals(p2));
        p2.setAxisLocation(ThermometerPlot.RIGHT);
        assertTrue(p2.equals(p1));

        // valueFont
        p1.setValueFont(new Font("Serif", Font.PLAIN, 9));
        assertFalse(p1.equals(p2));
        p2.setValueFont(new Font("Serif", Font.PLAIN, 9));
        assertTrue(p2.equals(p1));

        // valuePaint
        p1.setValuePaint(new GradientPaint(4.0f, 5.0f, Color.RED,
                6.0f, 7.0f, Color.WHITE));
        assertFalse(p1.equals(p2));
        p2.setValuePaint(new GradientPaint(4.0f, 5.0f, Color.RED,
                6.0f, 7.0f, Color.WHITE));
        assertTrue(p2.equals(p1));

        // valueFormat
        p1.setValueFormat(new DecimalFormat("0.0000"));
        assertFalse(p1.equals(p2));
        p2.setValueFormat(new DecimalFormat("0.0000"));
        assertTrue(p2.equals(p1));

        // mercuryPaint
        p1.setMercuryPaint(new GradientPaint(9.0f, 8.0f, Color.RED,
                7.0f, 6.0f, Color.BLUE));
        assertFalse(p1.equals(p2));
        p2.setMercuryPaint(new GradientPaint(9.0f, 8.0f, Color.RED,
                7.0f, 6.0f, Color.BLUE));
        assertTrue(p2.equals(p1));

        p1.setSubrange(1, 1.0, 2.0);
        assertFalse(p1.equals(p2));
        p2.setSubrange(1, 1.0, 2.0);
        assertTrue(p2.equals(p1));

        p1.setSubrangePaint(1, new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW));
        assertFalse(p1.equals(p2));
        p2.setSubrangePaint(1, new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW));
        assertTrue(p2.equals(p1));

        p1.setBulbRadius(9);
        assertFalse(p1.equals(p2));
        p2.setBulbRadius(9);
        assertTrue(p2.equals(p1));

        p1.setColumnRadius(8);
        assertFalse(p1.equals(p2));
        p2.setColumnRadius(8);
        assertTrue(p2.equals(p1));

        p1.setGap(7);
        assertFalse(p1.equals(p2));
        p2.setGap(7);
        assertTrue(p2.equals(p1));
    }

    