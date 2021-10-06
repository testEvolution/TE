@Test
    public void testRemove() {
        DefaultStatisticalCategoryDataset data
                = new DefaultStatisticalCategoryDataset();

        boolean pass = false;
        try {
            data.remove("R1", "R2");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);
        data.add(1.0, 0.5, "R1", "C1");
        assertEquals(new Range(1.0, 1.0), data.getRangeBounds(false));
        assertEquals(new Range(0.5, 1.5), data.getRangeBounds(true));

        data.add(1.4, 0.2, "R2", "C1");

        assertEquals(1.0, data.getRangeLowerBound(false), EPSILON);
        assertEquals(1.4, data.getRangeUpperBound(false), EPSILON);
        assertEquals(0.5, data.getRangeLowerBound(true), EPSILON);
        assertEquals(1.6, data.getRangeUpperBound(true), EPSILON);

        data.remove("R1", "C1");

        assertEquals(1.4, data.getRangeLowerBound(false), EPSILON);
        assertEquals(1.4, data.getRangeUpperBound(false), EPSILON);
        assertEquals(1.2, data.getRangeLowerBound(true), EPSILON);
        assertEquals(1.6, data.getRangeUpperBound(true), EPSILON);
    }

    