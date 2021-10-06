@Test
    public void testPut() {
        StrokeMap m1 = new StrokeMap();
        m1.put("A", new BasicStroke(1.1f));
        assertEquals(new BasicStroke(1.1f), m1.getStroke("A"));

        // a null key should throw an IllegalArgumentException
        boolean pass = false;
        try {
            m1.put(null, new BasicStroke(1.1f));
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    