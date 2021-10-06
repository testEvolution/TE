@Test
    public void testFindDomainBounds() {
        AbstractXYItemRenderer renderer = new StandardXYItemRenderer();

        // check the bounds of a simple dataset
        XYDataset dataset = createDataset1();
        Range r = renderer.findDomainBounds(dataset);
        assertEquals(1.0, r.getLowerBound(), EPSILON);
        assertEquals(3.0, r.getUpperBound(), EPSILON);

        // check that a null dataset returns null bounds
        assertTrue(renderer.findDomainBounds(null) == null);
    }

    