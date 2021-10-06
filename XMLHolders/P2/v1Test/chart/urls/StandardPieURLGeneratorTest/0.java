@Test
    public void testEquals() {
        StandardPieURLGenerator g1 = new StandardPieURLGenerator();
        StandardPieURLGenerator g2 = new StandardPieURLGenerator();
        assertTrue(g1.equals(g2));

        g1 = new StandardPieURLGenerator("prefix", "category", "index");
        assertFalse(g1.equals(g2));
        g2 = new StandardPieURLGenerator("prefix", "category", "index");
        assertTrue(g1.equals(g2));

        g1 = new StandardPieURLGenerator("prefix2", "category", "index");
        assertFalse(g1.equals(g2));
        g2 = new StandardPieURLGenerator("prefix2", "category", "index");
        assertTrue(g1.equals(g2));

        g1 = new StandardPieURLGenerator("prefix2", "category2", "index");
        assertFalse(g1.equals(g2));
        g2 = new StandardPieURLGenerator("prefix2", "category2", "index");
        assertTrue(g1.equals(g2));

        g1 = new StandardPieURLGenerator("prefix2", "category2", "index2");
        assertFalse(g1.equals(g2));
        g2 = new StandardPieURLGenerator("prefix2", "category2", "index2");
        assertTrue(g1.equals(g2));

        g1 = new StandardPieURLGenerator("prefix2", "category2", null);
        assertFalse(g1.equals(g2));
        g2 = new StandardPieURLGenerator("prefix2", "category2", null);
        assertTrue(g1.equals(g2));
    }

    