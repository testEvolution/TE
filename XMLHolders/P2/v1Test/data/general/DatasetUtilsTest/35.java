@Test
    public void testFindStackedRangeBounds_CategoryDataset3() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        KeyToGroupMap map = new KeyToGroupMap("Group A");
        Range r = DatasetUtils.findStackedRangeBounds(dataset, map);
        assertTrue(r == null);

        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R2", "C1");
        dataset.addValue(3.0, "R3", "C1");
        dataset.addValue(4.0, "R4", "C1");

        map.mapKeyToGroup("R1", "Group A");
        map.mapKeyToGroup("R2", "Group A");
        map.mapKeyToGroup("R3", "Group B");
        map.mapKeyToGroup("R4", "Group B");

        r = DatasetUtils.findStackedRangeBounds(dataset, map);
        assertEquals(0.0, r.getLowerBound(), EPSILON);
        assertEquals(7.0, r.getUpperBound(), EPSILON);

        dataset.addValue(null, "R5", "C1");
        r = DatasetUtils.findStackedRangeBounds(dataset, map);
        assertEquals(0.0, r.getLowerBound(), EPSILON);
        assertEquals(7.0, r.getUpperBound(), EPSILON);

        dataset.addValue(Double.NaN, "R6", "C1");
        r = DatasetUtils.findStackedRangeBounds(dataset, map);
        assertEquals(0.0, r.getLowerBound(), EPSILON);
        assertEquals(7.0, r.getUpperBound(), EPSILON);
    }

    