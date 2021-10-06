@Test
    public void testEquals() {
        CategoryLabelPositions p1 = new CategoryLabelPositions(
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER));
        CategoryLabelPositions p2 = new CategoryLabelPositions(
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER));
        assertEquals(p1, p2);

        p1 = new CategoryLabelPositions(
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER));
        assertTrue(!p1.equals(p2));
        p2 = new CategoryLabelPositions(
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER));
        assertTrue(p1.equals(p2));

        p1 = new CategoryLabelPositions(
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_BOTTOM, TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER));
        assertTrue(!p1.equals(p2));
        p2 = new CategoryLabelPositions(
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER));
        assertTrue(p1.equals(p2));

        p1 = new CategoryLabelPositions(
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER));
        assertTrue(!p1.equals(p2));
        p2 = new CategoryLabelPositions(
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_TOP, TextBlockAnchor.CENTER));
        assertTrue(p1.equals(p2));

        p1 = new CategoryLabelPositions(
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER));
        assertTrue(!p1.equals(p2));
        p2 = new CategoryLabelPositions(
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER),
                new CategoryLabelPosition(RA_BOTTOM,
                        TextBlockAnchor.TOP_CENTER));
        assertTrue(p1.equals(p2));
    }

    