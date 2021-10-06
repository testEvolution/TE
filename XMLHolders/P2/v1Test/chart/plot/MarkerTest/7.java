@Test
    public void testGetSetLabelPaint() {
        // we use ValueMarker for the tests, because we need a concrete
        // subclass...
        ValueMarker m = new ValueMarker(1.1);
        m.addChangeListener(this);
        this.lastEvent = null;
        assertEquals(Color.BLACK, m.getLabelPaint());
        m.setLabelPaint(Color.RED);
        assertEquals(Color.RED, m.getLabelPaint());
        assertEquals(m, this.lastEvent.getMarker());

        // check null argument...
        try {
            m.setLabelPaint(null);
            fail("Expected an IllegalArgumentException for null.");
        }
        catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    