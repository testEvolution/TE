@Test
    public void testGenerateLabel() {
        StandardCategorySeriesLabelGenerator g
                = new StandardCategorySeriesLabelGenerator("{0}");
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R0", "C0");
        dataset.addValue(2.0, "R0", "C1");
        dataset.addValue(3.0, "R1", "C0");
        dataset.addValue(null, "R1", "C1");
        String s = g.generateLabel(dataset, 0);
        assertEquals("R0", s);
    }

    