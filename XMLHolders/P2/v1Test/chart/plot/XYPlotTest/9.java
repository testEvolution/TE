@Test
    public void testCloning3() throws CloneNotSupportedException {
        XYPlot p1 = new XYPlot(null, new NumberAxis("Domain Axis"),
                new NumberAxis("Range Axis"), new StandardXYItemRenderer());
        LegendItemCollection c1 = new LegendItemCollection();
        p1.setFixedLegendItems(c1);
        XYPlot p2 = (XYPlot) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));

        // verify independence of fixed legend item collection
        c1.add(new LegendItem("X"));
        assertFalse(p1.equals(p2));
    }

    