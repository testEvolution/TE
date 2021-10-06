@Test
    public void testGeneral() {
        DefaultHeatMapDataset d = new DefaultHeatMapDataset(10, 5, 0.0, 9.0,
                0.0, 5.0);
        assertEquals(10, d.getXSampleCount());
        assertEquals(5, d.getYSampleCount());
        assertEquals(0.0, d.getMinimumXValue(), EPSILON);
        assertEquals(9.0, d.getMaximumXValue(), EPSILON);
        assertEquals(0.0, d.getMinimumYValue(), EPSILON);
        assertEquals(5.0, d.getMaximumYValue(), EPSILON);
        assertEquals(0.0, d.getZValue(0, 0), EPSILON);
        d.addChangeListener(this);
        d.setZValue(0, 0, 1.0, false);
        assertEquals(1.0, d.getZValue(0, 0), EPSILON);
        assertNull(this.lastEvent);
        d.setZValue(1, 2, 2.0);
        assertEquals(2.0, d.getZValue(1, 2), EPSILON);
        assertNotNull(this.lastEvent);
    }

    