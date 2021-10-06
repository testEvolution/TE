@Test
    public void testEventNotification() {

        RendererChangeDetector detector = new RendererChangeDetector();
        BarRenderer r1 = new BarRenderer();  // have to use a subclass of
                                             // AbstractRenderer
        r1.addChangeListener(detector);

        // PAINT
        detector.setNotified(false);
        r1.setSeriesPaint(0, Color.RED);
        assertTrue(detector.getNotified());

        detector.setNotified(false);
        r1.setDefaultPaint(Color.RED);
        assertTrue(detector.getNotified());

        // OUTLINE PAINT
        detector.setNotified(false);
        r1.setSeriesOutlinePaint(0, Color.RED);
        assertTrue(detector.getNotified());

        detector.setNotified(false);
        r1.setDefaultOutlinePaint(Color.RED);
        assertTrue(detector.getNotified());

        // STROKE
        detector.setNotified(false);
        r1.setSeriesStroke(0, new BasicStroke(1.0f));
        assertTrue(detector.getNotified());

        detector.setNotified(false);
        r1.setDefaultStroke(new BasicStroke(1.0f));
        assertTrue(detector.getNotified());

        // OUTLINE STROKE
        detector.setNotified(false);
        r1.setSeriesOutlineStroke(0, new BasicStroke(1.0f));
        assertTrue(detector.getNotified());

        detector.setNotified(false);
        r1.setDefaultOutlineStroke(new BasicStroke(1.0f));
        assertTrue(detector.getNotified());

        // SHAPE
        detector.setNotified(false);
        r1.setSeriesShape(0, new Rectangle2D.Float());
        assertTrue(detector.getNotified());

        detector.setNotified(false);
        r1.setDefaultShape(new Rectangle2D.Float());
        assertTrue(detector.getNotified());

        // ITEM_LABELS_VISIBLE
        detector.setNotified(false);
        r1.setSeriesItemLabelsVisible(0, Boolean.TRUE);
        assertTrue(detector.getNotified());

        detector.setNotified(false);
        r1.setDefaultItemLabelsVisible(Boolean.TRUE);
        assertTrue(detector.getNotified());

        // ITEM_LABEL_FONT
        detector.setNotified(false);
        r1.setSeriesItemLabelFont(0, new Font("Serif", Font.PLAIN, 12));
        assertTrue(detector.getNotified());

        detector.setNotified(false);
        r1.setDefaultItemLabelFont(new Font("Serif", Font.PLAIN, 12));
        assertTrue(detector.getNotified());

        // ITEM_LABEL_PAINT
        detector.setNotified(false);
        r1.setSeriesItemLabelPaint(0, Color.BLUE);
        assertTrue(detector.getNotified());

        detector.setNotified(false);
        r1.setDefaultItemLabelPaint(Color.BLUE);
        assertTrue(detector.getNotified());

        // POSITIVE ITEM LABEL POSITION
        detector.setNotified(false);
        r1.setSeriesPositiveItemLabelPosition(0, new ItemLabelPosition(
                ItemLabelAnchor.CENTER, TextAnchor.CENTER));
        assertTrue(detector.getNotified());

        detector.setNotified(false);
        r1.setDefaultPositiveItemLabelPosition(new ItemLabelPosition(
                ItemLabelAnchor.CENTER, TextAnchor.CENTER));
        assertTrue(detector.getNotified());

        // NEGATIVE ITEM LABEL ANCHOR
        detector.setNotified(false);
        r1.setSeriesNegativeItemLabelPosition(0, new ItemLabelPosition(
                ItemLabelAnchor.CENTER, TextAnchor.CENTER));
        assertTrue(detector.getNotified());

        detector.setNotified(false);
        r1.setDefaultNegativeItemLabelPosition(new ItemLabelPosition(
                ItemLabelAnchor.CENTER, TextAnchor.CENTER));
        assertTrue(detector.getNotified());

    }

    