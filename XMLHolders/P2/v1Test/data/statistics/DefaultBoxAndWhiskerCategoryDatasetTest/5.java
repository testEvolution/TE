@Test
    public void testAddUpdatesCachedRange() {
        DefaultBoxAndWhiskerCategoryDataset dataset
                = new DefaultBoxAndWhiskerCategoryDataset();
        BoxAndWhiskerItem item1 = new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0,
                5.0, 6.0, 7.0, 8.0, new ArrayList<Double>());
        dataset.add(item1, "R1", "C1");

        // now overwrite this item with another
        BoxAndWhiskerItem item2 = new BoxAndWhiskerItem(1.5, 2.5, 3.5, 4.5,
                5.5, 6.5, 7.5, 8.5, new ArrayList<Double>());
        dataset.add(item2, "R1", "C1");

        assertEquals(2.5, dataset.getValue("R1", "C1").doubleValue(), EPSILON);
        assertEquals(1.5, dataset.getMeanValue("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(2.5, dataset.getMedianValue("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(3.5, dataset.getQ1Value("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(4.5, dataset.getQ3Value("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(5.5, dataset.getMinRegularValue("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(6.5, dataset.getMaxRegularValue("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(7.5, dataset.getMinOutlier("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(8.5, dataset.getMaxOutlier("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(new Range(7.5, 8.5), dataset.getRangeBounds(false));
    }

    