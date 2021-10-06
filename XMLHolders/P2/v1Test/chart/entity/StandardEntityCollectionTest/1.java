@Test
    public void testCloning() throws CloneNotSupportedException {
        PieSectionEntity e1 = new PieSectionEntity(new Rectangle2D.Double(1.0,
                2.0, 3.0, 4.0), new DefaultPieDataset(), 0, 1, "Key",
                "ToolTip", "URL");
        StandardEntityCollection c1 = new StandardEntityCollection();
        c1.add(e1);
        StandardEntityCollection c2 = (StandardEntityCollection) c1.clone();
        assertTrue(c1 != c2);
        assertTrue(c1.getClass() == c2.getClass());
        assertTrue(c1.equals(c2));

        // check independence
        c1.clear();
        assertFalse(c1.equals(c2));
        c2.clear();
        assertTrue(c1.equals(c2));
    }

    