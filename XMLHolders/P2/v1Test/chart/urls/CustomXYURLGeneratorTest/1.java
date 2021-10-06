@Test
    public void testCloning() throws CloneNotSupportedException {
        CustomXYURLGenerator g1 = new CustomXYURLGenerator();
        List<String> u1 = new ArrayList<>();
        u1.add("URL A1");
        u1.add("URL A2");
        u1.add("URL A3");
        g1.addURLSeries(u1);
        CustomXYURLGenerator g2 = (CustomXYURLGenerator) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));

        // check independence
        List<String> u2 = new ArrayList<>();
        u2.add("URL XXX");
        g1.addURLSeries(u2);
        assertFalse(g1.equals(g2));
        g2.addURLSeries(new ArrayList<>(u2));
        assertTrue(g1.equals(g2));
    }

    