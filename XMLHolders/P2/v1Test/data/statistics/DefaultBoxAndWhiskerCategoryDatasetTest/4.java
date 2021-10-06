@Test
    public void testAdd() {
        DefaultBoxAndWhiskerCategoryDataset dataset
                = new DefaultBoxAndWhiskerCategoryDataset();
        BoxAndWhiskerItem item1 = new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0,
                5.0, 6.0, 7.0, 8.0, new ArrayList<Double>());
        dataset.add(item1, "R1", "C1");

        assertEquals(2.0, dataset.getValue("R1", "C1").doubleValue(), EPSILON);
        assertEquals(1.0, dataset.getMeanValue("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(2.0, dataset.getMedianValue("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(3.0, dataset.getQ1Value("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(4.0, dataset.getQ3Value("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(5.0, dataset.getMinRegularValue("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(6.0, dataset.getMaxRegularValue("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(7.0, dataset.getMinOutlier("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(8.0, dataset.getMaxOutlier("R1", "C1").doubleValue(),
                EPSILON);
        assertEquals(new Range(7.0, 8.0), dataset.getRangeBounds(false));
    }

    