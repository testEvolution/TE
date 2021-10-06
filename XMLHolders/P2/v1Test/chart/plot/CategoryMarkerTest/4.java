@Test
    public void testGetSetKey() {
        CategoryMarker m = new CategoryMarker("X");
        m.addChangeListener(this);
        this.lastEvent = null;
        assertEquals("X", m.getKey());
        m.setKey("Y");
        assertEquals("Y", m.getKey());
        assertEquals(m, this.lastEvent.getMarker());

        // check null argument...
        try {
            m.setKey(null);
            fail("Expected an IllegalArgumentException for null.");
        }
        catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    