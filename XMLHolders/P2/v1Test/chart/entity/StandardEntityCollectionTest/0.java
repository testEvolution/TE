@Test
    public void testEquals() {
        StandardEntityCollection c1 = new StandardEntityCollection();
        StandardEntityCollection c2 = new StandardEntityCollection();
        assertTrue(c1.equals(c2));

        PieSectionEntity e1 = new PieSectionEntity(new Rectangle2D.Double(1.0,
                2.0, 3.0, 4.0), new DefaultPieDataset(), 0, 1, "Key",
                "ToolTip", "URL");
        c1.add(e1);
        assertFalse(c1.equals(c2));
        PieSectionEntity e2 = new PieSectionEntity(new Rectangle2D.Double(1.0,
                2.0, 3.0, 4.0), new DefaultPieDataset(), 0, 1, "Key",
                "ToolTip", "URL");
        c2.add(e2);
        assertTrue(c1.equals(c2));
    }

    