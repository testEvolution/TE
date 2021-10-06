@Test
    public void testEquals() {
        DefaultBoxAndWhiskerCategoryDataset d1
                = new DefaultBoxAndWhiskerCategoryDataset();
        d1.add(new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0,
                new ArrayList<Double>()), "ROW1", "COLUMN1");
        DefaultBoxAndWhiskerCategoryDataset d2
                = new DefaultBoxAndWhiskerCategoryDataset();
        d2.add(new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0,
                new ArrayList<Double>()), "ROW1", "COLUMN1");
        assertTrue(d1.equals(d2));
        assertTrue(d2.equals(d1));
    }

    