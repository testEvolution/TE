@Test
    public void testBackgroundListener() {
        DialPlot p = new DialPlot();
        DialBackground b1 = new DialBackground(Color.RED);
        p.setBackground(b1);
        p.addChangeListener(this);
        this.lastEvent = null;
        b1.setPaint(Color.BLUE);
        assertNotNull(this.lastEvent);

        DialBackground b2 = new DialBackground(Color.GREEN);
        p.setBackground(b2);
        this.lastEvent = null;
        b1.setPaint(Color.RED);
        assertNull(this.lastEvent);
        b2.setPaint(Color.RED);
        assertNotNull(this.lastEvent);
    }

    