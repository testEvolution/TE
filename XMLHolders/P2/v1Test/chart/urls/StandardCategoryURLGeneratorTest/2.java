@Test
    public void testEquals() {
        StandardCategoryURLGenerator g1 = new StandardCategoryURLGenerator();
        StandardCategoryURLGenerator g2 = new StandardCategoryURLGenerator();
        assertTrue(g1.equals(g2));

        g1 = new StandardCategoryURLGenerator("index2.html?");
        assertFalse(g1.equals(g2));
        g2 = new StandardCategoryURLGenerator("index2.html?");
        assertTrue(g1.equals(g2));

        g1 = new StandardCategoryURLGenerator("index2.html?", "A", "B");
        assertFalse(g1.equals(g2));
        g2 = new StandardCategoryURLGenerator("index2.html?", "A", "B");
        assertTrue(g1.equals(g2));

        g1 = new StandardCategoryURLGenerator("index2.html?", "A", "C");
        assertFalse(g1.equals(g2));
        g2 = new StandardCategoryURLGenerator("index2.html?", "A", "C");
        assertTrue(g1.equals(g2));
    }

    