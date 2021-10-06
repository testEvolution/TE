@Test
    public void testEquals() {
        StandardChartTheme t1 = new StandardChartTheme("Name");
        StandardChartTheme t2 = new StandardChartTheme("Name");
        assertTrue(t1.equals(t2));

        // name
        t1 = new StandardChartTheme("t1");
        assertFalse(t1.equals(t2));
        t2 = new StandardChartTheme("t1");
        assertTrue(t1.equals(t2));

        //extraLargeFont
        t1.setExtraLargeFont(new Font("Dialog", Font.PLAIN, 21));
        assertFalse(t1.equals(t2));
        t2.setExtraLargeFont(new Font("Dialog", Font.PLAIN, 21));
        assertTrue(t1.equals(t2));

        //largeFont
        t1.setLargeFont(new Font("Dialog", Font.PLAIN, 19));
        assertFalse(t1.equals(t2));
        t2.setLargeFont(new Font("Dialog", Font.PLAIN, 19));
        assertTrue(t1.equals(t2));

        //regularFont;
        t1.setRegularFont(new Font("Dialog", Font.PLAIN, 17));
        assertFalse(t1.equals(t2));
        t2.setRegularFont(new Font("Dialog", Font.PLAIN, 17));
        assertTrue(t1.equals(t2));

        //titlePaint;
        t1.setTitlePaint(new GradientPaint(0f, 1f, Color.RED, 2f, 3f, Color.BLUE));
        assertFalse(t1.equals(t2));
        t2.setTitlePaint(new GradientPaint(0f, 1f, Color.RED, 2f, 3f, Color.BLUE));
        assertTrue(t1.equals(t2));

        //subtitlePaint;
        t1.setSubtitlePaint(new GradientPaint(1f, 2f, Color.RED, 3f, 4f, Color.BLUE));
        assertFalse(t1.equals(t2));
        t2.setSubtitlePaint(new GradientPaint(1f, 2f, Color.RED, 3f, 4f, Color.BLUE));
        assertTrue(t1.equals(t2));

        //chartBackgroundPaint;
        t1.setChartBackgroundPaint(new GradientPaint(2f, 3f, Color.BLUE, 4f, 5f, Color.RED));
        assertFalse(t1.equals(t2));
        t2.setChartBackgroundPaint(new GradientPaint(2f, 3f, Color.BLUE, 4f, 5f, Color.RED));
        assertTrue(t1.equals(t2));

        //legendBackgroundPaint;
        t1.setLegendBackgroundPaint(new GradientPaint(3f, 4f, Color.gray, 1f, 2f, Color.RED));
        assertFalse(t1.equals(t2));
        t2.setLegendBackgroundPaint(new GradientPaint(3f, 4f, Color.gray, 1f, 2f, Color.RED));
        assertTrue(t1.equals(t2));

        //legendItemPaint;
        t1.setLegendItemPaint(new GradientPaint(9f, 8f, Color.RED, 7f, 6f, Color.BLUE));
        assertFalse(t1.equals(t2));
        t2.setLegendItemPaint(new GradientPaint(9f, 8f, Color.RED, 7f, 6f, Color.BLUE));
        assertTrue(t1.equals(t2));

        //drawingSupplier;
        t1.setDrawingSupplier(new DefaultDrawingSupplier(
                new Paint[] {Color.RED},
                new Paint[] {Color.BLUE},
                new Stroke[] {new BasicStroke(1.0f)},
                new Stroke[] {new BasicStroke(1.0f)},
                new Shape[] {new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)}));
        assertFalse(t1.equals(t2));
        t2.setDrawingSupplier(new DefaultDrawingSupplier(
                new Paint[] {Color.RED},
                new Paint[] {Color.BLUE},
                new Stroke[] {new BasicStroke(1.0f)},
                new Stroke[] {new BasicStroke(1.0f)},
                new Shape[] {new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)}));
        assertTrue(t1.equals(t2));

        //plotBackgroundPaint;
        t1.setPlotBackgroundPaint(new GradientPaint(4f, 3f, Color.RED, 6f, 7f, Color.BLUE));
        assertFalse(t1.equals(t2));
        t2.setPlotBackgroundPaint(new GradientPaint(4f, 3f, Color.RED, 6f, 7f, Color.BLUE));
        assertTrue(t1.equals(t2));

        //plotOutlinePaint;
        t1.setPlotOutlinePaint(new GradientPaint(5f, 2f, Color.BLUE, 6f, 7f, Color.RED));
        assertFalse(t1.equals(t2));
        t2.setPlotOutlinePaint(new GradientPaint(5f, 2f, Color.BLUE, 6f, 7f, Color.RED));
        assertTrue(t1.equals(t2));

        //labelLinkStyle;
        t1.setLabelLinkStyle(PieLabelLinkStyle.STANDARD);
        assertFalse(t1.equals(t2));
        t2.setLabelLinkStyle(PieLabelLinkStyle.STANDARD);
        assertTrue(t1.equals(t2));

        //labelLinkPaint;
        t1.setLabelLinkPaint(new GradientPaint(4f, 3f, Color.RED, 2f, 9f, Color.BLUE));
        assertFalse(t1.equals(t2));
        t2.setLabelLinkPaint(new GradientPaint(4f, 3f, Color.RED, 2f, 9f, Color.BLUE));
        assertTrue(t1.equals(t2));

        //domainGridlinePaint;
        t1.setDomainGridlinePaint(Color.BLUE);
        assertFalse(t1.equals(t2));
        t2.setDomainGridlinePaint(Color.BLUE);
        assertTrue(t1.equals(t2));

        //rangeGridlinePaint;
        t1.setRangeGridlinePaint(Color.RED);
        assertFalse(t1.equals(t2));
        t2.setRangeGridlinePaint(Color.RED);
        assertTrue(t1.equals(t2));

        //axisOffset;
        t1.setAxisOffset(new RectangleInsets(1, 2, 3, 4));
        assertFalse(t1.equals(t2));
        t2.setAxisOffset(new RectangleInsets(1, 2, 3, 4));
        assertTrue(t1.equals(t2));

        //axisLabelPaint;
        t1.setAxisLabelPaint(new GradientPaint(8f, 4f, Color.gray, 2f, 9f, Color.BLUE));
        assertFalse(t1.equals(t2));
        t2.setAxisLabelPaint(new GradientPaint(8f, 4f, Color.gray, 2f, 9f, Color.BLUE));
        assertTrue(t1.equals(t2));

        //tickLabelPaint;
        t1.setTickLabelPaint(new GradientPaint(3f, 4f, Color.RED, 5f, 6f, Color.YELLOW));
        assertFalse(t1.equals(t2));
        t2.setTickLabelPaint(new GradientPaint(3f, 4f, Color.RED, 5f, 6f, Color.YELLOW));
        assertTrue(t1.equals(t2));

        //itemLabelPaint;
        t1.setItemLabelPaint(new GradientPaint(2f, 5f, Color.gray, 1f, 2f, Color.BLUE));
        assertFalse(t1.equals(t2));
        t2.setItemLabelPaint(new GradientPaint(2f, 5f, Color.gray, 1f, 2f, Color.BLUE));
        assertTrue(t1.equals(t2));

        //shadowVisible;
        t1.setShadowVisible(!t1.isShadowVisible());
        assertFalse(t1.equals(t2));
        t2.setShadowVisible(t1.isShadowVisible());
        assertTrue(t1.equals(t2));

        //shadowPaint;
        t1.setShadowPaint(new GradientPaint(7f, 1f, Color.BLUE, 4f, 6f, Color.RED));
        assertFalse(t1.equals(t2));
        t2.setShadowPaint(new GradientPaint(7f, 1f, Color.BLUE, 4f, 6f, Color.RED));
        assertTrue(t1.equals(t2));

        //barPainter;
        t1.setBarPainter(new StandardBarPainter());
        assertFalse(t1.equals(t2));
        t2.setBarPainter(new StandardBarPainter());
        assertTrue(t1.equals(t2));

        //xyBarPainter;
        t1.setXYBarPainter(new StandardXYBarPainter());
        assertFalse(t1.equals(t2));
        t2.setXYBarPainter(new StandardXYBarPainter());
        assertTrue(t1.equals(t2));

        //thermometerPaint;
        t1.setThermometerPaint(new GradientPaint(9f, 7f, Color.RED, 5f, 1f, Color.BLUE));
        assertFalse(t1.equals(t2));
        t2.setThermometerPaint(new GradientPaint(9f, 7f, Color.RED, 5f, 1f, Color.BLUE));
        assertTrue(t1.equals(t2));

        //errorIndicatorPaint;
        t1.setErrorIndicatorPaint(new GradientPaint(0f, 1f, Color.WHITE, 2f, 3f, Color.BLUE));
        assertFalse(t1.equals(t2));
        t2.setErrorIndicatorPaint(new GradientPaint(0f, 1f, Color.WHITE, 2f, 3f, Color.BLUE));
        assertTrue(t1.equals(t2));

        //gridBandPaint
        t1.setGridBandPaint(new GradientPaint(1f, 2f, Color.WHITE, 4f, 8f, Color.RED));
        assertFalse(t1.equals(t2));
        t2.setGridBandPaint(new GradientPaint(1f, 2f, Color.WHITE, 4f, 8f, Color.RED));
        assertTrue(t1.equals(t2));

        //gridBandAlternatePaint
        t1.setGridBandAlternatePaint(new GradientPaint(1f, 4f, Color.GREEN, 1f, 2f, Color.RED));
        assertFalse(t1.equals(t2));
        t2.setGridBandAlternatePaint(new GradientPaint(1f, 4f, Color.GREEN, 1f, 2f, Color.RED));
        assertTrue(t1.equals(t2));

    }

    