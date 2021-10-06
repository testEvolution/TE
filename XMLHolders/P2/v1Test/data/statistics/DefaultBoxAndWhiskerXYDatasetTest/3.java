@Test
    public void testAdd() {
        DefaultBoxAndWhiskerXYDataset dataset
                = new DefaultBoxAndWhiskerXYDataset("S1");
        BoxAndWhiskerItem item1 = new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0,
                5.0, 6.0, 7.0, 8.0, new ArrayList<Double>());
        dataset.add(new Date(33L), item1);

        assertEquals(1.0, dataset.getY(0, 0).doubleValue(), EPSILON);
        assertEquals(1.0, dataset.getMeanValue(0, 0).doubleValue(), EPSILON);
        assertEquals(2.0, dataset.getMedianValue(0, 0).doubleValue(), EPSILON);
        assertEquals(3.0, dataset.getQ1Value(0, 0).doubleValue(), EPSILON);
        assertEquals(4.0, dataset.getQ3Value(0, 0).doubleValue(), EPSILON);
        assertEquals(5.0, dataset.getMinRegularValue(0, 0).doubleValue(),
                EPSILON);
        assertEquals(6.0, dataset.getMaxRegularValue(0, 0).doubleValue(),
                EPSILON);
        assertEquals(7.0, dataset.getMinOutlier(0, 0).doubleValue(), EPSILON);
        assertEquals(8.0, dataset.getMaxOutlier(0, 0).doubleValue(), EPSILON);
        assertEquals(new Range(5.0, 6.0), dataset.getRangeBounds(false));
    }

    