@Test
    public void testEquals() {
        TickLabelEntity e1 = new TickLabelEntity(new Rectangle2D.Double(1.0,
                2.0, 3.0, 4.0), "ToolTip", "URL");
        TickLabelEntity e2 = new TickLabelEntity(new Rectangle2D.Double(1.0,
                2.0, 3.0, 4.0), "ToolTip", "URL");
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

    