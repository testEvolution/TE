@Test
    public void testSetSeriesKeys() {
        // check an empty dataset
        DefaultIntervalCategoryDataset empty
                = new DefaultIntervalCategoryDataset(new double[0][0],
                        new double[0][0]);
        boolean pass = true;
        try {
            empty.setSeriesKeys(new String[0]);
        }
        catch (RuntimeException e) {
            pass = false;
        }
        assertTrue(pass);
    }

    