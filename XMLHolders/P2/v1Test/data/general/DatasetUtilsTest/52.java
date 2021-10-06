@Test
    public void testIterateToFindRangeBounds1_XYDataset() {
        // null dataset throws IllegalArgumentException
        boolean pass = false;
        try {
            DatasetUtils.iterateToFindRangeBounds(null, new ArrayList<String>(),
                    new Range(0.0, 1.0), true);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        // null list throws IllegalArgumentException
        pass = false;
        try {
            DatasetUtils.iterateToFindRangeBounds(new XYSeriesCollection(),
                    null, new Range(0.0, 1.0), true);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
        
        // null range throws IllegalArgumentException
        pass = false;
        try {
            DatasetUtils.iterateToFindRangeBounds(new XYSeriesCollection(),
                    new ArrayList<String>(), null, true);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    