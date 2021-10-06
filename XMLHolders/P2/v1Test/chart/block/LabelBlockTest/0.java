@Test
    public void testEquals() {
        LabelBlock b1 = new LabelBlock("ABC", new Font("Dialog",
                Font.PLAIN, 12), Color.RED);
        LabelBlock b2 = new LabelBlock("ABC", new Font("Dialog",
                Font.PLAIN, 12), Color.RED);
        assertTrue(b1.equals(b2));
        assertTrue(b2.equals(b2));

        b1 = new LabelBlock("XYZ", new Font("Dialog", Font.PLAIN, 12),
                Color.RED);
        assertFalse(b1.equals(b2));
        b2 = new LabelBlock("XYZ", new Font("Dialog", Font.PLAIN, 12),
                Color.RED);
        assertTrue(b1.equals(b2));

        b1 = new LabelBlock("XYZ", new Font("Dialog", Font.BOLD, 12),
                Color.RED);
        assertFalse(b1.equals(b2));
        b2 = new LabelBlock("XYZ", new Font("Dialog", Font.BOLD, 12),
                Color.RED);
        assertTrue(b1.equals(b2));

        b1 = new LabelBlock("XYZ", new Font("Dialog", Font.BOLD, 12),
                Color.BLUE);
        assertFalse(b1.equals(b2));
        b2 = new LabelBlock("XYZ", new Font("Dialog", Font.BOLD, 12),
                Color.BLUE);
        assertTrue(b1.equals(b2));

        b1.setToolTipText("Tooltip");
        assertFalse(b1.equals(b2));
        b2.setToolTipText("Tooltip");
        assertTrue(b1.equals(b2));

        b1.setURLText("URL");
        assertFalse(b1.equals(b2));
        b2.setURLText("URL");
        assertTrue(b1.equals(b2));

        b1.setContentAlignmentPoint(TextBlockAnchor.CENTER_RIGHT);
        assertFalse(b1.equals(b2));
        b2.setContentAlignmentPoint(TextBlockAnchor.CENTER_RIGHT);
        assertTrue(b1.equals(b2));

        b1.setTextAnchor(RectangleAnchor.BOTTOM_RIGHT);
        assertFalse(b1.equals(b2));
        b2.setTextAnchor(RectangleAnchor.BOTTOM_RIGHT);
        assertTrue(b1.equals(b2));
    }

    