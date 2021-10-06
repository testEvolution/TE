@Test
    public void testEquals() {
        MeterPlot plot1 = new MeterPlot();
        MeterPlot plot2 = new MeterPlot();
        assertTrue(plot1.equals(plot2));

        // units
        plot1.setUnits("mph");
        assertFalse(plot1.equals(plot2));
        plot2.setUnits("mph");
        assertTrue(plot1.equals(plot2));

        // range
        plot1.setRange(new Range(50.0, 70.0));
        assertFalse(plot1.equals(plot2));
        plot2.setRange(new Range(50.0, 70.0));
        assertTrue(plot1.equals(plot2));

        // interval
        plot1.addInterval(new MeterInterval("Normal", new Range(55.0, 60.0)));
        assertFalse(plot1.equals(plot2));
        plot2.addInterval(new MeterInterval("Normal", new Range(55.0, 60.0)));
        assertTrue(plot1.equals(plot2));

        // dial outline paint
        plot1.setDialOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertFalse(plot1.equals(plot2));
        plot2.setDialOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertTrue(plot1.equals(plot2));

        // dial shape
        plot1.setDialShape(DialShape.CHORD);
        assertFalse(plot1.equals(plot2));
        plot2.setDialShape(DialShape.CHORD);
        assertTrue(plot1.equals(plot2));

        // dial background paint
        plot1.setDialBackgroundPaint(new GradientPaint(9.0f, 8.0f, Color.RED,
                7.0f, 6.0f, Color.BLUE));
        assertFalse(plot1.equals(plot2));
        plot2.setDialBackgroundPaint(new GradientPaint(9.0f, 8.0f, Color.RED,
                7.0f, 6.0f, Color.BLUE));
        assertTrue(plot1.equals(plot2));

        // dial outline paint
        plot1.setDialOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.GREEN,
                3.0f, 4.0f, Color.RED));
        assertFalse(plot1.equals(plot2));
        plot2.setDialOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.GREEN,
                3.0f, 4.0f, Color.RED));
        assertTrue(plot1.equals(plot2));

        // needle paint
        plot1.setNeedlePaint(new GradientPaint(9.0f, 8.0f, Color.RED,
                7.0f, 6.0f, Color.BLUE));
        assertFalse(plot1.equals(plot2));
        plot2.setNeedlePaint(new GradientPaint(9.0f, 8.0f, Color.RED,
                7.0f, 6.0f, Color.BLUE));
        assertTrue(plot1.equals(plot2));

        // value font
        plot1.setValueFont(new Font("Serif", Font.PLAIN, 6));
        assertFalse(plot1.equals(plot2));
        plot2.setValueFont(new Font("Serif", Font.PLAIN, 6));
        assertTrue(plot1.equals(plot2));

        // value paint
        plot1.setValuePaint(new GradientPaint(1.0f, 2.0f, Color.BLACK,
                3.0f, 4.0f, Color.WHITE));
        assertFalse(plot1.equals(plot2));
        plot2.setValuePaint(new GradientPaint(1.0f, 2.0f, Color.BLACK,
                3.0f, 4.0f, Color.WHITE));
        assertTrue(plot1.equals(plot2));

        // tick labels visible
        plot1.setTickLabelsVisible(false);
        assertFalse(plot1.equals(plot2));
        plot2.setTickLabelsVisible(false);
        assertTrue(plot1.equals(plot2));

        // tick label font
        plot1.setTickLabelFont(new Font("Serif", Font.PLAIN, 6));
        assertFalse(plot1.equals(plot2));
        plot2.setTickLabelFont(new Font("Serif", Font.PLAIN, 6));
        assertTrue(plot1.equals(plot2));

        // tick label paint
        plot1.setTickLabelPaint(Color.RED);
        assertFalse(plot1.equals(plot2));
        plot2.setTickLabelPaint(Color.RED);
        assertTrue(plot1.equals(plot2));

        // tick label format
        plot1.setTickLabelFormat(new DecimalFormat("0"));
        assertFalse(plot1.equals(plot2));
        plot2.setTickLabelFormat(new DecimalFormat("0"));
        assertTrue(plot1.equals(plot2));

        // tick paint
        plot1.setTickPaint(Color.GREEN);
        assertFalse(plot1.equals(plot2));
        plot2.setTickPaint(Color.GREEN);
        assertTrue(plot1.equals(plot2));

        // tick size
        plot1.setTickSize(1.23);
        assertFalse(plot1.equals(plot2));
        plot2.setTickSize(1.23);
        assertTrue(plot1.equals(plot2));

        // draw border
        plot1.setDrawBorder(!plot1.getDrawBorder());
        assertFalse(plot1.equals(plot2));
        plot2.setDrawBorder(plot1.getDrawBorder());
        assertTrue(plot1.equals(plot2));

        // meter angle
        plot1.setMeterAngle(22);
        assertFalse(plot1.equals(plot2));
        plot2.setMeterAngle(22);
        assertTrue(plot1.equals(plot2));

    }

    