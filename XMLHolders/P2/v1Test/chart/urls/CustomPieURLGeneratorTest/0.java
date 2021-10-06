@Test
    public void testEquals() {
        CustomPieURLGenerator g1 = new CustomPieURLGenerator();
        CustomPieURLGenerator g2 = new CustomPieURLGenerator();
        assertTrue(g1.equals(g2));

        Map<String, String> m1 = new HashMap<>();
        m1.put("A", "http://www.jfree.org/");
        g1.addURLs(m1);
        assertFalse(g1.equals(g2));
        g2.addURLs(m1);
        assertTrue(g1.equals(g2));
    }

    