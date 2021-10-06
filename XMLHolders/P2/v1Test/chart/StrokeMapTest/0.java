@Test
    public void testGetStroke() {
        StrokeMap m1 = new StrokeMap();
        assertEquals(null, m1.getStroke("A"));
        m1.put("A", new BasicStroke(1.1f));
        assertEquals(new BasicStroke(1.1f), m1.getStroke("A"));
        m1.put("A", null);
        assertEquals(null, m1.getStroke("A"));

        // a null key should throw an IllegalArgumentException
        boolean pass = false;
        try {
            m1.getStroke(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    