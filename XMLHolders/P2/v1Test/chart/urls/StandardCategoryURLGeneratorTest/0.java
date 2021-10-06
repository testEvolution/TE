@Test
    public void testGenerateURL() {
        StandardCategoryURLGenerator g1 = new StandardCategoryURLGenerator();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R2", "C2");
        dataset.addValue(3.0, "R&", "C&");
        assertEquals("index.html?series=R1&amp;category=C1",
                g1.generateURL(dataset, 0, 0));
        assertEquals("index.html?series=R1&amp;category=C2",
                g1.generateURL(dataset, 0, 1));
        assertEquals("index.html?series=R2&amp;category=C2",
                g1.generateURL(dataset, 1, 1));
        assertEquals("index.html?series=R%26&amp;category=C%26",
                g1.generateURL(dataset, 2, 2));
    }

    