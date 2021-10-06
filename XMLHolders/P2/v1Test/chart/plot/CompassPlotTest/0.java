@Test
    public void testEquals() {
        CompassPlot plot1 = new CompassPlot();
        CompassPlot plot2 = new CompassPlot();
        assertTrue(plot1.equals(plot2));

        // labelType...
        plot1.setLabelType(CompassPlot.VALUE_LABELS);
        assertFalse(plot1.equals(plot2));
        plot2.setLabelType(CompassPlot.VALUE_LABELS);
        assertTrue(plot1.equals(plot2));

        // labelFont
        plot1.setLabelFont(new Font("Serif", Font.PLAIN, 10));
        assertFalse(plot1.equals(plot2));
        plot2.setLabelFont(new Font("Serif", Font.PLAIN, 10));
        assertTrue(plot1.equals(plot2));

        // drawBorder
        plot1.setDrawBorder(true);
        assertFalse(plot1.equals(plot2));
        plot2.setDrawBorder(true);
        assertTrue(plot1.equals(plot2));

        // rosePaint
        plot1.setRosePaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.YELLOW));
        assertFalse(plot1.equals(plot2));
        plot2.setRosePaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.YELLOW));
        assertTrue(plot1.equals(plot2));

        // roseCenterPaint
        plot1.setRoseCenterPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW));
        assertFalse(plot1.equals(plot2));
        plot2.setRoseCenterPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW));
        assertTrue(plot1.equals(plot2));

        // roseHighlightPaint
        plot1.setRoseHighlightPaint(new GradientPaint(1.0f, 2.0f, Color.GREEN,
                3.0f, 4.0f, Color.YELLOW));
        assertFalse(plot1.equals(plot2));
        plot2.setRoseHighlightPaint(new GradientPaint(1.0f, 2.0f, Color.GREEN,
                3.0f, 4.0f, Color.YELLOW));
        assertTrue(plot1.equals(plot2));
    }

    