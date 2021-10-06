@Test
    public void testAddRangeMarker() {
        XYPlot plot = new XYPlot();
        Marker m = new ValueMarker(1.0);
        plot.addRangeMarker(m);
        List listeners = Arrays.asList(m.getListeners(
                MarkerChangeListener.class));
        assertTrue(listeners.contains(plot));
        plot.clearRangeMarkers();
        listeners = Arrays.asList(m.getListeners(MarkerChangeListener.class));
        assertFalse(listeners.contains(plot));
    }

    