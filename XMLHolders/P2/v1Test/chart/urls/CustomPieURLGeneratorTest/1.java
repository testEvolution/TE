@Test
    public void testCloning() throws CloneNotSupportedException {
        CustomPieURLGenerator g1 = new CustomPieURLGenerator();
        Map<String, String> m1 = new HashMap<>();
        m1.put("A", "http://www.jfree.org/");
        g1.addURLs(m1);
        CustomPieURLGenerator g2 = (CustomPieURLGenerator) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));

        // check independence
        Map<String, String> m2 = new HashMap<>();
        m2.put("B", "XYZ");
        g1.addURLs(m2);
        assertFalse(g1.equals(g2));
    }

    