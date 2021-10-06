@Test
    public void testGetPaint() {
        PaintMap m1 = new PaintMap();
        assertEquals(null, m1.getPaint("A"));
        m1.put("A", Color.RED);
        assertEquals(Color.RED, m1.getPaint("A"));
        m1.put("A", null);
        assertEquals(null, m1.getPaint("A"));

        // a null key should throw an IllegalArgumentException
        try {
            m1.getPaint(null);
            fail("IllegalArgumentException should have been thrown on passing null value");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Null 'key' argument.", e.getMessage());
        }
    }

    