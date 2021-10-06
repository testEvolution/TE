@Test
    public void testCloning() throws CloneNotSupportedException {
        MultipleXYSeriesLabelGenerator g1
                = new MultipleXYSeriesLabelGenerator();
        MultipleXYSeriesLabelGenerator g2 = (MultipleXYSeriesLabelGenerator) 
                g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));

        // check independence
        g1.addSeriesLabel(3, "Add3");
        assertFalse(g1.equals(g2));
        g2.addSeriesLabel(3, "Add3");
        assertTrue(g1.equals(g2));
    }

    