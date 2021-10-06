@Test
    public void testEquals() {
        PieSectionEntity e1 = new PieSectionEntity(new Rectangle2D.Double(
                1.0, 2.0, 3.0, 4.0), new DefaultPieDataset(), 1, 2, "Key",
                "ToolTip", "URL");
        PieSectionEntity e2 = new PieSectionEntity(new Rectangle2D.Double(1.0,
                2.0, 3.0, 4.0), new DefaultPieDataset(), 1, 2, "Key",
                "ToolTip", "URL");
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

        e1.setDataset(null);
        assertFalse(e1.equals(e2));
        e2.setDataset(null);
        assertTrue(e1.equals(e2));

        e1.setPieIndex(99);
        assertFalse(e1.equals(e2));
        e2.setPieIndex(99);
        assertTrue(e1.equals(e2));

        e1.setSectionIndex(66);
        assertFalse(e1.equals(e2));
        e2.setSectionIndex(66);
        assertTrue(e1.equals(e2));

        e1.setSectionKey("ABC");
        assertFalse(e1.equals(e2));
        e2.setSectionKey("ABC");
        assertTrue(e1.equals(e2));
    }

    