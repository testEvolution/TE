@Test
    public void testGetSetOutlinePaint() {
        // we use ValueMarker for the tests, because we need a concrete
        // subclass...
        ValueMarker m = new ValueMarker(1.1);
        m.addChangeListener(this);
        this.lastEvent = null;
        assertEquals(Color.GRAY, m.getOutlinePaint());
        m.setOutlinePaint(Color.YELLOW);
        assertEquals(Color.YELLOW, m.getOutlinePaint());
        assertEquals(m, this.lastEvent.getMarker());

        // check null argument...
        m.setOutlinePaint(null);
        assertEquals(null, m.getOutlinePaint());
    }

    