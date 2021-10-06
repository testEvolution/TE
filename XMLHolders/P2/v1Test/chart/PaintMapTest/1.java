@Test
    public void testPut() {
        PaintMap m1 = new PaintMap();
        m1.put("A", Color.RED);
        assertEquals(Color.RED, m1.getPaint("A"));

        // a null key should throw an IllegalArgumentException

        try {
            m1.put(null, Color.BLUE);
            fail("IllegalArgumentException should have been thrown on null key");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Null 'key' argument.", e.getMessage());
        }
    }

    