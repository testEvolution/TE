@Test
    public void testEquals() {
        CategoryPlot plot1 = new CategoryPlot();
        CategoryPlot plot2 = new CategoryPlot();
        assertTrue(plot1.equals(plot2));
        assertTrue(plot2.equals(plot1));

        // orientation...
        plot1.setOrientation(PlotOrientation.HORIZONTAL);
        assertFalse(plot1.equals(plot2));
        plot2.setOrientation(PlotOrientation.HORIZONTAL);
        assertTrue(plot1.equals(plot2));

        // axisOffset...
        plot1.setAxisOffset(new RectangleInsets(0.05, 0.05, 0.05, 0.05));
        assertFalse(plot1.equals(plot2));
        plot2.setAxisOffset(new RectangleInsets(0.05, 0.05, 0.05, 0.05));
        assertTrue(plot1.equals(plot2));

        // domainAxis - no longer a separate field but test anyway...
        plot1.setDomainAxis(new CategoryAxis("Category Axis"));
        assertFalse(plot1.equals(plot2));
        plot2.setDomainAxis(new CategoryAxis("Category Axis"));
        assertTrue(plot1.equals(plot2));

        // domainAxes...
        plot1.setDomainAxis(11, new CategoryAxis("Secondary Axis"));
        assertFalse(plot1.equals(plot2));
        plot2.setDomainAxis(11, new CategoryAxis("Secondary Axis"));
        assertTrue(plot1.equals(plot2));

        // domainAxisLocation - no longer a separate field but test anyway...
        plot1.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertFalse(plot1.equals(plot2));
        plot2.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertTrue(plot1.equals(plot2));

        // domainAxisLocations...
        plot1.setDomainAxisLocation(11, AxisLocation.TOP_OR_RIGHT);
        assertFalse(plot1.equals(plot2));
        plot2.setDomainAxisLocation(11, AxisLocation.TOP_OR_RIGHT);
        assertTrue(plot1.equals(plot2));

        // draw shared domain axis...
        plot1.setDrawSharedDomainAxis(!plot1.getDrawSharedDomainAxis());
        assertFalse(plot1.equals(plot2));
        plot2.setDrawSharedDomainAxis(!plot2.getDrawSharedDomainAxis());
        assertTrue(plot1.equals(plot2));

        // rangeAxis - no longer a separate field but test anyway...
        plot1.setRangeAxis(new NumberAxis("Range Axis"));
        assertFalse(plot1.equals(plot2));
        plot2.setRangeAxis(new NumberAxis("Range Axis"));
        assertTrue(plot1.equals(plot2));

        // rangeAxes...
        plot1.setRangeAxis(11, new NumberAxis("Secondary Range Axis"));
        assertFalse(plot1.equals(plot2));
        plot2.setRangeAxis(11, new NumberAxis("Secondary Range Axis"));
        assertTrue(plot1.equals(plot2));

        // rangeAxisLocation - no longer a separate field but test anyway...
        plot1.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertFalse(plot1.equals(plot2));
        plot2.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertTrue(plot1.equals(plot2));

        // rangeAxisLocations...
        plot1.setRangeAxisLocation(11, AxisLocation.TOP_OR_RIGHT);
        assertFalse(plot1.equals(plot2));
        plot2.setRangeAxisLocation(11, AxisLocation.TOP_OR_RIGHT);
        assertTrue(plot1.equals(plot2));

        // datasetToDomainAxisMap...
        plot1.mapDatasetToDomainAxis(11, 11);
        assertFalse(plot1.equals(plot2));
        plot2.mapDatasetToDomainAxis(11, 11);
        assertTrue(plot1.equals(plot2));

        // datasetToRangeAxisMap...
        plot1.mapDatasetToRangeAxis(11, 11);
        assertFalse(plot1.equals(plot2));
        plot2.mapDatasetToRangeAxis(11, 11);
        assertTrue(plot1.equals(plot2));

        // renderer - no longer a separate field but test anyway...
        plot1.setRenderer(new AreaRenderer());
        assertFalse(plot1.equals(plot2));
        plot2.setRenderer(new AreaRenderer());
        assertTrue(plot1.equals(plot2));

        // renderers...
        plot1.setRenderer(11, new AreaRenderer());
        assertFalse(plot1.equals(plot2));
        plot2.setRenderer(11, new AreaRenderer());
        assertTrue(plot1.equals(plot2));

        // rendering order...
        plot1.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertFalse(plot1.equals(plot2));
        plot2.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertTrue(plot1.equals(plot2));

        // columnRenderingOrder...
        plot1.setColumnRenderingOrder(SortOrder.DESCENDING);
        assertFalse(plot1.equals(plot2));
        plot2.setColumnRenderingOrder(SortOrder.DESCENDING);
        assertTrue(plot1.equals(plot2));

        // rowRenderingOrder...
        plot1.setRowRenderingOrder(SortOrder.DESCENDING);
        assertFalse(plot1.equals(plot2));
        plot2.setRowRenderingOrder(SortOrder.DESCENDING);
        assertTrue(plot1.equals(plot2));

        // domainGridlinesVisible
        plot1.setDomainGridlinesVisible(true);
        assertFalse(plot1.equals(plot2));
        plot2.setDomainGridlinesVisible(true);
        assertTrue(plot1.equals(plot2));

        // domainGridlinePosition
        plot1.setDomainGridlinePosition(CategoryAnchor.END);
        assertFalse(plot1.equals(plot2));
        plot2.setDomainGridlinePosition(CategoryAnchor.END);
        assertTrue(plot1.equals(plot2));

        // domainGridlineStroke
        Stroke stroke = new BasicStroke(2.0f);
        plot1.setDomainGridlineStroke(stroke);
        assertFalse(plot1.equals(plot2));
        plot2.setDomainGridlineStroke(stroke);
        assertTrue(plot1.equals(plot2));

        // domainGridlinePaint
        plot1.setDomainGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.YELLOW));
        assertFalse(plot1.equals(plot2));
        plot2.setDomainGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.YELLOW));
        assertTrue(plot1.equals(plot2));

        // rangeGridlinesVisible
        plot1.setRangeGridlinesVisible(false);
        assertFalse(plot1.equals(plot2));
        plot2.setRangeGridlinesVisible(false);
        assertTrue(plot1.equals(plot2));

        // rangeGridlineStroke
        plot1.setRangeGridlineStroke(stroke);
        assertFalse(plot1.equals(plot2));
        plot2.setRangeGridlineStroke(stroke);
        assertTrue(plot1.equals(plot2));

        // rangeGridlinePaint
        plot1.setRangeGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.GREEN,
                3.0f, 4.0f, Color.YELLOW));
        assertFalse(plot1.equals(plot2));
        plot2.setRangeGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.GREEN,
                3.0f, 4.0f, Color.YELLOW));
        assertTrue(plot1.equals(plot2));

        // anchorValue
        plot1.setAnchorValue(100.0);
        assertFalse(plot1.equals(plot2));
        plot2.setAnchorValue(100.0);
        assertTrue(plot1.equals(plot2));

        // rangeCrosshairVisible
        plot1.setRangeCrosshairVisible(true);
        assertFalse(plot1.equals(plot2));
        plot2.setRangeCrosshairVisible(true);
        assertTrue(plot1.equals(plot2));

        // rangeCrosshairValue
        plot1.setRangeCrosshairValue(100.0);
        assertFalse(plot1.equals(plot2));
        plot2.setRangeCrosshairValue(100.0);
        assertTrue(plot1.equals(plot2));

        // rangeCrosshairStroke
        plot1.setRangeCrosshairStroke(stroke);
        assertFalse(plot1.equals(plot2));
        plot2.setRangeCrosshairStroke(stroke);
        assertTrue(plot1.equals(plot2));

        // rangeCrosshairPaint
        plot1.setRangeCrosshairPaint(new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.YELLOW));
        assertFalse(plot1.equals(plot2));
        plot2.setRangeCrosshairPaint(new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.YELLOW));
        assertTrue(plot1.equals(plot2));

        // rangeCrosshairLockedOnData
        plot1.setRangeCrosshairLockedOnData(false);
        assertFalse(plot1.equals(plot2));
        plot2.setRangeCrosshairLockedOnData(false);
        assertTrue(plot1.equals(plot2));

        // foreground domain markers
        plot1.addDomainMarker(new CategoryMarker("C1"), Layer.FOREGROUND);
        assertFalse(plot1.equals(plot2));
        plot2.addDomainMarker(new CategoryMarker("C1"), Layer.FOREGROUND);
        assertTrue(plot1.equals(plot2));

        // background domain markers
        plot1.addDomainMarker(new CategoryMarker("C2"), Layer.BACKGROUND);
        assertFalse(plot1.equals(plot2));
        plot2.addDomainMarker(new CategoryMarker("C2"), Layer.BACKGROUND);
        assertTrue(plot1.equals(plot2));

        // range markers - no longer separate fields but test anyway...
        plot1.addRangeMarker(new ValueMarker(4.0), Layer.FOREGROUND);
        assertFalse(plot1.equals(plot2));
        plot2.addRangeMarker(new ValueMarker(4.0), Layer.FOREGROUND);
        assertTrue(plot1.equals(plot2));

        plot1.addRangeMarker(new ValueMarker(5.0), Layer.BACKGROUND);
        assertFalse(plot1.equals(plot2));
        plot2.addRangeMarker(new ValueMarker(5.0), Layer.BACKGROUND);
        assertTrue(plot1.equals(plot2));

        // foreground range markers...
        plot1.addRangeMarker(1, new ValueMarker(4.0), Layer.FOREGROUND);
        assertFalse(plot1.equals(plot2));
        plot2.addRangeMarker(1, new ValueMarker(4.0), Layer.FOREGROUND);
        assertTrue(plot1.equals(plot2));

        // background range markers...
        plot1.addRangeMarker(1, new ValueMarker(5.0), Layer.BACKGROUND);
        assertFalse(plot1.equals(plot2));
        plot2.addRangeMarker(1, new ValueMarker(5.0), Layer.BACKGROUND);
        assertTrue(plot1.equals(plot2));

        // annotations
        plot1.addAnnotation(new CategoryTextAnnotation("Text", "Category",
                43.0));
        assertFalse(plot1.equals(plot2));
        plot2.addAnnotation(new CategoryTextAnnotation("Text", "Category",
                43.0));
        assertTrue(plot1.equals(plot2));

        // weight
        plot1.setWeight(3);
        assertFalse(plot1.equals(plot2));
        plot2.setWeight(3);
        assertTrue(plot1.equals(plot2));

        // fixed domain axis space...
        plot1.setFixedDomainAxisSpace(new AxisSpace());
        assertFalse(plot1.equals(plot2));
        plot2.setFixedDomainAxisSpace(new AxisSpace());
        assertTrue(plot1.equals(plot2));

        // fixed range axis space...
        plot1.setFixedRangeAxisSpace(new AxisSpace());
        assertFalse(plot1.equals(plot2));
        plot2.setFixedRangeAxisSpace(new AxisSpace());
        assertTrue(plot1.equals(plot2));

        // fixed legend items
        plot1.setFixedLegendItems(new LegendItemCollection());
        assertFalse(plot1.equals(plot2));
        plot2.setFixedLegendItems(new LegendItemCollection());
        assertTrue(plot1.equals(plot2));

        // crosshairDatasetIndex
        plot1.setCrosshairDatasetIndex(99);
        assertFalse(plot1.equals(plot2));
        plot2.setCrosshairDatasetIndex(99);
        assertTrue(plot1.equals(plot2));

        // domainCrosshairColumnKey
        plot1.setDomainCrosshairColumnKey("A");
        assertFalse(plot1.equals(plot2));
        plot2.setDomainCrosshairColumnKey("A");
        assertTrue(plot1.equals(plot2));

        // domainCrosshairRowKey
        plot1.setDomainCrosshairRowKey("B");
        assertFalse(plot1.equals(plot2));
        plot2.setDomainCrosshairRowKey("B");
        assertTrue(plot1.equals(plot2));

        // domainCrosshairVisible
        plot1.setDomainCrosshairVisible(true);
        assertFalse(plot1.equals(plot2));
        plot2.setDomainCrosshairVisible(true);
        assertTrue(plot1.equals(plot2));

        // domainCrosshairPaint
        plot1.setDomainCrosshairPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertFalse(plot1.equals(plot2));
        plot2.setDomainCrosshairPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertTrue(plot1.equals(plot2));

        // domainCrosshairStroke
        plot1.setDomainCrosshairStroke(new BasicStroke(1.23f));
        assertFalse(plot1.equals(plot2));
        plot2.setDomainCrosshairStroke(new BasicStroke(1.23f));
        assertTrue(plot1.equals(plot2));

        plot1.setRangeMinorGridlinesVisible(true);
        assertFalse(plot1.equals(plot2));
        plot2.setRangeMinorGridlinesVisible(true);
        assertTrue(plot1.equals(plot2));

        plot1.setRangeMinorGridlinePaint(new GradientPaint(1.0f, 2.0f,
                Color.RED, 3.0f, 4.0f, Color.BLUE));
        assertFalse(plot1.equals(plot2));
        plot2.setRangeMinorGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertTrue(plot1.equals(plot2));

        plot1.setRangeMinorGridlineStroke(new BasicStroke(1.23f));
        assertFalse(plot1.equals(plot2));
        plot2.setRangeMinorGridlineStroke(new BasicStroke(1.23f));
        assertTrue(plot1.equals(plot2));

        plot1.setRangeZeroBaselineVisible(!plot1.isRangeZeroBaselineVisible());
        assertFalse(plot1.equals(plot2));
        plot2.setRangeZeroBaselineVisible(!plot2.isRangeZeroBaselineVisible());
        assertTrue(plot1.equals(plot2));

        plot1.setRangeZeroBaselinePaint(new GradientPaint(1.0f, 2.0f,
                Color.RED, 3.0f, 4.0f, Color.BLUE));
        assertFalse(plot1.equals(plot2));
        plot2.setRangeZeroBaselinePaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertTrue(plot1.equals(plot2));

        plot1.setRangeZeroBaselineStroke(new BasicStroke(1.23f));
        assertFalse(plot1.equals(plot2));
        plot2.setRangeZeroBaselineStroke(new BasicStroke(1.23f));
        assertTrue(plot1.equals(plot2));

        // shadowGenerator
        plot1.setShadowGenerator(new DefaultShadowGenerator(5, Color.GRAY,
                0.6f, 4, -Math.PI / 4));
        assertFalse(plot1.equals(plot2));
        plot2.setShadowGenerator(new DefaultShadowGenerator(5, Color.GRAY,
                0.6f, 4, -Math.PI / 4));
        assertTrue(plot1.equals(plot2));

        plot1.setShadowGenerator(null);
        assertFalse(plot1.equals(plot2));
        plot2.setShadowGenerator(null);
        assertTrue(plot1.equals(plot2));
    }

    