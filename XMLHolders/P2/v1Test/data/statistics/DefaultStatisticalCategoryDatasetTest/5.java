@Test
    public void testAdd() {
        DefaultStatisticalCategoryDataset d1
                = new DefaultStatisticalCategoryDataset();
        d1.add(1.0, 2.0, "R1", "C1");
        assertEquals(1.0, d1.getValue("R1", "C1").doubleValue(), EPSILON);
        assertEquals(2.0, d1.getStdDevValue("R1", "C1").doubleValue(), EPSILON);

        // overwrite the value
        d1.add(10.0, 20.0, "R1", "C1");
        assertEquals(10.0, d1.getValue("R1", "C1").doubleValue(), EPSILON);
        assertEquals(20.0, d1.getStdDevValue("R1", "C1").doubleValue(), EPSILON);
    }

    