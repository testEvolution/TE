@Test
    public void testGenerateLabel() {
        StandardCategoryItemLabelGenerator g
                = new StandardCategoryItemLabelGenerator("{2}",
                new DecimalFormat("0.000"));
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R0", "C0");
        dataset.addValue(2.0, "R0", "C1");
        dataset.addValue(3.0, "R1", "C0");
        dataset.addValue(null, "R1", "C1");
        String s = g.generateLabel(dataset, 0, 0);
        assertTrue(s.startsWith("1"));
        assertTrue(s.endsWith("000"));

        // try a null value
        s = g.generateLabel(dataset, 1, 1);
        assertEquals("-", s);
    }

    