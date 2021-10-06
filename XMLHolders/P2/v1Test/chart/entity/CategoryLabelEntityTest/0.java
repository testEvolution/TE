@Test
    public void testEquals() {
        CategoryLabelEntity e1 = new CategoryLabelEntity("A",
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), "ToolTip", "URL");
        CategoryLabelEntity e2 = new CategoryLabelEntity("A",
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), "ToolTip", "URL");
        assertTrue(e1.equals(e2));

        e1 = new CategoryLabelEntity("B", new Rectangle2D.Double(1.0, 2.0,
                3.0, 4.0), "ToolTip", "URL");
        assertFalse(e1.equals(e2));
        e2 = new CategoryLabelEntity("B", new Rectangle2D.Double(1.0, 2.0,
                3.0, 4.0), "ToolTip", "URL");
        assertTrue(e1.equals(e2));

        e1.setArea(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0));
        assertFalse(e1.equals(e2));
        e2.setArea(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0));
        assertTrue(e1.equals(e2));

        e1.setToolTipText("New ToolTip");
        assertFalse(e1.equals(e2));
        e2.setToolTipText("New ToolTip");
        assertTrue(e1.equals(e2));

        e1.setURLText("New URL");
        assertFalse(e1.equals(e2));
        e2.setURLText("New URL");
        assertTrue(e1.equals(e2));
    }

    