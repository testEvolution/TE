@Test
    public void testEquals() {
        CustomCategoryURLGenerator g1 = new CustomCategoryURLGenerator();
        CustomCategoryURLGenerator g2 = new CustomCategoryURLGenerator();
        assertTrue(g1.equals(g2));
        List<String> u1 = new ArrayList<>();
        u1.add("URL A1");
        u1.add("URL A2");
        u1.add("URL A3");
        g1.addURLSeries(u1);
        assertFalse(g1.equals(g2));
        List<String> u2 = new ArrayList<>();
        u2.add("URL A1");
        u2.add("URL A2");
        u2.add("URL A3");
        g2.addURLSeries(u2);
        assertTrue(g1.equals(g2));
    }

    