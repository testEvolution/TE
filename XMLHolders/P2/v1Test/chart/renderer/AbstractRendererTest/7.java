@Test
    public void testCloning() throws CloneNotSupportedException {
        LineAndShapeRenderer r1 = new LineAndShapeRenderer();
        Rectangle2D shape = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0);
        Rectangle2D baseShape = new Rectangle2D.Double(11.0, 12.0, 13.0, 14.0);
        r1.setDefaultShape(baseShape);
        r1.setDefaultLegendShape(new Rectangle(4, 3, 2, 1));
        r1.setDefaultLegendTextFont(new Font("Dialog", Font.PLAIN, 3));
        r1.setDefaultLegendTextPaint(new Color(1, 2, 3));
        r1.setSeriesItemLabelFont(0, new Font(Font.MONOSPACED, Font.BOLD, 13));
        r1.setLegendTextFont(0, new Font(Font.MONOSPACED, Font.BOLD, 14));
        r1.setSeriesPositiveItemLabelPosition(0, new ItemLabelPosition(
                ItemLabelAnchor.CENTER, TextAnchor.TOP_LEFT));
        r1.setSeriesNegativeItemLabelPosition(0, new ItemLabelPosition(
                ItemLabelAnchor.CENTER, TextAnchor.CENTER));
        
        LineAndShapeRenderer r2 = (LineAndShapeRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));

        r1.setSeriesVisible(0, Boolean.FALSE);
        assertFalse(r1.equals(r2));
        r2.setSeriesVisible(0, Boolean.FALSE);
        assertTrue(r1.equals(r2));

        r1.setSeriesVisibleInLegend(0, Boolean.FALSE);
        assertFalse(r1.equals(r2));
        r2.setSeriesVisibleInLegend(0, Boolean.FALSE);
        assertTrue(r1.equals(r2));

        r1.setSeriesPaint(0, Color.BLACK);
        assertFalse(r1.equals(r2));
        r2.setSeriesPaint(0, Color.BLACK);
        assertTrue(r1.equals(r2));

        r1.setSeriesFillPaint(0, Color.YELLOW);
        assertFalse(r1.equals(r2));
        r2.setSeriesFillPaint(0, Color.YELLOW);
        assertTrue(r1.equals(r2));

        r1.setSeriesOutlinePaint(0, Color.YELLOW);
        assertFalse(r1.equals(r2));
        r2.setSeriesOutlinePaint(0, Color.YELLOW);
        assertTrue(r1.equals(r2));

        r1.setSeriesStroke(0, new BasicStroke(2.2f));
        assertFalse(r1.equals(r2));
        r2.setSeriesStroke(0, new BasicStroke(2.2f));
        assertTrue(r1.equals(r2));

        r1.setSeriesOutlineStroke(0, new BasicStroke(2.2f));
        assertFalse(r1.equals(r2));
        r2.setSeriesOutlineStroke(0, new BasicStroke(2.2f));
        assertTrue(r1.equals(r2));

        baseShape.setRect(4.0, 3.0, 2.0, 1.0);
        assertFalse(r1.equals(r2));
        r2.setDefaultShape(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0));
        assertTrue(r1.equals(r2));

        r1.setSeriesShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        assertFalse(r1.equals(r2));
        r2.setSeriesShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        assertTrue(r1.equals(r2));

        r1.setSeriesItemLabelsVisible(0, Boolean.TRUE);
        assertFalse(r1.equals(r2));
        r2.setSeriesItemLabelsVisible(0, Boolean.TRUE);
        assertTrue(r1.equals(r2));

        r1.setSeriesItemLabelPaint(0, Color.RED);
        assertFalse(r1.equals(r2));
        r2.setSeriesItemLabelPaint(0, Color.RED);
        assertTrue(r1.equals(r2));
        
        r1.setSeriesPositiveItemLabelPosition(0, new ItemLabelPosition());
        assertFalse(r1.equals(r2));
        r2.setSeriesPositiveItemLabelPosition(0, new ItemLabelPosition());
        assertTrue(r1.equals(r2));

        r1.setSeriesNegativeItemLabelPosition(0, new ItemLabelPosition());
        assertFalse(r1.equals(r2));
        r2.setSeriesNegativeItemLabelPosition(0, new ItemLabelPosition());
        assertTrue(r1.equals(r2));

        r1.setSeriesCreateEntities(0, Boolean.FALSE);
        assertFalse(r1.equals(r2));
        r2.setSeriesCreateEntities(0, Boolean.FALSE);
        assertTrue(r1.equals(r2));

        r1.setLegendShape(0, new Rectangle(9, 7, 3, 4));
        assertFalse(r1.equals(r2));
        r2.setLegendShape(0, new Rectangle(9, 7, 3, 4));
        assertTrue(r1.equals(r2));

        r1.setDefaultLegendShape(new Rectangle(3, 4, 1, 5));
        assertFalse(r1.equals(r2));
        r2.setDefaultLegendShape(new Rectangle(3, 4, 1, 5));
        assertTrue(r1.equals(r2));

        r1.setLegendTextFont(1, new Font("Dialog", Font.PLAIN, 33));
        assertFalse(r1.equals(r2));
        r2.setLegendTextFont(1, new Font("Dialog", Font.PLAIN, 33));
        assertTrue(r1.equals(r2));

        r1.setDefaultLegendTextFont(new Font("Dialog", Font.PLAIN, 11));
        assertFalse(r1.equals(r2));
        r2.setDefaultLegendTextFont(new Font("Dialog", Font.PLAIN, 11));
        assertTrue(r1.equals(r2));

        r1.setLegendTextPaint(3, Color.RED);
        assertFalse(r1.equals(r2));
        r2.setLegendTextPaint(3, Color.RED);
        assertTrue(r1.equals(r2));

        r1.setDefaultLegendTextPaint(Color.GREEN);
        assertFalse(r1.equals(r2));
        r2.setDefaultLegendTextPaint(Color.GREEN);
        assertTrue(r1.equals(r2));
    }

    