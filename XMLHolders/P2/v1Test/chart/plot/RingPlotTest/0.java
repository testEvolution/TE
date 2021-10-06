@Test
    public void testEquals() {

        RingPlot plot1 = new RingPlot(null);
        RingPlot plot2 = new RingPlot(null);
        assertTrue(plot1.equals(plot2));
        assertTrue(plot2.equals(plot1));

        plot1.setCenterTextMode(CenterTextMode.FIXED);
        assertFalse(plot1.equals(plot2));
        plot2.setCenterTextMode(CenterTextMode.FIXED);
        assertTrue(plot1.equals(plot2));

        plot1.setCenterText("ABC");
        assertFalse(plot1.equals(plot2));
        plot2.setCenterText("ABC");
        assertTrue(plot1.equals(plot2));
        
        plot1.setCenterTextColor(Color.RED);
        assertFalse(plot1.equals(plot2));
        plot2.setCenterTextColor(Color.RED);
        assertTrue(plot1.equals(plot2));
        
        plot1.setCenterTextFont(new Font(Font.SERIF, Font.PLAIN, 7));
        assertFalse(plot1.equals(plot2));
        plot2.setCenterTextFont(new Font(Font.SERIF, Font.PLAIN, 7));
        assertTrue(plot1.equals(plot2));

        plot1.setCenterTextFormatter(new DecimalFormat("0.000"));
        assertFalse(plot1.equals(plot2));
        plot2.setCenterTextFormatter(new DecimalFormat("0.000"));
        assertTrue(plot1.equals(plot2));
        
        // separatorsVisible
        plot1.setSeparatorsVisible(false);
        assertFalse(plot1.equals(plot2));
        plot2.setSeparatorsVisible(false);
        assertTrue(plot1.equals(plot2));

        // separatorStroke
        Stroke s = new BasicStroke(1.1f);
        plot1.setSeparatorStroke(s);
        assertFalse(plot1.equals(plot2));
        plot2.setSeparatorStroke(s);
        assertTrue(plot1.equals(plot2));

        // separatorPaint
        plot1.setSeparatorPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                2.0f, 1.0f, Color.BLUE));
        assertFalse(plot1.equals(plot2));
        plot2.setSeparatorPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                2.0f, 1.0f, Color.BLUE));
        assertTrue(plot1.equals(plot2));

        // innerSeparatorExtension
        plot1.setInnerSeparatorExtension(0.01);
        assertFalse(plot1.equals(plot2));
        plot2.setInnerSeparatorExtension(0.01);
        assertTrue(plot1.equals(plot2));

        // outerSeparatorExtension
        plot1.setOuterSeparatorExtension(0.02);
        assertFalse(plot1.equals(plot2));
        plot2.setOuterSeparatorExtension(0.02);
        assertTrue(plot1.equals(plot2));

        // sectionDepth
        plot1.setSectionDepth(0.12);
        assertFalse(plot1.equals(plot2));
        plot2.setSectionDepth(0.12);
        assertTrue(plot1.equals(plot2));
    }

    