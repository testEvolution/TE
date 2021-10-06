@Test
    public void testEquals() {
        SpiderWebPlot p1 = new SpiderWebPlot(new DefaultCategoryDataset());
        SpiderWebPlot p2 = new SpiderWebPlot(new DefaultCategoryDataset());
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));

        // dataExtractOrder
        p1.setDataExtractOrder(TableOrder.BY_COLUMN);
        assertFalse(p1.equals(p2));
        p2.setDataExtractOrder(TableOrder.BY_COLUMN);
        assertTrue(p1.equals(p2));

        // headPercent
        p1.setHeadPercent(0.321);
        assertFalse(p1.equals(p2));
        p2.setHeadPercent(0.321);
        assertTrue(p1.equals(p2));

        // interiorGap
        p1.setInteriorGap(0.123);
        assertFalse(p1.equals(p2));
        p2.setInteriorGap(0.123);
        assertTrue(p1.equals(p2));

        // startAngle
        p1.setStartAngle(0.456);
        assertFalse(p1.equals(p2));
        p2.setStartAngle(0.456);
        assertTrue(p1.equals(p2));

        // direction
        p1.setDirection(Rotation.ANTICLOCKWISE);
        assertFalse(p1.equals(p2));
        p2.setDirection(Rotation.ANTICLOCKWISE);
        assertTrue(p1.equals(p2));

        // maxValue
        p1.setMaxValue(123.4);
        assertFalse(p1.equals(p2));
        p2.setMaxValue(123.4);
        assertTrue(p1.equals(p2));

        // legendItemShape
        p1.setLegendItemShape(new Rectangle(1, 2, 3, 4));
        assertFalse(p1.equals(p2));
        p2.setLegendItemShape(new Rectangle(1, 2, 3, 4));
        assertTrue(p1.equals(p2));

        // seriesPaint
        p1.setSeriesPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.WHITE));
        assertFalse(p1.equals(p2));
        p2.setSeriesPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.WHITE));
        assertTrue(p1.equals(p2));

        // seriesPaintList
        p1.setSeriesPaint(1, new GradientPaint(1.0f, 2.0f, Color.YELLOW,
                3.0f, 4.0f, Color.WHITE));
        assertFalse(p1.equals(p2));
        p2.setSeriesPaint(1, new GradientPaint(1.0f, 2.0f, Color.YELLOW,
                3.0f, 4.0f, Color.WHITE));
        assertTrue(p1.equals(p2));

        // baseSeriesPaint
        p1.setBaseSeriesPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLACK));
        assertFalse(p1.equals(p2));
        p2.setBaseSeriesPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLACK));
        assertTrue(p1.equals(p2));

        // seriesOutlinePaint
        p1.setSeriesOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.BLACK));
        assertFalse(p1.equals(p2));
        p2.setSeriesOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.BLACK));
        assertTrue(p1.equals(p2));

        // seriesOutlinePaintList
        p1.setSeriesOutlinePaint(1, new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.GREEN));
        assertFalse(p1.equals(p2));
        p2.setSeriesOutlinePaint(1, new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.GREEN));
        assertTrue(p1.equals(p2));

        // baseSeriesOutlinePaint
        p1.setBaseSeriesOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.CYAN,
                3.0f, 4.0f, Color.GREEN));
        assertFalse(p1.equals(p2));
        p2.setBaseSeriesOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.CYAN,
                3.0f, 4.0f, Color.GREEN));
        assertTrue(p1.equals(p2));

        // seriesOutlineStroke
        BasicStroke s = new BasicStroke(1.23f);
        p1.setSeriesOutlineStroke(s);
        assertFalse(p1.equals(p2));
        p2.setSeriesOutlineStroke(s);
        assertTrue(p1.equals(p2));

        // seriesOutlineStrokeList
        p1.setSeriesOutlineStroke(1, s);
        assertFalse(p1.equals(p2));
        p2.setSeriesOutlineStroke(1, s);
        assertTrue(p1.equals(p2));

        // baseSeriesOutlineStroke
        p1.setBaseSeriesOutlineStroke(s);
        assertFalse(p1.equals(p2));
        p2.setBaseSeriesOutlineStroke(s);
        assertTrue(p1.equals(p2));

        // webFilled
        p1.setWebFilled(false);
        assertFalse(p1.equals(p2));
        p2.setWebFilled(false);
        assertTrue(p1.equals(p2));

        // axisLabelGap
        p1.setAxisLabelGap(0.11);
        assertFalse(p1.equals(p2));
        p2.setAxisLabelGap(0.11);
        assertTrue(p1.equals(p2));

        // labelFont
        p1.setLabelFont(new Font("Serif", Font.PLAIN, 9));
        assertFalse(p1.equals(p2));
        p2.setLabelFont(new Font("Serif", Font.PLAIN, 9));
        assertTrue(p1.equals(p2));

        // labelPaint
        p1.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertFalse(p1.equals(p2));
        p2.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertTrue(p1.equals(p2));

        // labelGenerator
        p1.setLabelGenerator(new StandardCategoryItemLabelGenerator("XYZ: {0}",
                new DecimalFormat("0.000")));
        assertFalse(p1.equals(p2));
        p2.setLabelGenerator(new StandardCategoryItemLabelGenerator("XYZ: {0}",
                new DecimalFormat("0.000")));
        assertTrue(p1.equals(p2));

        // toolTipGenerator
        p1.setToolTipGenerator(new StandardCategoryToolTipGenerator());
        assertFalse(p1.equals(p2));
        p2.setToolTipGenerator(new StandardCategoryToolTipGenerator());
        assertTrue(p1.equals(p2));

        // urlGenerator
        p1.setURLGenerator(new StandardCategoryURLGenerator());
        assertFalse(p1.equals(p2));
        p2.setURLGenerator(new StandardCategoryURLGenerator());
        assertTrue(p1.equals(p2));

        // axisLinePaint
        p1.setAxisLinePaint(Color.RED);
        assertFalse(p1.equals(p2));
        p2.setAxisLinePaint(Color.RED);
        assertTrue(p1.equals(p2));

        // axisLineStroke
        p1.setAxisLineStroke(new BasicStroke(1.1f));
        assertFalse(p1.equals(p2));
        p2.setAxisLineStroke(new BasicStroke(1.1f));
        assertTrue(p1.equals(p2));
    }

    