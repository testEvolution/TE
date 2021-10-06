@Test
    public void test1701822() {
        DefaultBoxAndWhiskerCategoryDataset dataset
                = new DefaultBoxAndWhiskerCategoryDataset();
        try {
            dataset.add(new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 
                    null, 8.0, new ArrayList<Double>()), "ROW1", "COLUMN1");
            dataset.add(new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0,
                    null, new ArrayList<Double>()), "ROW1", "COLUMN2");
        }
        catch (NullPointerException e) {
            assertTrue(false);
        }

    }

    