@Test
    public void testEquals() {
        JFreeChart chart1 = new JFreeChart("Title",
                new Font("SansSerif", Font.PLAIN, 12), new PiePlot(), true);
        JFreeChart chart2 = new JFreeChart("Title",
                new Font("SansSerif", Font.PLAIN, 12), new PiePlot(), true);
        assertEquals(chart1, chart2);
        assertEquals(chart2, chart1);

        // renderingHints
        chart1.setRenderingHints(new RenderingHints(
                RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON));
        assertFalse(chart1.equals(chart2));
        chart2.setRenderingHints(new RenderingHints(
                RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON));
        assertEquals(chart1, chart2);

        // borderVisible
        chart1.setBorderVisible(true);
        assertFalse(chart1.equals(chart2));
        chart2.setBorderVisible(true);
        assertEquals(chart1, chart2);

        // borderStroke
        BasicStroke s = new BasicStroke(2.0f);
        chart1.setBorderStroke(s);
        assertFalse(chart1.equals(chart2));
        chart2.setBorderStroke(s);
        assertEquals(chart1, chart2);

        // borderPaint
        chart1.setBorderPaint(Color.RED);
        assertFalse(chart1.equals(chart2));
        chart2.setBorderPaint(Color.RED);
        assertEquals(chart1, chart2);

        // padding
        chart1.setPadding(new RectangleInsets(1, 2, 3, 4));
        assertFalse(chart1.equals(chart2));
        chart2.setPadding(new RectangleInsets(1, 2, 3, 4));
        assertEquals(chart1, chart2);

        // title
        chart1.setTitle("XYZ");
        assertFalse(chart1.equals(chart2));
        chart2.setTitle("XYZ");
        assertEquals(chart1, chart2);

        // subtitles
        chart1.addSubtitle(new TextTitle("Subtitle"));
        assertFalse(chart1.equals(chart2));
        chart2.addSubtitle(new TextTitle("Subtitle"));
        assertEquals(chart1, chart2);

        // plot
        chart1 = new JFreeChart("Title",
                new Font("SansSerif", Font.PLAIN, 12), new RingPlot(), false);
        chart2 = new JFreeChart("Title",
                new Font("SansSerif", Font.PLAIN, 12), new PiePlot(), false);
        assertFalse(chart1.equals(chart2));
        chart2 = new JFreeChart("Title",
                new Font("SansSerif", Font.PLAIN, 12), new RingPlot(), false);
        assertEquals(chart1, chart2);

        // backgroundPaint
        chart1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertFalse(chart1.equals(chart2));
        chart2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertEquals(chart1, chart2);

//        // backgroundImage
//        chart1.setBackgroundImage(JFreeChart.INFO.getLogo());
//        assertFalse(chart1.equals(chart2));
//        chart2.setBackgroundImage(JFreeChart.INFO.getLogo());
//        assertEquals(chart1, chart2);

        // backgroundImageAlignment
        chart1.setBackgroundImageAlignment(Align.BOTTOM_LEFT);
        assertFalse(chart1.equals(chart2));
        chart2.setBackgroundImageAlignment(Align.BOTTOM_LEFT);
        assertEquals(chart1, chart2);

        // backgroundImageAlpha
        chart1.setBackgroundImageAlpha(0.1f);
        assertFalse(chart1.equals(chart2));
        chart2.setBackgroundImageAlpha(0.1f);
        assertEquals(chart1, chart2);
    }

    