@Test
    public void testFindDomainBounds() {
        AbstractXYItemRenderer renderer = new ClusteredXYBarRenderer();
        XYDataset dataset = createSampleDataset1();
        Range r = renderer.findDomainBounds(dataset);
        assertEquals(0.9, r.getLowerBound(), EPSILON);
        assertEquals(13.1, r.getUpperBound(), EPSILON);

        renderer = new ClusteredXYBarRenderer(0.0, true);
        r = renderer.findDomainBounds(dataset);
        assertEquals(0.8, r.getLowerBound(), EPSILON);
        assertEquals(13.0, r.getUpperBound(), EPSILON);

        // check that a null dataset returns null bounds
        assertTrue(renderer.findDomainBounds(null) == null);
    }

    