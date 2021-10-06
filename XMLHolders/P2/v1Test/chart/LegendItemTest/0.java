@Test
    public void testEquals() {

        LegendItem item1 = new LegendItem("Label", "Description",
                "ToolTip", "URL", true,
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), true, Color.RED,
                true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0),
                new BasicStroke(2.1f), Color.GREEN);
        LegendItem item2 = new LegendItem("Label", "Description",
                "ToolTip", "URL", true,
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                true, Color.RED, true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertEquals(item1, item2);
        assertEquals(item2, item1);

        item1 = new LegendItem("Label2", "Description", "ToolTip", "URL",
                true, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), true,
                Color.RED, true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertFalse(item1.equals(item2));
        item2 = new LegendItem("Label2", "Description", "ToolTip", "URL",
                true, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                true, Color.RED, true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertEquals(item1, item2);

        item1 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", true, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                true, Color.RED, true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertFalse(item1.equals(item2));
        item2 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", true, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                true, Color.RED, true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertEquals(item1, item2);

        item1 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", false, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                true, Color.RED, true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertFalse(item1.equals(item2));
        item2 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", false, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                true, Color.RED, true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertEquals(item1, item2);

        item1 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0),
                true, Color.RED, true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertFalse(item1.equals(item2));
        item2 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0),
                true, Color.RED, true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertEquals(item1, item2);

        item1 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0),
                false, Color.RED, true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertFalse(item1.equals(item2));
        item2 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0),
                false, Color.RED, true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertEquals(item1, item2);

        item1 = new LegendItem("Label2", "Description2", "ToolTip", "URL",
                false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), false,
                Color.BLACK, true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertFalse(item1.equals(item2));
        item2 = new LegendItem("Label2", "Description2", "ToolTip", "URL",
                false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), false,
                Color.BLACK, true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertEquals(item1, item2);

        item1 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0),
                false, Color.BLACK, false, Color.BLUE, new BasicStroke(1.2f),
                true, new Line2D.Double(1.0, 2.0, 3.0, 4.0),
                new BasicStroke(2.1f), Color.GREEN);
        assertFalse(item1.equals(item2));
        item2 = new LegendItem("Label2", "Description2", "ToolTip", "URL",
                false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), false,
                Color.BLACK, false, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertEquals(item1, item2);

        item1 = new LegendItem("Label2", "Description2", "ToolTip", "URL",
                false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), false,
                Color.BLACK, false, Color.YELLOW, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertFalse(item1.equals(item2));
        item2 = new LegendItem("Label2", "Description2", "ToolTip", "URL",
                false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), false,
                Color.BLACK, false, Color.YELLOW, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertEquals(item1, item2);

        item1 = new LegendItem("Label2", "Description2", "ToolTip", "URL",
                false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), false,
                Color.BLACK, false, Color.YELLOW, new BasicStroke(2.1f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertFalse(item1.equals(item2));
        item2 = new LegendItem("Label2", "Description2", "ToolTip", "URL",
                false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), false,
                Color.BLACK, false, Color.YELLOW, new BasicStroke(2.1f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        assertEquals(item1, item2);

        item1 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0),
                false, Color.BLACK, false, Color.YELLOW, new BasicStroke(2.1f),
                false, new Line2D.Double(1.0, 2.0, 3.0, 4.0),
                new BasicStroke(2.1f), Color.GREEN);
        assertFalse(item1.equals(item2));
        item2 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0),
                false, Color.BLACK, false, Color.YELLOW, new BasicStroke(2.1f),
                false, new Line2D.Double(1.0, 2.0, 3.0, 4.0),
                new BasicStroke(2.1f), Color.GREEN);
        assertEquals(item1, item2);

        item1 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0),
                false, Color.BLACK, false, Color.YELLOW, new BasicStroke(2.1f),
                false, new Line2D.Double(4.0, 3.0, 2.0, 1.0),
                new BasicStroke(2.1f), Color.GREEN);
        assertFalse(item1.equals(item2));
        item2 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0),
                false, Color.BLACK, false, Color.YELLOW, new BasicStroke(2.1f),
                false, new Line2D.Double(4.0, 3.0, 2.0, 1.0),
                new BasicStroke(2.1f), Color.GREEN);
        assertEquals(item1, item2);

        item1 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0),
                false, Color.BLACK, false, Color.YELLOW, new BasicStroke(2.1f),
                false, new Line2D.Double(4.0, 3.0, 2.0, 1.0),
                new BasicStroke(3.3f), Color.GREEN);
        assertFalse(item1.equals(item2));
        item2 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0),
                false, Color.BLACK, false, Color.YELLOW, new BasicStroke(2.1f),
                false, new Line2D.Double(4.0, 3.0, 2.0, 1.0),
                new BasicStroke(3.3f), Color.GREEN);
        assertEquals(item1, item2);

        item1 = new LegendItem("Label2", "Description2", "ToolTip", "URL",
                false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), false,
                Color.BLACK, false, Color.YELLOW, new BasicStroke(2.1f), false,
            new Line2D.Double(4.0, 3.0, 2.0, 1.0), new BasicStroke(3.3f),
            Color.WHITE
        );
        assertFalse(item1.equals(item2));
        item2 = new LegendItem("Label2", "Description2", "ToolTip",
                "URL", false, new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0),
                false, Color.BLACK, false, Color.YELLOW, new BasicStroke(2.1f),
                false, new Line2D.Double(4.0, 3.0, 2.0, 1.0),
                new BasicStroke(3.3f),
                Color.WHITE);
        assertEquals(item1, item2);

        // fillPaintTransformer
        item1.setFillPaintTransformer(new StandardGradientPaintTransformer(
                GradientPaintTransformType.CENTER_VERTICAL));
        assertFalse(item1.equals(item2));
        item2.setFillPaintTransformer(new StandardGradientPaintTransformer(
                GradientPaintTransformType.CENTER_VERTICAL));
        assertEquals(item1, item2);

        // labelFont
        item1.setLabelFont(new Font("Dialog", Font.PLAIN, 13));
        assertFalse(item1.equals(item2));
        item2.setLabelFont(new Font("Dialog", Font.PLAIN, 13));
        assertEquals(item1, item2);

        // labelPaint
        item1.setLabelPaint(Color.RED);
        assertFalse(item1.equals(item2));
        item2.setLabelPaint(Color.RED);
        assertEquals(item1, item2);

        // fillPaint
        item1.setFillPaint(new GradientPaint(1.0f, 2.0f, Color.GREEN, 3.0f,
                4.0f, Color.BLUE));
        assertFalse(item1.equals(item2));
        item2.setFillPaint(new GradientPaint(1.0f, 2.0f, Color.GREEN, 3.0f,
                4.0f, Color.BLUE));
        assertEquals(item1, item2);

        // outlinePaint
        item1.setOutlinePaint(new GradientPaint(1.1f, 2.2f, Color.GREEN, 3.3f,
                4.4f, Color.BLUE));
        assertFalse(item1.equals(item2));
        item2.setOutlinePaint(new GradientPaint(1.1f, 2.2f, Color.GREEN, 3.3f,
                4.4f, Color.BLUE));
        assertEquals(item1, item2);

        // linePaint
        item1.setLinePaint(new GradientPaint(0.1f, 0.2f, Color.GREEN, 0.3f,
                0.4f, Color.BLUE));
        assertFalse(item1.equals(item2));
        item2.setLinePaint(new GradientPaint(0.1f, 0.2f, Color.GREEN, 0.3f,
                0.4f, Color.BLUE));
        assertEquals(item1, item2);
    }

    