@Test
    public void testLayerListener() {
        DialPlot p = new DialPlot();
        DialBackground b1 = new DialBackground(Color.RED);
        p.addLayer(b1);
        p.addChangeListener(this);
        this.lastEvent = null;
        b1.setPaint(Color.BLUE);
        assertNotNull(this.lastEvent);

        DialBackground b2 = new DialBackground(Color.GREEN);
        p.addLayer(b2);
        this.lastEvent = null;
        b1.setPaint(Color.RED);
        assertNotNull(this.lastEvent);
        b2.setPaint(Color.GREEN);
        assertNotNull(this.lastEvent);

        p.removeLayer(b2);
        this.lastEvent = null;
        b2.setPaint(Color.RED);
        assertNull(this.lastEvent);
    }

}