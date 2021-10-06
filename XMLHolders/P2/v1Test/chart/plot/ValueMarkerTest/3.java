@Test
    public void testGetSetValue() {
        ValueMarker m = new ValueMarker(1.1);
        m.addChangeListener(this);
        this.lastEvent = null;
        assertEquals(1.1, m.getValue(), EPSILON);
        m.setValue(33.3);
        assertEquals(33.3, m.getValue(), EPSILON);
        assertEquals(m, this.lastEvent.getMarker());
    }

    